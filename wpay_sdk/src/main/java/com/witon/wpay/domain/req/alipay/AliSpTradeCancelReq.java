/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.domain.req.alipay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.witon.wpay.domain.req.AbstractSpReq;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: SpTradeCancelReq.java, v 0.1 2017年5月10日 上午11:08:09 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AliSpTradeCancelReq extends AbstractSpReq {

    /**  */
    private static final long serialVersionUID = 746662696579107674L;

    @XmlElement(name = "trade_no")
    private String            tradeNo;

    @XmlElement(name = "reverse_no")
    private String            reverseNo;

    /**
     * Getter method for property <tt>reverseNo</tt>.
     * 
     * @return property value of reverseNo
     */
    public String getReverseNo() {
        return reverseNo;
    }

    /**
     * Setter method for property <tt>reverseNo</tt>.
     * 
     * @param reverseNo value to be assigned to property reverseNo
     */
    public void setReverseNo(String reverseNo) {
        this.reverseNo = reverseNo;
    }

    /**
     * Getter method for property <tt>tradeNo</tt>.
     * 
     * @return property value of tradeNo
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * Setter method for property <tt>tradeNo</tt>.
     * 
     * @param tradeNo value to be assigned to property tradeNo
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

}
