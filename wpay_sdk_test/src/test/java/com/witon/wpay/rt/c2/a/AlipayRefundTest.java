/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.rt.c2.a;

import org.junit.Test;

import com.witon.wpay.WitonClient;
import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.alipay.AliSpTradeRefundReq;
import com.witon.wpay.domain.resp.alipay.AliSpTradeRefundResp;
import com.witon.wpay.request.AlipayTradeRefundReq;
import com.witon.wpay.rt.RtAbstractTest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: AlipayRefundTest.java, v 0.1 2017年5月18日 下午4:50:02 song.li@witontek.com Exp $
 */
public class AlipayRefundTest extends RtAbstractTest {

    private WitonClient client = client2;

    @Test
    public void test_trade_refund() {
        try {
            AlipayTradeRefundReq request = new AlipayTradeRefundReq();
            AliSpTradeRefundReq c = new AliSpTradeRefundReq();
            c.setTradeNo("7f2fa0545a0a41119ff0e3e06ca68211");
            c.setRefundNo("7f2fa0545a0a41119ff0e3e06ca68211");
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
