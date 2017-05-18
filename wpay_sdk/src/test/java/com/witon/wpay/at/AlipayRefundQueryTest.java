/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.at;

import org.junit.Test;

import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.alipay.AliSpTradeRefundQueryReq;
import com.witon.wpay.domain.resp.alipay.AliSpTradeRefundQueryResp;
import com.witon.wpay.request.AlipayTradeRefundQueryReq;
import com.witon.wpay.test.AbstractTest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: AlipayRefundQueryTest.java, v 0.1 2017年5月18日 下午4:46:41 song.li@witontek.com Exp $
 */
public class AlipayRefundQueryTest extends AbstractTest {

    // 20170518010000000000000000002123
    @Test
    public void test_trade_refund_queryl() {
        try {
            AlipayTradeRefundQueryReq request = new AlipayTradeRefundQueryReq();
            AliSpTradeRefundQueryReq c = new AliSpTradeRefundQueryReq();
            c.setWtTradeNo("20170518010000000000000000002123");
            c.setRefundNo("20170518010000000000000000002123");

            request.setBizReq(c);
            WitonResponse<AliSpTradeRefundQueryResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
