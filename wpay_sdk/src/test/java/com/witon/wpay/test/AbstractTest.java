/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.witon.wpay.DefaultWitonClient;
import com.witon.wpay.TestConstants;
import com.witon.wpay.WitonClient;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: AbstractTest.java, v 0.1 2017年5月5日 下午2:33:05 song.li@witontek.com Exp $
 */
public abstract class AbstractTest implements TestConstants {

    public static String         NOTIFY_URL = "https://test.witontek.com/wpay/test/notify.do";

    /**
     * Logger for this class
     */
    protected final Logger       logger     = LoggerFactory.getLogger(getClass());

    protected static WitonClient client     = new DefaultWitonClient(WITON_PUB_KEY, YOUR_PRI_KEY2,
        GATEWAY_URL, PID);
}
