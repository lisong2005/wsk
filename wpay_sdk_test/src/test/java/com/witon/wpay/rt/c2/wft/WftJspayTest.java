/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.rt.c2.wft;

import java.util.UUID;

import org.junit.Test;

import com.witon.wpay.WitonClient;
import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.wft.WftSpJspayCreateReq;
import com.witon.wpay.domain.resp.wft.WftSpJspayCreateResp;
import com.witon.wpay.request.wft.WftSpJspayCreateRequest;
import com.witon.wpay.rt.RtAbstractTest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WftJspayTest.java, v 0.1 2017年7月13日 下午2:16:41 song.li@witontek.com Exp $
 */
public class WftJspayTest extends RtAbstractTest {

    private WitonClient client = client2;

    @Test
    public void test_jspay_trade_create() {
        try {
            WftSpJspayCreateRequest request = new WftSpJspayCreateRequest();
            WftSpJspayCreateReq c = new WftSpJspayCreateReq();
            // 健康微站
            c.setWxAppId("wxb7dde1b3f242c381");
            c.setOpenId("oAPWct6dU-BiSqT0-RDDUdmPXLOw");

            // 江苏睿博测试
            c.setWxAppId("wxa0390756874e8a3e");
            c.setOpenId("oIc6MwK7_06gNqYIf8AdemE1NLqE");
            c.setBody("威富通支付");
            c.setNotifyUrl(NOTIFY_URL);
            c.setTotalFee(1);
            c.setCreateIp("58.240.244.130");
            c.setTradeNo(UUID.randomUUID().toString().replaceAll("-", ""));

            request.setBizReq(c);
            WitonResponse<WftSpJspayCreateResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
