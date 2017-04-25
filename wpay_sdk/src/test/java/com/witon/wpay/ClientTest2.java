/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.witon.wpay.domain.req.wx.SpTradeQueryReq;
import com.witon.wpay.domain.req.wx.SpTradeRefundReq;
import com.witon.wpay.domain.resp.wx.SpTradeQueryResp;
import com.witon.wpay.domain.resp.wx.SpTradeRefundResp;
import com.witon.wpay.request.WxSpTradeQueryReq;
import com.witon.wpay.request.WxSpTradeRefundReq;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: ClientTest2.java, v 0.1 2017年4月19日 下午2:36:17 song.li@witontek.com Exp $
 */
public class ClientTest2 {
    /**
    * Logger for this class
    */
    private static final Logger logger = LoggerFactory.getLogger(ClientTest2.class);

    @Test
    public void test_trade_query() {

        try {
            String witonPubKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtHh6AQtjkLHEFbeiqr/kPozvF3WWDJH5NGuDb4USU2Hj/qidV6AB5usUpDJiAw3kYeTlQmka6nkWiuSFmgy0OmTTHOgAgBif0BtxV2jtDTjo+j/X4Lkd2ZG5AGGFHJXX3G/G11++f7pJbt3jUH2BdtneOCKbNL4hINZrsPKtnRhTto1cXX/FZdzgihVCq0jOAe5E8UIU2gdwV1TgY70URUw3UkFaRQB9KQjqQ25s8Hx6qYgBdepIgXpYzzJZGYGQa9dYifRIGmhCNtTfiRG0/pnWWw+ulP+xs3XcmdUnOpSQzB54rOo76Yz4vKegOxcy8LNxKi+EJYGrJOIp7uYzxQIDAQAB";
            String yourPriKey = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC0eHoBC2OQscQVt6Kqv+Q+jO8XdZYMkfk0a4NvhRJTYeP+qJ1XoAHm6xSkMmIDDeRh5OVCaRrqeRaK5IWaDLQ6ZNMc6ACAGJ/QG3FXaO0NOOj6P9fguR3ZkbkAYYUcldfcb8bXX75/uklu3eNQfYF22d44Ips0viEg1muw8q2dGFO2jVxdf8Vl3OCKFUKrSM4B7kTxQhTaB3BXVOBjvRRFTDdSQVpFAH0pCOpDbmzwfHqpiAF16kiBeljPMlkZgZBr11iJ9EgaaEI21N+JEbT+mdZbD66U/7GzddyZ1Sc6lJDMHnis6jvpjPi8p6A7FzLws3EqL4Qlgask4inu5jPFAgMBAAECggEBAITMVnKoT8asmK6mZ2OgOrMwf8tScmyjia5iIuCQGlETKnM83jMZgezLNXAxxt+afGDwzybUMsMxAT6JNCqMiJ6jjJmrupqIBCld2ERK6IyfQQjMq+0oKufrjCfUmt/S/3mtIrNfN83DZb/YNSoIgJjVbuj9xhnEgpooTixyFwEOJZG77FTFXzSSqfRJ3r7L+mc5Cj85Y6a7+EybbVsNyOCKccn2Cgzx2WXME7a5X1qV+a0bXwnFkVhmF7m8SMDZCVo1cVaCtZTGcCkehxd3pEgLJ2XpflnycUpAPVHK5HsyjW95qBVyVPhQLb63Ci50khW1vBSfXxbfzADXsw4Mj60CgYEA5h2l8+JaLXsfq21jTpBbBzCNcQ7aJpdiHMJSakVV7hzQh2+YzJhS1XGNTyXLb31cPabcWP6pVcGcJ14M9uz8iaTOSdg7X911uBc8XGN0O3Xdx9EI2WOLNzOzxYT2AJM1EBi84kNtlq+E7Zgq7IXQVyuHdCg9YYXl46iuUE0nI4MCgYEAyMVCPECuYFqL3jEYsBLowlNsGwry07OVyH4H4auz1zF2naCiALK27rgYmcIDKwn1XwbLggw+JQ7OvVTHEitn7gc3M2sX1nPDKtK7JhhbJaFj2WgTDSsfg/iQp6QdIC1Q0PLKRx/fVoEW7Dy/dM+bpx08EvNqCeqo9JkpZfj/gRcCgYEAr/ySs38z6j6UjN1eqnH6O/hk48cxDXyPG2F9+CpIuo8s57dwS2BfUT/Di3ljKUPdbIUVVbaFOMGWNAFYtuutg3MYFR+a4QkUg5K5pgqllOfiknOKaf8YNEKFRRUXsn7igQn6QqzAvhJD/hV3FmaMXG487JftwYzOsRqLHXyz5xMCgYBAsohgoDtRI3yVEl8xRjapgHaC1Glh3So0XKCvkUQ34WGm8/+gl/apQLv0uHeK4/+lKqxj8QwJpxbqHiq0aTZplvur3yPkYJOQ9i2G3ixpGPPzOD2DbdUPEweSbilQmCnF26dhehzfZGP9pqnPu6MeHCaiuLwADBV8FOspSC8V6wKBgHDvAO99KqhGm4co0K+N4E6VPqMSwpJP/rPjVSCstxdAZpzc3WOw6QU5n/2+YAuzruFfQRcXFl61KWtl4Sq/vx2EMG3cLPC6pJyXSIZO8/vydBeuLYgxy9TlyvOijBR9JtYJdi6tMHqJAGstCi5Gvlj0pT+koBB32hgIuNRzvwdy";
            String gatewayUrl = "http://test.witontek.com/wpay/rest/gateway.do";
            String pid = "6800000000000148";
            WitonClient client = new DefaultWitonClient(witonPubKey, yourPriKey, gatewayUrl, pid);

            WxSpTradeQueryReq request = new WxSpTradeQueryReq();
            SpTradeQueryReq c = new SpTradeQueryReq();
            c.setWxAppId("wx2214e4824de9f67c");
            c.setTradeNo("20170424010000000000000000003081");

            request.setBizReq(c);
            WitonResponse<SpTradeQueryResp> resp = client.exe(request);
            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @Test
    public void test_trade_refund() {

        try {
            String witonPubKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtHh6AQtjkLHEFbeiqr/kPozvF3WWDJH5NGuDb4USU2Hj/qidV6AB5usUpDJiAw3kYeTlQmka6nkWiuSFmgy0OmTTHOgAgBif0BtxV2jtDTjo+j/X4Lkd2ZG5AGGFHJXX3G/G11++f7pJbt3jUH2BdtneOCKbNL4hINZrsPKtnRhTto1cXX/FZdzgihVCq0jOAe5E8UIU2gdwV1TgY70URUw3UkFaRQB9KQjqQ25s8Hx6qYgBdepIgXpYzzJZGYGQa9dYifRIGmhCNtTfiRG0/pnWWw+ulP+xs3XcmdUnOpSQzB54rOo76Yz4vKegOxcy8LNxKi+EJYGrJOIp7uYzxQIDAQAB";
            String yourPriKey = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC0eHoBC2OQscQVt6Kqv+Q+jO8XdZYMkfk0a4NvhRJTYeP+qJ1XoAHm6xSkMmIDDeRh5OVCaRrqeRaK5IWaDLQ6ZNMc6ACAGJ/QG3FXaO0NOOj6P9fguR3ZkbkAYYUcldfcb8bXX75/uklu3eNQfYF22d44Ips0viEg1muw8q2dGFO2jVxdf8Vl3OCKFUKrSM4B7kTxQhTaB3BXVOBjvRRFTDdSQVpFAH0pCOpDbmzwfHqpiAF16kiBeljPMlkZgZBr11iJ9EgaaEI21N+JEbT+mdZbD66U/7GzddyZ1Sc6lJDMHnis6jvpjPi8p6A7FzLws3EqL4Qlgask4inu5jPFAgMBAAECggEBAITMVnKoT8asmK6mZ2OgOrMwf8tScmyjia5iIuCQGlETKnM83jMZgezLNXAxxt+afGDwzybUMsMxAT6JNCqMiJ6jjJmrupqIBCld2ERK6IyfQQjMq+0oKufrjCfUmt/S/3mtIrNfN83DZb/YNSoIgJjVbuj9xhnEgpooTixyFwEOJZG77FTFXzSSqfRJ3r7L+mc5Cj85Y6a7+EybbVsNyOCKccn2Cgzx2WXME7a5X1qV+a0bXwnFkVhmF7m8SMDZCVo1cVaCtZTGcCkehxd3pEgLJ2XpflnycUpAPVHK5HsyjW95qBVyVPhQLb63Ci50khW1vBSfXxbfzADXsw4Mj60CgYEA5h2l8+JaLXsfq21jTpBbBzCNcQ7aJpdiHMJSakVV7hzQh2+YzJhS1XGNTyXLb31cPabcWP6pVcGcJ14M9uz8iaTOSdg7X911uBc8XGN0O3Xdx9EI2WOLNzOzxYT2AJM1EBi84kNtlq+E7Zgq7IXQVyuHdCg9YYXl46iuUE0nI4MCgYEAyMVCPECuYFqL3jEYsBLowlNsGwry07OVyH4H4auz1zF2naCiALK27rgYmcIDKwn1XwbLggw+JQ7OvVTHEitn7gc3M2sX1nPDKtK7JhhbJaFj2WgTDSsfg/iQp6QdIC1Q0PLKRx/fVoEW7Dy/dM+bpx08EvNqCeqo9JkpZfj/gRcCgYEAr/ySs38z6j6UjN1eqnH6O/hk48cxDXyPG2F9+CpIuo8s57dwS2BfUT/Di3ljKUPdbIUVVbaFOMGWNAFYtuutg3MYFR+a4QkUg5K5pgqllOfiknOKaf8YNEKFRRUXsn7igQn6QqzAvhJD/hV3FmaMXG487JftwYzOsRqLHXyz5xMCgYBAsohgoDtRI3yVEl8xRjapgHaC1Glh3So0XKCvkUQ34WGm8/+gl/apQLv0uHeK4/+lKqxj8QwJpxbqHiq0aTZplvur3yPkYJOQ9i2G3ixpGPPzOD2DbdUPEweSbilQmCnF26dhehzfZGP9pqnPu6MeHCaiuLwADBV8FOspSC8V6wKBgHDvAO99KqhGm4co0K+N4E6VPqMSwpJP/rPjVSCstxdAZpzc3WOw6QU5n/2+YAuzruFfQRcXFl61KWtl4Sq/vx2EMG3cLPC6pJyXSIZO8/vydBeuLYgxy9TlyvOijBR9JtYJdi6tMHqJAGstCi5Gvlj0pT+koBB32hgIuNRzvwdy";
            String gatewayUrl = "http://test.witontek.com/wpay/rest/gateway.do";
            String pid = "6800000000000148";
            WitonClient client = new DefaultWitonClient(witonPubKey, yourPriKey, gatewayUrl, pid);

            WxSpTradeRefundReq request = new WxSpTradeRefundReq();
            SpTradeRefundReq c = new SpTradeRefundReq();
            c.setWxAppId("wx2214e4824de9f67c");
            c.setTradeNo("20170424010000000000000000003081");
            c.setRefundNo("20170424010000000000000000003081");
            c.setRefundFee(1L);
            c.setOpUserId("opUserId");
            c.setDeviceInfo("deviceInfo");

            request.setBizReq(c);
            WitonResponse<SpTradeRefundResp> resp = client.exe(request);

            logger.info("{}", resp);
            logger.info("{}", resp.getBizResp());
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
