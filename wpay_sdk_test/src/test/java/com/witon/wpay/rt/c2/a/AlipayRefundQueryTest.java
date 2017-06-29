/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.rt.c2.a;

import org.junit.Test;

import com.witon.wpay.WitonClient;
import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.alipay.AliSpTradeRefundQueryReq;
import com.witon.wpay.domain.resp.alipay.AliSpTradeRefundQueryResp;
import com.witon.wpay.request.AlipayTradeRefundQueryReq;
import com.witon.wpay.rt.RtAbstractTest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: AlipayRefundQueryTest.java, v 0.1 2017年5月18日 下午4:46:41 song.li@witontek.com Exp $
 */
public class AlipayRefundQueryTest extends RtAbstractTest {

    private WitonClient client = client2;

    @Test
    public void test_trade_refund_query() {
        try {
            AlipayTradeRefundQueryReq request = new AlipayTradeRefundQueryReq();
            AliSpTradeRefundQueryReq c = new AliSpTradeRefundQueryReq();
            c.setRefundNo("57839b30-bb81-463b-a074-201c0725332e");

            request.setBizReq(c);
            WitonResponse<AliSpTradeRefundQueryResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
