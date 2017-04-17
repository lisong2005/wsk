/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.domain.req.wx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.witon.wpay.domain.req.AbstractRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: SpTradeRefundReq.java, v 0.1 2017年4月8日 上午9:21:39 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SpTradeRefundReq extends AbstractRequest {

    /**  */
    private static final long serialVersionUID = -3895319551568233808L;

    @XmlElement(name = "wx_appid")
    private String            wxAppId;

    @XmlElement(name = "device_info")
    private String            deviceInfo;

    @XmlElement(name = "trade_no")
    private String            tradeNo;

    @XmlElement(name = "wt_trado_no")
    private String            wtTradeNo;

    @XmlElement(name = "total_fee")
    private long              totalFee;

    @XmlElement(name = "refund_no")
    private String            refundNo;

    @XmlElement(name = "refund_fee")
    private long              refundFee;

    @XmlElement(name = "op_user_id")
    private String            opUserId;

    @XmlElement(name = "refund_account")
    private String            refundAccount;

    /**
     * Getter method for property <tt>wxAppId</tt>.
     * 
     * @return property value of wxAppId
     */
    public String getWxAppId() {
        return wxAppId;
    }

    /**
     * Setter method for property <tt>wxAppId</tt>.
     * 
     * @param wxAppId value to be assigned to property wxAppId
     */
    public void setWxAppId(String wxAppId) {
        this.wxAppId = wxAppId;
    }

    /**
     * Getter method for property <tt>deviceInfo</tt>.
     * 
     * @return property value of deviceInfo
     */
    public String getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * Setter method for property <tt>deviceInfo</tt>.
     * 
     * @param deviceInfo value to be assigned to property deviceInfo
     */
    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
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
     * Getter method for property <tt>totalFee</tt>.
     * 
     * @return property value of totalFee
     */
    public long getTotalFee() {
        return totalFee;
    }

    /**
     * Setter method for property <tt>totalFee</tt>.
     * 
     * @param totalFee value to be assigned to property totalFee
     */
    public void setTotalFee(long totalFee) {
        this.totalFee = totalFee;
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

    /**
     * Getter method for property <tt>refundAccount</tt>.
     * 
     * @return property value of refundAccount
     */
    public String getRefundAccount() {
        return refundAccount;
    }

    /**
     * Setter method for property <tt>refundAccount</tt>.
     * 
     * @param refundAccount value to be assigned to property refundAccount
     */
    public void setRefundAccount(String refundAccount) {
        this.refundAccount = refundAccount;
    }

}
