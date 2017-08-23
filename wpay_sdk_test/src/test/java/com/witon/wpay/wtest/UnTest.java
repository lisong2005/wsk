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
import com.witon.wpay.domain.req.un.UnBillQueryReq;
import com.witon.wpay.domain.req.un.UnMicropayCreateReq;
import com.witon.wpay.domain.req.un.UnTradeCreateReq;
import com.witon.wpay.domain.req.un.UnTradeQueryReq;
import com.witon.wpay.domain.req.un.UnTradeRefundQueryReq;
import com.witon.wpay.domain.req.un.UnTradeRefundReq;
import com.witon.wpay.domain.resp.un.UnBillQueryResp;
import com.witon.wpay.domain.resp.un.UnMicropayCreateResp;
import com.witon.wpay.domain.resp.un.UnTradeCreateResp;
import com.witon.wpay.domain.resp.un.UnTradeQueryResp;
import com.witon.wpay.domain.resp.un.UnTradeRefundQueryResp;
import com.witon.wpay.domain.resp.un.UnTradeRefundResp;
import com.witon.wpay.request.un.UnionBillQueryReq;
import com.witon.wpay.request.un.UnionMicropayCreateReq;
import com.witon.wpay.request.un.UnionTradeCreateReq;
import com.witon.wpay.request.un.UnionTradeQueryReq;
import com.witon.wpay.request.un.UnionTradeRefundQueryReq;
import com.witon.wpay.request.un.UnionTradeRefundReq;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UnTest.java, v 0.1 2017年8月15日 下午4:54:07 song.li@witontek.com Exp $
 */
public class UnTest {
    public final Logger          logger        = LoggerFactory.getLogger(getClass());

    public static String         WITON_PUB_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtHh6AQtjkLHEFbeiqr/kPozvF3WWDJH5NGuDb4USU2Hj/qidV6AB5usUpDJiAw3kYeTlQmka6nkWiuSFmgy0OmTTHOgAgBif0BtxV2jtDTjo+j/X4Lkd2ZG5AGGFHJXX3G/G11++f7pJbt3jUH2BdtneOCKbNL4hINZrsPKtnRhTto1cXX/FZdzgihVCq0jOAe5E8UIU2gdwV1TgY70URUw3UkFaRQB9KQjqQ25s8Hx6qYgBdepIgXpYzzJZGYGQa9dYifRIGmhCNtTfiRG0/pnWWw+ulP+xs3XcmdUnOpSQzB54rOo76Yz4vKegOxcy8LNxKi+EJYGrJOIp7uYzxQIDAQAB";
    public static String         GATEWAY_URL   = "https://rbtest.witontek.com/wpay/rest/gateway.do";

    public static String         YOUR_PRI_KEY2 = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC0eHoBC2OQscQVt6Kqv+Q+jO8XdZYMkfk0a4NvhRJTYeP+qJ1XoAHm6xSkMmIDDeRh5OVCaRrqeRaK5IWaDLQ6ZNMc6ACAGJ/QG3FXaO0NOOj6P9fguR3ZkbkAYYUcldfcb8bXX75/uklu3eNQfYF22d44Ips0viEg1muw8q2dGFO2jVxdf8Vl3OCKFUKrSM4B7kTxQhTaB3BXVOBjvRRFTDdSQVpFAH0pCOpDbmzwfHqpiAF16kiBeljPMlkZgZBr11iJ9EgaaEI21N+JEbT+mdZbD66U/7GzddyZ1Sc6lJDMHnis6jvpjPi8p6A7FzLws3EqL4Qlgask4inu5jPFAgMBAAECggEBAITMVnKoT8asmK6mZ2OgOrMwf8tScmyjia5iIuCQGlETKnM83jMZgezLNXAxxt+afGDwzybUMsMxAT6JNCqMiJ6jjJmrupqIBCld2ERK6IyfQQjMq+0oKufrjCfUmt/S/3mtIrNfN83DZb/YNSoIgJjVbuj9xhnEgpooTixyFwEOJZG77FTFXzSSqfRJ3r7L+mc5Cj85Y6a7+EybbVsNyOCKccn2Cgzx2WXME7a5X1qV+a0bXwnFkVhmF7m8SMDZCVo1cVaCtZTGcCkehxd3pEgLJ2XpflnycUpAPVHK5HsyjW95qBVyVPhQLb63Ci50khW1vBSfXxbfzADXsw4Mj60CgYEA5h2l8+JaLXsfq21jTpBbBzCNcQ7aJpdiHMJSakVV7hzQh2+YzJhS1XGNTyXLb31cPabcWP6pVcGcJ14M9uz8iaTOSdg7X911uBc8XGN0O3Xdx9EI2WOLNzOzxYT2AJM1EBi84kNtlq+E7Zgq7IXQVyuHdCg9YYXl46iuUE0nI4MCgYEAyMVCPECuYFqL3jEYsBLowlNsGwry07OVyH4H4auz1zF2naCiALK27rgYmcIDKwn1XwbLggw+JQ7OvVTHEitn7gc3M2sX1nPDKtK7JhhbJaFj2WgTDSsfg/iQp6QdIC1Q0PLKRx/fVoEW7Dy/dM+bpx08EvNqCeqo9JkpZfj/gRcCgYEAr/ySs38z6j6UjN1eqnH6O/hk48cxDXyPG2F9+CpIuo8s57dwS2BfUT/Di3ljKUPdbIUVVbaFOMGWNAFYtuutg3MYFR+a4QkUg5K5pgqllOfiknOKaf8YNEKFRRUXsn7igQn6QqzAvhJD/hV3FmaMXG487JftwYzOsRqLHXyz5xMCgYBAsohgoDtRI3yVEl8xRjapgHaC1Glh3So0XKCvkUQ34WGm8/+gl/apQLv0uHeK4/+lKqxj8QwJpxbqHiq0aTZplvur3yPkYJOQ9i2G3ixpGPPzOD2DbdUPEweSbilQmCnF26dhehzfZGP9pqnPu6MeHCaiuLwADBV8FOspSC8V6wKBgHDvAO99KqhGm4co0K+N4E6VPqMSwpJP/rPjVSCstxdAZpzc3WOw6QU5n/2+YAuzruFfQRcXFl61KWtl4Sq/vx2EMG3cLPC6pJyXSIZO8/vydBeuLYgxy9TlyvOijBR9JtYJdi6tMHqJAGstCi5Gvlj0pT+koBB32hgIuNRzvwdy";
    public static String         PID           = "6800000000000001";

    public static String         NOTIFY_URL    = "https://rbtest.witontek.com/wpay/test/notify.do";

    protected static WitonClient client        = new DefaultWitonClient(WITON_PUB_KEY,
        YOUR_PRI_KEY2, GATEWAY_URL, PID);

    @Test
    public void test_trade_create() {
        try {
            UnionTradeCreateReq request = new UnionTradeCreateReq();
            UnTradeCreateReq c = new UnTradeCreateReq();
            c.setBody("iphone6s");
            c.setNotifyUrl(NOTIFY_URL);
            c.setTotalFee(111111L);
            c.setTradeNo(UUID.randomUUID().toString().replaceAll("-", ""));

            request.setBizReq(c);
            WitonResponse<UnTradeCreateResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @Test
    public void test_bill_query() {
        try {
            UnionBillQueryReq request = new UnionBillQueryReq();
            UnBillQueryReq c = new UnBillQueryReq();
            c.setBillDate("20170602");
            c.setBillDate("20170814");
            c.setBillType("SUCCESS");

            request.setBizReq(c);
            WitonResponse<UnBillQueryResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @Test
    public void test_micropay() {
        try {
            UnionMicropayCreateReq request = new UnionMicropayCreateReq();
            UnMicropayCreateReq c = new UnMicropayCreateReq();
            c.setNotifyUrl(NOTIFY_URL);
            c.setBody("body");
            c.setTotalFee(1L);
            c.setTradeNo(UUID.randomUUID().toString().replaceAll("-", ""));
            c.setAuthCode("134523112709866990");

            request.setBizReq(c);
            WitonResponse<UnMicropayCreateResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @Test
    public void test_trade_query() {
        try {
            UnionTradeQueryReq request = new UnionTradeQueryReq();
            UnTradeQueryReq c = new UnTradeQueryReq();
            c.setTradeNo("6378135050ff4936b6f9e1015ca46843");

            request.setBizReq(c);
            WitonResponse<UnTradeQueryResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @Test
    public void test_trade_refund() {
        try {
            UnionTradeRefundReq request = new UnionTradeRefundReq();
            UnTradeRefundReq c = new UnTradeRefundReq();
            c.setTradeNo("6378135050ff4936b6f9e1015ca46843");
            c.setRefundNo("6378135050ff4936b6f9e1015ca46843");
            c.setRefundFee(1L);

            request.setBizReq(c);
            WitonResponse<UnTradeRefundResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @Test
    public void test_trade_refund_query() {
        try {
            UnionTradeRefundQueryReq request = new UnionTradeRefundQueryReq();
            UnTradeRefundQueryReq c = new UnTradeRefundQueryReq();
            c.setRefundNo("6378135050ff4936b6f9e1015ca46843");

            request.setBizReq(c);
            WitonResponse<UnTradeRefundQueryResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
