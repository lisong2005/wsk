/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.rt.wx;

import org.junit.Test;

import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.wx.SpTradeQueryReq;
import com.witon.wpay.domain.req.wx.SpTradeRefundQueryReq;
import com.witon.wpay.domain.resp.wx.SpTradeQueryResp;
import com.witon.wpay.domain.resp.wx.SpTradeRefundQueryResp;
import com.witon.wpay.request.WxSpTradeQueryReq;
import com.witon.wpay.request.WxSpTradeRefundQueryReq;
import com.witon.wpay.rt.RtAbstractTest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WxRefundQueryTest.java, v 0.1 2017年5月25日 下午3:22:55 song.li@witontek.com Exp $
 */
public class WxRefundQueryTest extends RtAbstractTest {

    @Test
    public void test_trade_query_001() {
        try {
            WxSpTradeQueryReq request = new WxSpTradeQueryReq();
            SpTradeQueryReq c = new SpTradeQueryReq();
            // c.setWxAppId("wx985bfeb7fc165525");
            c.setTradeNo("364c1568321a427292f4b9970f2a4c33");
            c.setWtTradeNo("");

            request.setBizReq(c);
            WitonResponse<SpTradeQueryResp> resp = client1.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @Test
    public void test_trade_query_002() {
        try {
            WxSpTradeRefundQueryReq request = new WxSpTradeRefundQueryReq();
            SpTradeRefundQueryReq c = new SpTradeRefundQueryReq();
            c.setRefundNo("20170525020000000000000000000104");

            request.setBizReq(c);
            WitonResponse<SpTradeRefundQueryResp> resp = client2.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
