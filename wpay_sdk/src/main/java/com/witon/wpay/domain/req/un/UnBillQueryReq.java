/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.domain.req.un;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.witon.wpay.domain.req.AbstractSpReq;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UnBillQueryReq.java, v 0.1 2017年8月15日 下午4:32:07 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UnBillQueryReq extends AbstractSpReq {

    /**  */
    private static final long serialVersionUID = -8039296766554589133L;

    @XmlElement(name = "bill_date")
    private String            billDate;

    @XmlElement(name = "bill_type")
    private String            billType;

    /**
     * Getter method for property <tt>billDate</tt>.
     * 
     * @return property value of billDate
     */
    public String getBillDate() {
        return billDate;
    }

    /**
     * Setter method for property <tt>billDate</tt>.
     * 
     * @param billDate value to be assigned to property billDate
     */
    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    /**
     * Getter method for property <tt>billType</tt>.
     * 
     * @return property value of billType
     */
    public String getBillType() {
        return billType;
    }

    /**
     * Setter method for property <tt>billType</tt>.
     * 
     * @param billType value to be assigned to property billType
     */
    public void setBillType(String billType) {
        this.billType = billType;
    }

}
