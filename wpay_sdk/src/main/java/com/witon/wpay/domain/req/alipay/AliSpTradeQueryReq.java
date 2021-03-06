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
 * @version $Id: SpTradeQueryReq.java, v 0.1 2017年5月10日 上午11:06:50 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AliSpTradeQueryReq extends AbstractSpReq {

    /**  */
    private static final long serialVersionUID = 6512132106848128822L;

    @XmlElement(name = "trade_no")
    private String            tradeNo;

    @XmlElement(name = "wt_trade_no")
    private String            wtTradeNo;

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

    /**
     * Getter method for property <tt>wtTradeNo</tt>.
     * 
     * @return property value of wtTradeNo
     */
    public String getWtTradeNo() {
        return wtTradeNo;
    }

    /**
     * Setter method for property <tt>wtTradeNo</tt>.
     * 
     * @param wtTradeNo value to be assigned to property wtTradeNo
     */
    public void setWtTradeNo(String wtTradeNo) {
        this.wtTradeNo = wtTradeNo;
    }

}
