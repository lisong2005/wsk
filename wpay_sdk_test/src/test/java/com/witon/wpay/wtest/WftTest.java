/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.wtest;

import java.util.UUID;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.witon.wpay.DefaultWitonClient;
import com.witon.wpay.WitonClient;
import com.witon.wpay.WitonResponse;
import com.witon.wpay.domain.req.wft.WftSpBillQueryReq;
import com.witon.wpay.domain.req.wft.WftSpJspayCreateReq;
import com.witon.wpay.domain.req.wft.WftSpTradeQueryReq;
import com.witon.wpay.domain.req.wft.WftSpTradeRefundQueryReq;
import com.witon.wpay.domain.req.wft.WftSpTradeRefundReq;
import com.witon.wpay.domain.resp.wft.WftSpBillQueryResp;
import com.witon.wpay.domain.resp.wft.WftSpJspayCreateResp;
import com.witon.wpay.domain.resp.wft.WftSpTradeQueryResp;
import com.witon.wpay.domain.resp.wft.WftSpTradeRefundQueryResp;
import com.witon.wpay.domain.resp.wft.WftSpTradeRefundResp;
import com.witon.wpay.request.wft.WftSpBillQueryRequest;
import com.witon.wpay.request.wft.WftSpJspayCreateRequest;
import com.witon.wpay.request.wft.WftSpTradeQueryRequest;
import com.witon.wpay.request.wft.WftSpTradeRefundQueryRequest;
import com.witon.wpay.request.wft.WftSpTradeRefundRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WftTest.java, v 0.1 2017年7月7日 下午1:47:12 song.li@witontek.com Exp $
 */
public class WftTest {
    /**
    * Logger for this class
    */
    private static final Logger  logger        = LoggerFactory.getLogger(WftTest.class);

    public static String         WITON_PUB_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtHh6AQtjkLHEFbeiqr/kPozvF3WWDJH5NGuDb4USU2Hj/qidV6AB5usUpDJiAw3kYeTlQmka6nkWiuSFmgy0OmTTHOgAgBif0BtxV2jtDTjo+j/X4Lkd2ZG5AGGFHJXX3G/G11++f7pJbt3jUH2BdtneOCKbNL4hINZrsPKtnRhTto1cXX/FZdzgihVCq0jOAe5E8UIU2gdwV1TgY70URUw3UkFaRQB9KQjqQ25s8Hx6qYgBdepIgXpYzzJZGYGQa9dYifRIGmhCNtTfiRG0/pnWWw+ulP+xs3XcmdUnOpSQzB54rOo76Yz4vKegOxcy8LNxKi+EJYGrJOIp7uYzxQIDAQAB";
    public static String         GATEWAY_URL   = "https://test.witontek.com/wpay/rest/gateway.do";

    public static String         YOUR_PRI_KEY2 = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC0eHoBC2OQscQVt6Kqv+Q+jO8XdZYMkfk0a4NvhRJTYeP+qJ1XoAHm6xSkMmIDDeRh5OVCaRrqeRaK5IWaDLQ6ZNMc6ACAGJ/QG3FXaO0NOOj6P9fguR3ZkbkAYYUcldfcb8bXX75/uklu3eNQfYF22d44Ips0viEg1muw8q2dGFO2jVxdf8Vl3OCKFUKrSM4B7kTxQhTaB3BXVOBjvRRFTDdSQVpFAH0pCOpDbmzwfHqpiAF16kiBeljPMlkZgZBr11iJ9EgaaEI21N+JEbT+mdZbD66U/7GzddyZ1Sc6lJDMHnis6jvpjPi8p6A7FzLws3EqL4Qlgask4inu5jPFAgMBAAECggEBAITMVnKoT8asmK6mZ2OgOrMwf8tScmyjia5iIuCQGlETKnM83jMZgezLNXAxxt+afGDwzybUMsMxAT6JNCqMiJ6jjJmrupqIBCld2ERK6IyfQQjMq+0oKufrjCfUmt/S/3mtIrNfN83DZb/YNSoIgJjVbuj9xhnEgpooTixyFwEOJZG77FTFXzSSqfRJ3r7L+mc5Cj85Y6a7+EybbVsNyOCKccn2Cgzx2WXME7a5X1qV+a0bXwnFkVhmF7m8SMDZCVo1cVaCtZTGcCkehxd3pEgLJ2XpflnycUpAPVHK5HsyjW95qBVyVPhQLb63Ci50khW1vBSfXxbfzADXsw4Mj60CgYEA5h2l8+JaLXsfq21jTpBbBzCNcQ7aJpdiHMJSakVV7hzQh2+YzJhS1XGNTyXLb31cPabcWP6pVcGcJ14M9uz8iaTOSdg7X911uBc8XGN0O3Xdx9EI2WOLNzOzxYT2AJM1EBi84kNtlq+E7Zgq7IXQVyuHdCg9YYXl46iuUE0nI4MCgYEAyMVCPECuYFqL3jEYsBLowlNsGwry07OVyH4H4auz1zF2naCiALK27rgYmcIDKwn1XwbLggw+JQ7OvVTHEitn7gc3M2sX1nPDKtK7JhhbJaFj2WgTDSsfg/iQp6QdIC1Q0PLKRx/fVoEW7Dy/dM+bpx08EvNqCeqo9JkpZfj/gRcCgYEAr/ySs38z6j6UjN1eqnH6O/hk48cxDXyPG2F9+CpIuo8s57dwS2BfUT/Di3ljKUPdbIUVVbaFOMGWNAFYtuutg3MYFR+a4QkUg5K5pgqllOfiknOKaf8YNEKFRRUXsn7igQn6QqzAvhJD/hV3FmaMXG487JftwYzOsRqLHXyz5xMCgYBAsohgoDtRI3yVEl8xRjapgHaC1Glh3So0XKCvkUQ34WGm8/+gl/apQLv0uHeK4/+lKqxj8QwJpxbqHiq0aTZplvur3yPkYJOQ9i2G3ixpGPPzOD2DbdUPEweSbilQmCnF26dhehzfZGP9pqnPu6MeHCaiuLwADBV8FOspSC8V6wKBgHDvAO99KqhGm4co0K+N4E6VPqMSwpJP/rPjVSCstxdAZpzc3WOw6QU5n/2+YAuzruFfQRcXFl61KWtl4Sq/vx2EMG3cLPC6pJyXSIZO8/vydBeuLYgxy9TlyvOijBR9JtYJdi6tMHqJAGstCi5Gvlj0pT+koBB32hgIuNRzvwdy";
    public static String         PID           = "6800000000000001";

    public static String         NOTIFY_URL    = "https://test.witontek.com/wpay/test/notify.do";

    protected static WitonClient client        = new DefaultWitonClient(WITON_PUB_KEY,
        YOUR_PRI_KEY2, GATEWAY_URL, PID);

    @Test
    public void test_jspay_trade_create() {
        try {
            WftSpJspayCreateRequest request = new WftSpJspayCreateRequest();
            WftSpJspayCreateReq c = new WftSpJspayCreateReq();
            c.setWxAppId("wxb7dde1b3f242c381");
            c.setOpenId("oAPWct6dU-BiSqT0-RDDUdmPXLOw");
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

    @Test
    public void test_trade_query() {
        try {
            WftSpTradeQueryRequest request = new WftSpTradeQueryRequest();
            WftSpTradeQueryReq c = new WftSpTradeQueryReq();
            c.setTradeNo("c1990857f0bd4daa8d3936ffe3160fde");
            c.setTradeNo("5b0d1772c4d84127be15988dc898c860");

            request.setBizReq(c);
            WitonResponse<WftSpTradeQueryResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @Test
    public void test_trade_refund() {
        try {
            WftSpTradeRefundRequest request = new WftSpTradeRefundRequest();
            WftSpTradeRefundReq c = new WftSpTradeRefundReq();
            c.setTradeNo("27c670dfb99f4b65b0e5f9a3ecddd168");
            c.setRefundNo("27c670dfb99f4b65b0e5f9a3ecddd168");
            c.setRefundFee(1L);
            c.setOpUserId("ooo");

            request.setBizReq(c);
            WitonResponse<WftSpTradeRefundResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @Test
    public void test_trade_refund_query() {
        try {
            WftSpTradeRefundQueryRequest request = new WftSpTradeRefundQueryRequest();
            WftSpTradeRefundQueryReq c = new WftSpTradeRefundQueryReq();
            c.setRefundNo("27c670dfb99f4b65b0e5f9a3ecddd168");

            request.setBizReq(c);
            WitonResponse<WftSpTradeRefundQueryResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @Test
    public void test_bill() {
        try {
            WftSpBillQueryRequest request = new WftSpBillQueryRequest();
            WftSpBillQueryReq c = new WftSpBillQueryReq();
            c.setBillDate("20170707");
            c.setBillType("SUCCESS");

            request.setBizReq(c);
            WitonResponse<WftSpBillQueryResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }

}
