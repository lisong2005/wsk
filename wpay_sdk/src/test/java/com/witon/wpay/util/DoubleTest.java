/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.util;

import java.math.BigDecimal;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: DoubleTest.java, v 0.1 2017年4月20日 上午9:06:23 song.li@witontek.com Exp $
 */
public class DoubleTest {
    /**
    * Logger for this class
    */
    private static final Logger logger = LoggerFactory.getLogger(DoubleTest.class);

    @Test
    public void test_001() {
        BigDecimal arg = new BigDecimal("9999999999999.9999");
        logger.info("{}", String.format("%f", arg.doubleValue()));
        logger.info("{}", String.format("%f", arg.multiply(new BigDecimal(10000))));
        logger.info("{}", String.format("%d", arg.multiply(new BigDecimal(10000)).longValue()));
    }
}
