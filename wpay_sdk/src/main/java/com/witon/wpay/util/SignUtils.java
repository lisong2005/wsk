/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.util;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: SignUtils.java, v 0.1 2017年4月7日 上午9:40:50 song.li@witontek.com Exp $
 */
public class SignUtils {

    /**
    * Logger for this class
    */
    private static final Logger logger          = LoggerFactory.getLogger(SignUtils.class);

    public static final String  SIGN_ALGORITHMS = "SHA1WithRSA";
    /**  */
    private static final String RSA             = "RSA";

    public static String signRSA256(Map<String, Object> map, String privateKey) {
        if (map == null || StringUtils.isBlank(privateKey)) {
            return null;
        }
        try {
            String content = toSignStr(map);
            logger.debug("content = {}", content);
            PrivateKey priKey = getPrivateKeyFromPKCS8(privateKey);
            Signature signature = Signature.getInstance(SIGN_ALGORITHMS);
            signature.initSign(priKey);
            signature.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(content));
            byte[] signed = signature.sign();
            return Base64.encodeBase64String(signed);
        } catch (Exception e) {
            logger.error("", e);
            return null;
        }
    }

    public static boolean verifySignRSA256(Object signObj, String sign, String publicKey) {
        if (StringUtils.isBlank(sign) || StringUtils.isBlank(publicKey)) {
            return false;
        }
        try {
            String content = toSignStr(toSignMap(signObj));
            logger.debug("content = {}", content);
            PublicKey pubKey = getPublicKeyFromX509(publicKey);
            Signature signature = Signature.getInstance(SIGN_ALGORITHMS);
            signature.initVerify(pubKey);
            signature.update(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(content));
            return signature.verify(Base64.decodeBase64(sign));
        } catch (Exception e) {
            logger.error("", e);
            return false;
        }
    }

    protected static Map<String, Object> toSignMap(Object signObj) {
        Map<String, Object> retProps = new HashMap<String, Object>();
        try {
            Map<String, Object> props = PropertyUtils.describe(signObj);
            props.remove("class");
            props.remove("sign");

            Iterator<Map.Entry<String, Object>> it = props.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> e = it.next();
                if (e.getValue() != null) {
                    retProps.put(e.getKey(), e.getValue().toString());
                }
            }
            props.clear();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return retProps;
    }

    protected static String toSignStr(Map<String, Object> params) {
        TreeSet<String> keys = new TreeSet<>(params.keySet());
        StringBuilder sb = new StringBuilder();
        for (String key : keys) {
            if (StringUtils.equals(key, "sign")) {
                continue;
            }
            Object value = params.get(key);
            if (value == null) {
                continue;
            }
            String strValue = value.toString();
            if (StringUtils.isNotBlank(strValue)) {
                sb.append(key).append("=").append(strValue).append("&");
            }
        }
        return sb.toString();
    }

    protected static PrivateKey getPrivateKeyFromPKCS8(String privateKey) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance(RSA);
        byte[] encodedKey = privateKey.getBytes();
        return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(Base64.decodeBase64(encodedKey)));
    }

    protected static PublicKey getPublicKeyFromX509(String publicKey) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance(RSA);
        byte[] encodedKey = publicKey.getBytes();
        return keyFactory.generatePublic(new X509EncodedKeySpec(Base64.decodeBase64(encodedKey)));
    }
}
