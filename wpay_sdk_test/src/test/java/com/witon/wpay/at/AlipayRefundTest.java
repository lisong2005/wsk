/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.at;

import org.junit.Test;

import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.alipay.AliSpTradeRefundReq;
import com.witon.wpay.domain.resp.alipay.AliSpTradeRefundResp;
import com.witon.wpay.request.AlipayTradeRefundReq;
import com.witon.wpay.test.AbstractTest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: AlipayRefundTest.java, v 0.1 2017年5月18日 下午4:50:02 song.li@witontek.com Exp $
 */
public class AlipayRefundTest extends AbstractTest {

    @Test
    public void test_trade_refund() {
        try {
            AlipayTradeRefundReq request = new AlipayTradeRefundReq();
            AliSpTradeRefundReq c = new AliSpTradeRefundReq();
            //            c.setWtTradeNo("20170602x10000000000000000004981");
            c.setTradeNo("e98e0149c7e6453abcd1b6d34c4d7e0d");
            c.setRefundNo("e98e0149c7e6453abcd1b6d34c4d7e0d");
            c.setRefundFee(1L);

            request.setBizReq(c);
            WitonResponse<AliSpTradeRefundResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
