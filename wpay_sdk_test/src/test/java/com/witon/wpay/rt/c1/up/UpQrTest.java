/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.rt.c1.up;

import java.util.UUID;

import org.junit.Test;

import com.witon.wpay.WitonClient;
import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.up.UpSpScanCreateReq;
import com.witon.wpay.domain.resp.up.UpSpScanCreateResp;
import com.witon.wpay.request.up.UpSpScanCreateRequest;
import com.witon.wpay.rt.RtAbstractTest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UpQrTest.java, v 0.1 2017年8月4日 上午9:45:57 song.li@witontek.com Exp $
 */
public class UpQrTest extends RtAbstractTest {

    private WitonClient client = client1;

    @Test
    public void test_qr_create() {
        try {
            UpSpScanCreateRequest request = new UpSpScanCreateRequest();
            UpSpScanCreateReq c = new UpSpScanCreateReq();

            c.setSubject("银联二维码");
            c.setNotifyUrl(NOTIFY_URL);
            c.setTotalFee(1L);
            c.setTradeNo(UUID.randomUUID().toString().replaceAll("-", ""));

            request.setBizReq(c);
            WitonResponse<UpSpScanCreateResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
