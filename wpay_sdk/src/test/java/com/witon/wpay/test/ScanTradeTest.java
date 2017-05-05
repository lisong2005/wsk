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
import com.witon.wpay.domain.req.wx.SpScanCreateReq;
import com.witon.wpay.domain.resp.wx.SpScanCreateResp;
import com.witon.wpay.request.WxSpScanCreateReq;
import com.witon.wpay.util.DateUtil;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: NativeTradeTest.java, v 0.1 2017年5月5日 下午2:32:42 song.li@witontek.com Exp $
 */
public class ScanTradeTest extends AbstractTest {

    @Test
    public void test_trade_create() {
        try {
            WxSpScanCreateReq request = new WxSpScanCreateReq();
            SpScanCreateReq c = new SpScanCreateReq();
            c.setAttach("aa");
            c.setBody("body");
            c.setWxAppId("wx985bfeb7fc165525");
            c.setCreateIp("58.240.244.130");
            c.setNotifyUrl("http://test.witontek.com");
            c.setTotalFee(11L);
            c.setTradeNo(UUID.randomUUID().toString().replaceAll("-", ""));
            c.setTimeStart(DateUtil.getLongDateString(new Date()));
            c.setTimeExpire(DateUtil.getLongDateString(
                new Date(System.currentTimeMillis() + DateUtils.MILLIS_PER_HOUR)));
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
