/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.util;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.witon.wpay.util.bean.Person;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: JsonUtilTest.java, v 0.1 2017年4月6日 下午3:24:21 song.li@witontek.com Exp $
 */
public class JsonUtilTest {
    /**
    * Logger for this class
    */
    private static final Logger logger = LoggerFactory.getLogger(JsonUtilTest.class);

    @Test
    public void test_001() {
        try {
            logger.info("");

            Person p = new Person();
            p.setAge(11);
            p.setName("xx");
            logger.info("{}", p);

            String convertObjToJson = JsonUtils.convertObjToJson(p);
            logger.info("{}", convertObjToJson);
            logger.info("{}", JsonUtils.convertJsonToObj(convertObjToJson, Person.class));
        } catch (Exception e) {
            logger.error("", e);
        }
    }
}
