/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.test;

import org.junit.Test;

import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.wx.SpTradeReverseReq;
import com.witon.wpay.domain.resp.wx.SpTradeReverseResp;
import com.witon.wpay.request.WxSpTradeReverseReq;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: TradeReverseTest.java, v 0.1 2017年6月2日 上午11:17:50 song.li@witontek.com Exp $
 */
public class TradeReverseTest extends AbstractTest {

    // WxSpTradeReverseReq

    @Test
    public void test_trade_reverse() {
        try {
            WxSpTradeReverseReq request = new WxSpTradeReverseReq();
            SpTradeReverseReq c = new SpTradeReverseReq();
            c.setWxAppId("wx985bfeb7fc165525");
            c.setTradeNo("e98e0149c7e6453abcd1b6d34c4d7e0d");
            c.setWtTradeNo("");

            request.setBizReq(c);
            WitonResponse<SpTradeReverseResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
