/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.domain.req.up;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.witon.wpay.domain.req.AbstractSpReq;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UpSpTradeQueryReq.java, v 0.1 2017年6月30日 上午11:24:54 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UpSpTradeQueryReq extends AbstractSpReq {

    /**  */
    private static final long serialVersionUID = -3683163378696886007L;

    @XmlElement(name = "trade_no")
    private String            tradeNo;

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
