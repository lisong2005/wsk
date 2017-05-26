/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.rt.wx;

import java.util.UUID;

import org.junit.Test;

import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.wx.SpMicropayCreateReq;
import com.witon.wpay.domain.resp.wx.SpMicropayCreateResp;
import com.witon.wpay.request.WxSpMicropayCreateReq;
import com.witon.wpay.rt.RtAbstractTest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WxMicropayTest.java, v 0.1 2017年5月25日 下午5:17:40 song.li@witontek.com Exp $
 */
public class WxMicropayTest extends RtAbstractTest {

    @Test
    public void test_jspay_trade_create_001() {
        try {
            WxSpMicropayCreateReq request = new WxSpMicropayCreateReq();
            SpMicropayCreateReq c = new SpMicropayCreateReq();

            c.setBody("body");
            c.setCreateIp("58.240.244.130");
            c.setTotalFee(1L);
            c.setTradeNo(UUID.randomUUID().toString());
            c.setAuthCode("130065166980926247");

            request.setBizReq(c);
            WitonResponse<SpMicropayCreateResp> resp = client2.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
