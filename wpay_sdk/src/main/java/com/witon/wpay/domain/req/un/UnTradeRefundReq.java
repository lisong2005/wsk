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
 * @version $Id: UnTradeRefundReq.java, v 0.1 2017年8月18日 下午2:14:59 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UnTradeRefundReq extends AbstractSpReq {

    /**  */
    private static final long serialVersionUID = -4013479803768640456L;

    @XmlElement(name = "trade_no")
    private String            tradeNo;

    @XmlElement(name = "refund_no")
    private String            refundNo;

    @XmlElement(name = "refund_fee")
    private long              refundFee;

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
     * Getter method for property <tt>refundNo</tt>.
     * 
     * @return property value of refundNo
     */
    public String getRefundNo() {
        return refundNo;
    }

    /**
     * Setter method for property <tt>refundNo</tt>.
     * 
     * @param refundNo value to be assigned to property refundNo
     */
    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    /**
     * Getter method for property <tt>refundFee</tt>.
     * 
     * @return property value of refundFee
     */
    public long getRefundFee() {
        return refundFee;
    }

    /**
     * Setter method for property <tt>refundFee</tt>.
     * 
     * @param refundFee value to be assigned to property refundFee
     */
    public void setRefundFee(long refundFee) {
        this.refundFee = refundFee;
    }

}
