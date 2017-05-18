/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.un;

import java.util.UUID;

import org.junit.Test;

import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.alipay.AliSpTradeQueryReq;
import com.witon.wpay.domain.req.un.UnTradeCreateReq;
import com.witon.wpay.domain.resp.alipay.AliSpTradeQueryResp;
import com.witon.wpay.domain.resp.un.UnTradeCreateResp;
import com.witon.wpay.request.AlipayTradeQueryReq;
import com.witon.wpay.request.UnionTradeCreateReq;
import com.witon.wpay.test.AbstractTest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UnionCreateTest.java, v 0.1 2017年5月17日 上午8:35:32 song.li@witontek.com Exp $
 */
public class UnionCreateTest extends AbstractTest {

    @Test
    public void test_trade_create() {
        try {
            UnionTradeCreateReq request = new UnionTradeCreateReq();
            UnTradeCreateReq c = new UnTradeCreateReq();
            c.setBody("iphone6s");
            c.setNotifyUrl(NOTIFY_URL);
            c.setTotalFee(1111L);
            c.setTradeNo(UUID.randomUUID().toString());

            request.setBizReq(c);
            WitonResponse<UnTradeCreateResp> resp = client.exe(request);
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
