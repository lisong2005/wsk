/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.domain.req.wft;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.witon.wpay.domain.req.AbstractSpReq;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WftSpTradeRefundReq.java, v 0.1 2017年7月5日 上午10:13:51 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class WftSpTradeRefundReq extends AbstractSpReq {

    /**  */
    private static final long serialVersionUID = 4680588094498838017L;

    @XmlElement(name = "trade_no")
    private String            tradeNo;

    @XmlElement(name = "refund_no")
    private String            refundNo;

    @XmlElement(name = "refund_fee")
    private long              refundFee;

    @XmlElement(name = "op_user_id")
    private String            opUserId;

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

    /**
     * Getter method for property <tt>opUserId</tt>.
     * 
     * @return property value of opUserId
     */
    public String getOpUserId() {
        return opUserId;
    }

    /**
     * Setter method for property <tt>opUserId</tt>.
     * 
     * @param opUserId value to be assigned to property opUserId
     */
    public void setOpUserId(String opUserId) {
        this.opUserId = opUserId;
    }

}
