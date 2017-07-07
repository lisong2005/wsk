/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.test;

import org.junit.Test;

import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.wx.SpTradeQueryReq;
import com.witon.wpay.domain.resp.wx.SpTradeQueryResp;
import com.witon.wpay.request.wx.WxSpTradeQueryReq;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: TradeQueryTest.java, v 0.1 2017年4月27日 上午10:29:13 song.li@witontek.com Exp $
 */
public class TradeQueryTest extends AbstractTest {

    @Test
    public void test_trade_query() {
        try {
            WxSpTradeQueryReq request = new WxSpTradeQueryReq();
            SpTradeQueryReq c = new SpTradeQueryReq();
            c.setWxAppId("wx985bfeb7fc165525");
            c.setTradeNo("e86e649acb16495fb73c6fedfb0dd491");
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
