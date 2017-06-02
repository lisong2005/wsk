/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.rt.c2.a;

import java.util.Date;
import java.util.UUID;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import com.witon.wpay.WitonClient;
import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.alipay.AliSpScanCreateReq;
import com.witon.wpay.domain.req.alipay.AliSpTradeQueryReq;
import com.witon.wpay.domain.resp.alipay.AliSpScanCreateResp;
import com.witon.wpay.domain.resp.alipay.AliSpTradeQueryResp;
import com.witon.wpay.request.AlipayScanCreateReq;
import com.witon.wpay.request.AlipayTradeQueryReq;
import com.witon.wpay.rt.RtAbstractTest;
import com.witon.wpay.util.DateUtil;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: AlipayScanTest.java, v 0.1 2017年5月16日 上午9:03:38 song.li@witontek.com Exp $
 */
public class AlipayScanTest extends RtAbstractTest {

    private WitonClient client = client2;

    @Test
    public void test_trade_create_001() {
        try {
            AlipayScanCreateReq request = new AlipayScanCreateReq();
            AliSpScanCreateReq c = new AliSpScanCreateReq();
            c.setSubject("ls");
            c.setNotifyUrl(NOTIFY_URL);
            c.setTotalFee(1);
            c.setTradeNo("a7312784340d41a3878ecdb051ac22c9");
            c.setTradeNo(UUID.randomUUID().toString().replaceAll("-", ""));

            c.setTimeExpire(DateUtil.getMinDateString(
                new Date(System.currentTimeMillis() + DateUtils.MILLIS_PER_HOUR)));

            request.setBizReq(c);
            WitonResponse<AliSpScanCreateResp> resp = client.exe(request);
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
            c.setTradeNo("a7312784340d41a3878ecdb051ac22c9");

            request.setBizReq(c);
            WitonResponse<AliSpTradeQueryResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
