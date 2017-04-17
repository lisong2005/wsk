/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay;

import java.security.Security;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.witon.wpay.domain.req.AbstractRequest;
import com.witon.wpay.domain.resp.AbstractResponse;
import com.witon.wpay.util.EhJerseyClient;
import com.witon.wpay.util.JsonUtils;
import com.witon.wpay.util.SignUtils;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: DefaultWitonClient.java, v 0.1 2017年4月17日 下午1:30:24 song.li@witontek.com Exp $
 */
public class DefaultWitonClient implements WitonClient {
    /**
    * Logger for this class
    */
    private static final Logger logger   = LoggerFactory.getLogger(DefaultWitonClient.class);

    private String              witonPubKey;
    private String              yourPriKey;
    private String              gatewayUrl;
    private String              pid;
    private String              signType = "RSA2";
    private String              version  = "1.0";

    private Client              client   = EhJerseyClient.getJerseyClient();

    static {
        //清除安全设置
        Security.setProperty("jdk.certpath.disabledAlgorithms", "");
    }

    /**
     * @param witonPubKey
     * @param yourPriKey
     * @param gatewayUrl
     * @param pid
     */
    public DefaultWitonClient(String witonPubKey, String yourPriKey, String gatewayUrl,
                              String pid) {
        super();
        this.witonPubKey = witonPubKey;
        this.yourPriKey = yourPriKey;
        this.gatewayUrl = gatewayUrl;
        this.pid = pid;
    }

    /**
     * @param witonPubKey
     * @param yourPriKey
     * @param gatewayUrl
     * @param pid
     * @param signType
     * @param version
     */
    public DefaultWitonClient(String witonPubKey, String yourPriKey, String gatewayUrl, String pid,
                              String signType, String version) {
        super();
        this.witonPubKey = witonPubKey;
        this.yourPriKey = yourPriKey;
        this.gatewayUrl = gatewayUrl;
        this.pid = pid;
        this.signType = signType;
        this.version = version;
    }

    /** 
     * @see com.witon.wpay.WitonClient#exe(com.witon.wpay.WitonRequest)
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public <Q extends AbstractRequest, P extends AbstractResponse> WitonResponse<P> exe(WitonRequest<Q, P> request) {
        logger.info("{}", request);
        WitonResponse resp = null;

        try {
            JSONObject jsonReq = new JSONObject();
            jsonReq.put("app_id", this.pid);
            jsonReq.put("method", request.getMethod());
            jsonReq.put("sign_type", this.signType);
            jsonReq.put("version", this.version);
            jsonReq.put("timestamp", System.currentTimeMillis());
            jsonReq.put("biz_content", JsonUtils.convertObjToJson(request.getBizReq()));

            String sign = SignUtils.signRSA256(jsonReq.toMap(), this.yourPriKey);
            jsonReq.put("sign", sign);

            WebTarget target = client.target(this.gatewayUrl);
            resp = target.request(MediaType.APPLICATION_JSON_TYPE)
                .post(Entity.json(jsonReq.toString()), WitonResponse.class);
            logger.info("{}", resp);

            boolean verifyResult = SignUtils.verifySignRSA256(resp, resp.getSign(), witonPubKey);
            if (verifyResult == false) {
                throw new RuntimeException("verify sign error");
            }

            resp.setBizResp(
                JsonUtils.convertJsonToObj(resp.getRespContent(), request.getRespClazz()));
        } catch (JSONException e) {
            logger.error("", e);
        }

        return resp;
    }

}
