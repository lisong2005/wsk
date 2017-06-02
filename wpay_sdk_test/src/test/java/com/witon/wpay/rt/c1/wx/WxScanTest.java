/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.rt.c1.wx;

import java.util.UUID;

import org.junit.Test;

import com.witon.wpay.WitonClient;
import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.wx.SpScanCreateReq;
import com.witon.wpay.domain.resp.wx.SpScanCreateResp;
import com.witon.wpay.request.WxSpScanCreateReq;
import com.witon.wpay.rt.RtAbstractTest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WxScanTest.java, v 0.1 2017年5月24日 下午2:58:44 song.li@witontek.com Exp $
 */
public class WxScanTest extends RtAbstractTest {
    private WitonClient client = client1;

    @Test
    public void test_trade_create_001() {
        try {
            WxSpScanCreateReq request = new WxSpScanCreateReq();
            SpScanCreateReq c = new SpScanCreateReq();
            c.setBody("body");
            c.setCreateIp("58.240.244.130");
            c.setNotifyUrl(NOTIFY_URL);
            c.setTotalFee(11L);
            c.setTradeNo(UUID.randomUUID().toString().replaceAll("-", ""));
            c.setProductId("prod_id");

            request.setBizReq(c);
            WitonResponse<SpScanCreateResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    // ===================================================================
    // ===================================================================
    // ===================================================================

    @Test
    public void test_trade_create_002() {
        try {
            WxSpScanCreateReq request = new WxSpScanCreateReq();
            SpScanCreateReq c = new SpScanCreateReq();
            c.setBody("body");
            c.setCreateIp("58.240.244.130");
            c.setNotifyUrl(NOTIFY_URL);
            c.setTotalFee(11L);
            c.setTradeNo(UUID.randomUUID().toString().replaceAll("-", ""));
            c.setProductId("prod_id");

            request.setBizReq(c);
            WitonResponse<SpScanCreateResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
