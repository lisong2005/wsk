/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.test;

import java.util.Date;
import java.util.UUID;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.wx.SpJspayCreateReq;
import com.witon.wpay.domain.resp.wx.SpJspayCreateResp;
import com.witon.wpay.request.WxSpJspayCreateReq;
import com.witon.wpay.util.DateUtil;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: JspayTradeTest.java, v 0.1 2017年4月27日 上午10:23:27 song.li@witontek.com Exp $
 */
public class JspayTradeTest extends AbstractTest {

    @Test
    public void test_trade_create() {
        try {
            WxSpJspayCreateReq request = new WxSpJspayCreateReq();
            SpJspayCreateReq c = new SpJspayCreateReq();
            c.setAttach("aa");
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
            WitonResponse<SpJspayCreateResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
