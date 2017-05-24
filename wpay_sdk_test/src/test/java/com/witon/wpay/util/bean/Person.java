/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.util.bean;

import com.witon.wpay.util.BaseModel;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: Person.java, v 0.1 2017年4月6日 下午3:24:34 song.li@witontek.com Exp $
 */
public class Person extends BaseModel {

    /**  */
    private static final long serialVersionUID = -6878116386877588890L;
    private int               age;
    private String            name;

    /**
     * Getter method for property <tt>age</tt>.
     * 
     * @return property value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter method for property <tt>age</tt>.
     * 
     * @param age value to be assigned to property age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Getter method for property <tt>name</tt>.
     * 
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     * 
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

}
