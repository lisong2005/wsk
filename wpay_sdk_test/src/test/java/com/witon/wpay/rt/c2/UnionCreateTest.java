/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.rt.c2;

import java.util.UUID;

import org.junit.Test;

import com.witon.wpay.WitonClient;
import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.un.UnTradeCreateReq;
import com.witon.wpay.domain.resp.un.UnTradeCreateResp;
import com.witon.wpay.request.UnionTradeCreateReq;
import com.witon.wpay.rt.RtAbstractTest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UnionCreateTest.java, v 0.1 2017年6月21日 上午9:53:35 song.li@witontek.com Exp $
 */
public class UnionCreateTest extends RtAbstractTest {

    private WitonClient client = client2;

    @Test
    public void test_trade_create() {
        try {
            UnionTradeCreateReq request = new UnionTradeCreateReq();
            UnTradeCreateReq c = new UnTradeCreateReq();
            c.setBody("iphone6s");
            c.setNotifyUrl(NOTIFY_URL);
            c.setTotalFee(111111L);
            c.setTradeNo(UUID.randomUUID().toString().replaceAll("-", ""));

            request.setBizReq(c);
            WitonResponse<UnTradeCreateResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
