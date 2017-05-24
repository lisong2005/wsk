/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: StringFormatTest.java, v 0.1 2017年5月19日 下午4:00:36 song.li@witontek.com Exp $
 */
public class StringFormatTest {
    /**
    * Logger for this class
    */
    private static final Logger logger = LoggerFactory.getLogger(StringFormatTest.class);

    @Test
    public void test_001() {
        logger.info("");
        System.out.println(String.format("%10s", "111"));

    }
}
