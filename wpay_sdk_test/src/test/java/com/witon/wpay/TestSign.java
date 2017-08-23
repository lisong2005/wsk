/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay;

import java.net.URLDecoder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.witon.wpay.domain.resp.alipay.AliSpMicropayCreateResp;
import com.witon.wpay.util.SignUtils;
import com.witon.wpay.wtest.AlipayTest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: TestSign.java, v 0.1 2017年4月28日 下午3:10:29 song.li@witontek.com Exp $
 */
public class TestSign {
    /**
    * Logger for this class
    */
    private static final Logger logger = LoggerFactory.getLogger(TestSign.class);

    private String              pk     = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC0eHoBC2OQscQVt6Kqv+Q+jO8XdZYMkfk0a4NvhRJTYeP+qJ1XoAHm6xSkMmIDDeRh5OVCaRrqeRaK5IWaDLQ6ZNMc6ACAGJ/QG3FXaO0NOOj6P9fguR3ZkbkAYYUcldfcb8bXX75/uklu3eNQfYF22d44Ips0viEg1muw8q2dGFO2jVxdf8Vl3OCKFUKrSM4B7kTxQhTaB3BXVOBjvRRFTDdSQVpFAH0pCOpDbmzwfHqpiAF16kiBeljPMlkZgZBr11iJ9EgaaEI21N+JEbT+mdZbD66U/7GzddyZ1Sc6lJDMHnis6jvpjPi8p6A7FzLws3EqL4Qlgask4inu5jPFAgMBAAECggEBAITMVnKoT8asmK6mZ2OgOrMwf8tScmyjia5iIuCQGlETKnM83jMZgezLNXAxxt+afGDwzybUMsMxAT6JNCqMiJ6jjJmrupqIBCld2ERK6IyfQQjMq+0oKufrjCfUmt/S/3mtIrNfN83DZb/YNSoIgJjVbuj9xhnEgpooTixyFwEOJZG77FTFXzSSqfRJ3r7L+mc5Cj85Y6a7+EybbVsNyOCKccn2Cgzx2WXME7a5X1qV+a0bXwnFkVhmF7m8SMDZCVo1cVaCtZTGcCkehxd3pEgLJ2XpflnycUpAPVHK5HsyjW95qBVyVPhQLb63Ci50khW1vBSfXxbfzADXsw4Mj60CgYEA5h2l8+JaLXsfq21jTpBbBzCNcQ7aJpdiHMJSakVV7hzQh2+YzJhS1XGNTyXLb31cPabcWP6pVcGcJ14M9uz8iaTOSdg7X911uBc8XGN0O3Xdx9EI2WOLNzOzxYT2AJM1EBi84kNtlq+E7Zgq7IXQVyuHdCg9YYXl46iuUE0nI4MCgYEAyMVCPECuYFqL3jEYsBLowlNsGwry07OVyH4H4auz1zF2naCiALK27rgYmcIDKwn1XwbLggw+JQ7OvVTHEitn7gc3M2sX1nPDKtK7JhhbJaFj2WgTDSsfg/iQp6QdIC1Q0PLKRx/fVoEW7Dy/dM+bpx08EvNqCeqo9JkpZfj/gRcCgYEAr/ySs38z6j6UjN1eqnH6O/hk48cxDXyPG2F9+CpIuo8s57dwS2BfUT/Di3ljKUPdbIUVVbaFOMGWNAFYtuutg3MYFR+a4QkUg5K5pgqllOfiknOKaf8YNEKFRRUXsn7igQn6QqzAvhJD/hV3FmaMXG487JftwYzOsRqLHXyz5xMCgYBAsohgoDtRI3yVEl8xRjapgHaC1Glh3So0XKCvkUQ34WGm8/+gl/apQLv0uHeK4/+lKqxj8QwJpxbqHiq0aTZplvur3yPkYJOQ9i2G3ixpGPPzOD2DbdUPEweSbilQmCnF26dhehzfZGP9pqnPu6MeHCaiuLwADBV8FOspSC8V6wKBgHDvAO99KqhGm4co0K+N4E6VPqMSwpJP/rPjVSCstxdAZpzc3WOw6QU5n/2+YAuzruFfQRcXFl61KWtl4Sq/vx2EMG3cLPC6pJyXSIZO8/vydBeuLYgxy9TlyvOijBR9JtYJdi6tMHqJAGstCi5Gvlj0pT+koBB32hgIuNRzvwdy";

    @Test
    public void test_001() {

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("app_id", "6800000000000148");
        params.put("method", "witon.wxsp.trade.scan.ss");
        params.put("sign_type", "RSA2");
        params.put("timestamp", "1493362993571");
        params.put("version", "1.0");
        params.put("sign", "xxxxx");
        params.put("biz_content",
            "{\"wx_appid\": \"wx985bfeb7fc165525\",\"device_info\":\"123456\",\"body\": \"商品描述\",\"detail\": \"商品详情\",\"attach\": \"附加数据\",\"trade_no\": \"1493362993571\",\"total_fee\": \"10\",\"create_ip\": \"58.240.244.130\",\"product_id\":\"12\",\"time_start\": \"\",\"time_expire\": \"\",\"goods_tag\": \"商品标记\",\"notify_url\": \"http://baidu.com\",\"limit_pay\": \"\",\"prod_tag\":\"产品维度标记\"}");

        String sign = com.witon.wpay.util.SignUtils.signRSA256(params, pk);
        System.out.println(sign);

    }

    @Test
    public void test_002() {
        logger.info("{}", String.format("%s", 111L));
        logger.info("{}", new Date(1500617916833L));
    }

    @Test
    public void test_003() {
        logger.info("");

        String publicKey = AlipayTest.WITON_PUB_KEY;

        WitonResponse<AliSpMicropayCreateResp> resp = new WitonResponse<>();
        resp.setRespContent(
            "{\"buyer_logon_id\":\"cyq***@126.com\",\"buyer_user_id\":\"2088102091573796\",\"total_fee\":1,\"wt_trade_no\":\"20170717x10000000000000000011401\",\"trade_no\":\"A00001003\",\"time_end\":\"20170717152007\",\"attach\":null,\"trade_state\":\"SUCCESS\",\"store_id\":null,\"terminal_id\":null,\"alipay_store_id\":null}");
        resp.setCode("0000");
        resp.setMsg("成功");
        resp.setSub_code("SUCCESS");
        resp.setSub_msg("成功");
        resp.setSignType("RSA2");
        resp.setTimestamp(1500369528573L);
        resp.setSign(
            "OVqGUgj6sDsh9HiRCnsulVTZLt/kVruxiHMkKHaCv7S5q9n87frXOLZFw3gaJoaN3knr4lI8cE8IypdODhOUBwbqyj9DkRCrG1L/WIkcj/8Jo0j5endhXOKVkWTKnEU5X25mGzSQ0xfC76l5DZSoZ93KeeNjPvtzw8MPcQpQXXJAuUMVYsw65r9xLPjJuev03AxY6QvLeloh7yI4i5QQpKm7jJGfe3NGH68w2aCPWIkl3/Y7fLIFyom2sezdm/VVfRVFyFZPfBn67ZDqh28eDU76KMMQ6LlqyXErYJXYdlK3pq/vUbFuTaHzVugyS7MiiWcWOghccCmx4JJO1zErKg==");

        boolean b = SignUtils.verifySignRSA256(resp, resp.getSign(), publicKey);
        logger.info("{}", b);

    }

    @Test
    public void test_11111() {
        String s = "T4NJx%2FVgocRsLyQnrMZLyuQQkFzMAxQjdqyzf6pM%2Fcg%3D";
        try {
            logger.info("{}", URLDecoder.decode(s, "utf-8"));
            logger.info("{}", URLDecoder.decode(s, "gbk"));
            logger.info("{}", URLDecoder.decode(s, "ISO-8859-1"));
        } catch (Exception e) {
            logger.error("", e);
        }
    }

}
