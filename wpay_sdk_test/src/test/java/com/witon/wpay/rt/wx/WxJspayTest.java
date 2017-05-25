/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.rt.wx;

import java.util.Date;
import java.util.UUID;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.wx.SpJspayCreateReq;
import com.witon.wpay.domain.resp.wx.SpJspayCreateResp;
import com.witon.wpay.request.WxSpJspayCreateReq;
import com.witon.wpay.rt.RtAbstractTest;
import com.witon.wpay.util.DateUtil;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WxJspayTest.java, v 0.1 2017年5月24日 下午4:00:47 song.li@witontek.com Exp $
 */
public class WxJspayTest extends RtAbstractTest {

    @Test
    public void test_jspay_trade_create_001() {
        try {
            WxSpJspayCreateReq request = new WxSpJspayCreateReq();
            SpJspayCreateReq c = new SpJspayCreateReq();

            c.setBody("body");
            c.setOpenId("okoE3v5kGPrjI_gevafzNMtM6F74");
            c.setWxAppId("wx985bfeb7fc165525");

            c.setCreateIp("58.240.244.130");
            c.setNotifyUrl(NOTIFY_URL);
            c.setTotalFee(100L);
            c.setTradeNo(UUID.randomUUID().toString().replaceAll("-", ""));

            c.setTimeStart(DateUtil.getLongDateString(new Date()));
            c.setTimeExpire(DateUtil.getLongDateString(
                new Date(System.currentTimeMillis() + DateUtils.MILLIS_PER_HOUR)));

            request.setBizReq(c);
            WitonResponse<SpJspayCreateResp> resp = client1.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @Test
    public void test_jspay_trade_create_002() {
        try {
            WxSpJspayCreateReq request = new WxSpJspayCreateReq();
            SpJspayCreateReq c = new SpJspayCreateReq();

            c.setBody("body");
            c.setOpenId("okoE3v5kGPrjI_gevafzNMtM6F74");
            c.setWxAppId("wx985bfeb7fc165525");

            c.setCreateIp("58.240.244.130");
            c.setNotifyUrl(NOTIFY_URL);
            c.setTotalFee(100L);
            c.setTradeNo(UUID.randomUUID().toString().replaceAll("-", ""));

            c.setTimeStart(DateUtil.getLongDateString(new Date()));
            c.setTimeExpire(DateUtil.getLongDateString(
                new Date(System.currentTimeMillis() + DateUtils.MILLIS_PER_HOUR)));

            request.setBizReq(c);
            WitonResponse<SpJspayCreateResp> resp = client2.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
