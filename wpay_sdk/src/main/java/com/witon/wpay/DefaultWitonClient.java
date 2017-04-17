/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.witon.wpay.domain.req.AbstractRequest;
import com.witon.wpay.domain.resp.AbstractResponse;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: DefaultWitonClient.java, v 0.1 2017年4月17日 下午1:30:24 song.li@witontek.com Exp $
 */
public class DefaultWitonClient implements WitonClient {
    /**
    * Logger for this class
    */
    private static final Logger logger = LoggerFactory.getLogger(DefaultWitonClient.class);

    private String              witonPubKey;
    private String              yourPriKey;
    private String              gatewayUrl;

    /** 
     * @see com.witon.wpay.WitonClient#exe(com.witon.wpay.WitonRequest)
     */
    @Override
    public <Q extends AbstractRequest, P extends AbstractResponse> WitonResponse<P> exe(WitonRequest<Q, P> request) {
        logger.info("{}", request);
        WitonResponse<P> ret = new WitonResponse<P>();

        return ret;
    }

}
