/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.rt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.witon.wpay.DefaultWitonClient;
import com.witon.wpay.WitonClient;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: AbstractTest.java, v 0.1 2017年5月5日 下午2:33:05 song.li@witontek.com Exp $
 */
public abstract class RtAbstractTest implements RtTestConstants {

    public static String         NOTIFY_URL = "https://wpay.witontek.com/wpay/test/notify.do";

    /**
     * Logger for this class
     */
    protected final Logger       logger     = LoggerFactory.getLogger(getClass());

    protected static WitonClient client     = new DefaultWitonClient(WITON_PUB_KEY, YOUR_PRI_KEY,
        GATEWAY_URL, PID);
}
