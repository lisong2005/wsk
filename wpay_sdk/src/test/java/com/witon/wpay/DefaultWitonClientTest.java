/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.witon.wpay.domain.resp.wx.SpTradeCloseyResp;
import com.witon.wpay.request.WxSpTradeCloseyReq;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: DefaultWitonClientTest.java, v 0.1 2017年4月17日 下午4:12:29 song.li@witontek.com Exp $
 */
public class DefaultWitonClientTest {
    /**
    * Logger for this class
    */
    private static final Logger logger = LoggerFactory.getLogger(DefaultWitonClientTest.class);

    @Test
    public void test_001() {

        String witonPubKey = "";
        String yourPriKey = "";
        String gatewayUrl = "";
        String pid = "";
        WitonClient client = new DefaultWitonClient(witonPubKey, yourPriKey, gatewayUrl, pid);

        WxSpTradeCloseyReq request = new WxSpTradeCloseyReq();
        WitonResponse<SpTradeCloseyResp> resp = client.exe(request);
        SpTradeCloseyResp bizResp = resp.getBizResp();
        logger.info("{}", resp);
        logger.info("{}", bizResp);
    }
}
