/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.domain.req.alipay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.witon.wpay.domain.req.AbstractRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: SpTradeRefundReq.java, v 0.1 2017年5月10日 上午11:10:40 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AliSpTradeRefundReq extends AbstractRequest {

    /**  */
    private static final long serialVersionUID = 2983661151420160979L;

    @XmlElement(name = "trade_no")
    private String            tradeNo;

    @XmlElement(name = "wt_trade_no")
    private String            wtTradeNo;

    @XmlElement(name = "refund_no")
    private String            refundNo;

    @XmlElement(name = "refund_reason")
    private String            refundReason;

    @XmlElement(name = "refund_fee")
    private long              refundFee;

    @XmlElement(name = "op_user_id")
    private String            opUserId;

    @XmlElement(name = "store_id")
    private String            storeId;

    @XmlElement(name = "terminal_id")
    private String            terminalId;

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
     * Getter method for property <tt>refundReason</tt>.
     * 
     * @return property value of refundReason
     */
    public String getRefundReason() {
        return refundReason;
    }

    /**
     * Setter method for property <tt>refundReason</tt>.
     * 
     * @param refundReason value to be assigned to property refundReason
     */
    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
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

    /**
     * Getter method for property <tt>storeId</tt>.
     * 
     * @return property value of storeId
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * Setter method for property <tt>storeId</tt>.
     * 
     * @param storeId value to be assigned to property storeId
     */
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    /**
     * Getter method for property <tt>terminalId</tt>.
     * 
     * @return property value of terminalId
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Setter method for property <tt>terminalId</tt>.
     * 
     * @param terminalId value to be assigned to property terminalId
     */
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

}
