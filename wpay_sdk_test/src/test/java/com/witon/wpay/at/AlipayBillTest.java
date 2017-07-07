/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.at;

import org.junit.Test;

import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.alipay.AliSpBillQueryReq;
import com.witon.wpay.domain.resp.alipay.AliSpBillQueryResp;
import com.witon.wpay.request.alipay.AlipayBillQueryReq;
import com.witon.wpay.test.AbstractTest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: AlipayBillTest.java, v 0.1 2017年5月18日 下午4:52:52 song.li@witontek.com Exp $
 */
public class AlipayBillTest extends AbstractTest {

    @Test
    public void test_bill_query() {
        try {
            AlipayBillQueryReq request = new AlipayBillQueryReq();
            AliSpBillQueryReq c = new AliSpBillQueryReq();
            c.setBillDate("20170514");
            c.setBillType("SUCCESS");

            request.setBizReq(c);
            WitonResponse<AliSpBillQueryResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
