/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.at;

import org.junit.Test;

import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.alipay.AliSpTradeCancelReq;
import com.witon.wpay.domain.resp.alipay.AliSpTradeCancelResp;
import com.witon.wpay.request.alipay.AlipayTradeCancelReq;
import com.witon.wpay.test.AbstractTest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: AlipayCancelTest.java, v 0.1 2017年5月18日 下午4:36:29 song.li@witontek.com Exp $
 */
public class AlipayCancelTest extends AbstractTest {

    @Test
    public void test_trade_cancel() {
        try {
            AlipayTradeCancelReq request = new AlipayTradeCancelReq();
            AliSpTradeCancelReq c = new AliSpTradeCancelReq();
            c.setTradeNo("7bf0af4380d943739fd9c668cd1f28ac");

            request.setBizReq(c);
            WitonResponse<AliSpTradeCancelResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
