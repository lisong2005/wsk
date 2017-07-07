/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.at;

import org.junit.Test;

import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.alipay.AliSpTradeRefundReq;
import com.witon.wpay.domain.resp.alipay.AliSpTradeRefundResp;
import com.witon.wpay.request.alipay.AlipayTradeRefundReq;
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
            c.setTradeNo("fc1445b253f845918e9871ba3da234ae");
            c.setRefundNo("fc1445b253f845918e9871ba3da234ae");
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
