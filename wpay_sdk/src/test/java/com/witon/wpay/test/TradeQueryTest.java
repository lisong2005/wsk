/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.witon.wpay.DefaultWitonClient;
import com.witon.wpay.TestConstants;
import com.witon.wpay.WitonClient;
import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.wx.SpTradeQueryReq;
import com.witon.wpay.domain.resp.wx.SpTradeQueryResp;
import com.witon.wpay.request.WxSpTradeQueryReq;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: TradeQueryTest.java, v 0.1 2017年4月27日 上午10:29:13 song.li@witontek.com Exp $
 */
public class TradeQueryTest implements TestConstants {
    /**
    * Logger for this class
    */
    private static final Logger logger = LoggerFactory.getLogger(TradeQueryTest.class);

    private static WitonClient  client = new DefaultWitonClient(WITON_PUB_KEY, YOUR_PRI_KEY,
        GATEWAY_URL, PID);

    @Test
    public void test_trade_query() {
        try {
            WxSpTradeQueryReq request = new WxSpTradeQueryReq();
            SpTradeQueryReq c = new SpTradeQueryReq();
            c.setWxAppId("wx985bfeb7fc165525");
            c.setTradeNo("364c1568321a427292f4b9970f2a4c33");
            c.setWtTradeNo("");

            request.setBizReq(c);
            WitonResponse<SpTradeQueryResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
