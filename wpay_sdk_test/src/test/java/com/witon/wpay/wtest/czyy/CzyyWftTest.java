/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.wtest.czyy;

import java.util.UUID;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.witon.wpay.DefaultWitonClient;
import com.witon.wpay.WitonClient;
import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.wft.WftSpJspayCreateReq;
import com.witon.wpay.domain.req.wft.WftSpTradeCloseReq;
import com.witon.wpay.domain.req.wft.WftSpTradeQueryReq;
import com.witon.wpay.domain.req.wft.WftSpTradeRefundReq;
import com.witon.wpay.domain.resp.wft.WftSpJspayCreateResp;
import com.witon.wpay.domain.resp.wft.WftSpTradeCloseResp;
import com.witon.wpay.domain.resp.wft.WftSpTradeQueryResp;
import com.witon.wpay.domain.resp.wft.WftSpTradeRefundResp;
import com.witon.wpay.request.wft.WftSpJspayCreateRequest;
import com.witon.wpay.request.wft.WftSpTradeCloseRequest;
import com.witon.wpay.request.wft.WftSpTradeQueryRequest;
import com.witon.wpay.request.wft.WftSpTradeRefundRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: CzyyWftTest.java, v 0.1 2017年7月11日 上午10:01:07 song.li@witontek.com Exp $
 */
public class CzyyWftTest implements CZYYConstants {
    /**
    * Logger for this class
    */
    private static final Logger  logger = LoggerFactory.getLogger(CzyyWftTest.class);

    protected static WitonClient client = new DefaultWitonClient(WITON_PUB_KEY, pri_key,
        GATEWAY_URL, PID);

    @Test
    public void test_jspay_trade_create() {
        try {
            WftSpJspayCreateRequest request = new WftSpJspayCreateRequest();
            WftSpJspayCreateReq c = new WftSpJspayCreateReq();
            c.setWxAppId("wxe3177059a161c4a9");
            c.setOpenId("oG0PNvyC-BvZZcAr5kQpz1wKNiYg");
            c.setBody("威富通支付");
            c.setNotifyUrl(NOTIFY_URL);
            c.setTotalFee(1);
            c.setCreateIp("58.240.244.130");
            c.setTradeNo(UUID.randomUUID().toString().replaceAll("-", ""));

            request.setBizReq(c);
            WitonResponse<WftSpJspayCreateResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @Test
    public void test_trade_query() {
        try {
            WftSpTradeQueryRequest request = new WftSpTradeQueryRequest();
            WftSpTradeQueryReq c = new WftSpTradeQueryReq();
            c.setTradeNo("f4bac25bf87d4158bf1f4bf8fb932857");

            request.setBizReq(c);
            WitonResponse<WftSpTradeQueryResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @Test
    public void test_trade_close() {
        try {
            WftSpTradeCloseRequest request = new WftSpTradeCloseRequest();
            WftSpTradeCloseReq c = new WftSpTradeCloseReq();
            c.setTradeNo("f4bac25bf87d4158bf1f4bf8fb932857");
            c.setTradeNo("a9325bc204ab43e5a92f4b6734b88479");

            request.setBizReq(c);
            WitonResponse<WftSpTradeCloseResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @Test
    public void test_trade_refund() {
        try {
            WftSpTradeRefundRequest request = new WftSpTradeRefundRequest();
            WftSpTradeRefundReq c = new WftSpTradeRefundReq();
            c.setTradeNo("27c670dfb99f4b65b0e5f9a3ecddd168");
            c.setRefundNo("27c670dfb99f4b65b0e5f9a3ecddd168");
            c.setRefundFee(1L);
            c.setOpUserId("ooo");

            request.setBizReq(c);
            WitonResponse<WftSpTradeRefundResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }

}
