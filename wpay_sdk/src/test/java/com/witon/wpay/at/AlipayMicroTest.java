/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.at;

import org.junit.Test;

import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.alipay.AliSpMicropayCreateReq;
import com.witon.wpay.domain.req.alipay.AliSpTradeQueryReq;
import com.witon.wpay.domain.resp.alipay.AliSpMicropayCreateResp;
import com.witon.wpay.domain.resp.alipay.AliSpTradeQueryResp;
import com.witon.wpay.request.AlipayMicropayCreateReq;
import com.witon.wpay.request.AlipayTradeQueryReq;
import com.witon.wpay.test.AbstractTest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: AlipayMicroTest.java, v 0.1 2017年5月16日 上午9:53:59 song.li@witontek.com Exp $
 */
public class AlipayMicroTest extends AbstractTest {

    @Test
    public void test_trade_create() {
        try {
            AlipayMicropayCreateReq request = new AlipayMicropayCreateReq();
            AliSpMicropayCreateReq c = new AliSpMicropayCreateReq();
            c.setSubject("subject");
            c.setScene("bar_code");
            c.setBody("body");
            c.setNotifyUrl(NOTIFY_URL);
            c.setTotalFee(1L);
            c.setTradeNo("ls_test_005");
            c.setAuthCode("286906258610228630");

            request.setBizReq(c);
            WitonResponse<AliSpMicropayCreateResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @Test
    public void test_trade_query() {
        try {
            // 7473c5abe11a43f2a73b7a0da15c2377
            AlipayTradeQueryReq request = new AlipayTradeQueryReq();
            AliSpTradeQueryReq c = new AliSpTradeQueryReq();
            c.setTradeNo("ls_test_004");

            request.setBizReq(c);
            WitonResponse<AliSpTradeQueryResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
