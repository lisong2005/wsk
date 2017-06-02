/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.rt.c2.wx;

import org.junit.Test;

import com.witon.wpay.WitonClient;
import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.wx.SpTradeQueryReq;
import com.witon.wpay.domain.resp.wx.SpTradeQueryResp;
import com.witon.wpay.request.WxSpTradeQueryReq;
import com.witon.wpay.rt.RtAbstractTest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WxTradeQueryTest.java, v 0.1 2017年5月24日 下午3:58:04 song.li@witontek.com Exp $
 */
public class WxTradeQueryTest extends RtAbstractTest {
    private WitonClient client = client2;

    @Test
    public void test_trade_query_001() {
        try {
            WxSpTradeQueryReq request = new WxSpTradeQueryReq();
            SpTradeQueryReq c = new SpTradeQueryReq();
            // c.setWxAppId("wx985bfeb7fc165525");
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

    @Test
    public void test_trade_query_002() {
        try {
            WxSpTradeQueryReq request = new WxSpTradeQueryReq();
            SpTradeQueryReq c = new SpTradeQueryReq();
            // c.setWxAppId("wx985bfeb7fc165525");
            c.setTradeNo("b3a832cf-5290-4aab-9e00-dcc64cd0f613");
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
