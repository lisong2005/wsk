package com.witon.wpay.util;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: EhJerseyClientTest.java, v 0.1 2017年4月6日 下午2:35:00 song.li@witontek.com Exp $
 */
public class EhJerseyClientTest {
    /**
    * Logger for this class
    */
    private static final Logger logger = LoggerFactory.getLogger(EhJerseyClientTest.class);

    @Test
    public void test_001() {
        logger.debug("xx");
    }

    @Test
    public void test_client_hello1() {
        try {
            Client client = EhJerseyClient.getJerseyClient();
            WebTarget target = client.target("http://localhost:8080/wpay/").path("success.json");
            String resp = target.request(MediaType.APPLICATION_JSON_TYPE).get(String.class);
            logger.info("{}", resp);
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
