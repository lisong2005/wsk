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
 * @version $Id: SpScanCreateReq.java, v 0.1 2017年4月8日 上午9:08:11 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AliSpScanCreateReq extends AbstractSpReq {

    /**  */
    private static final long serialVersionUID = -3663634563789755832L;

    private String            subject;
    private String            body;
    @XmlElement(name = "goods_detail")
    private String            goodsDetail;

    @XmlElement(name = "operator_id")
    private String            operatorId;

    @XmlElement(name = "store_id")
    private String            storeId;

    @XmlElement(name = "terminal_id")
    private String            terminalId;

    @XmlElement(name = "alipay_store_id")
    private String            alipayStoreId;

    @XmlElement(name = "trade_no")
    private String            tradeNo;

    @XmlElement(name = "total_fee")
    private long              totalFee;

    /** 订单支付预设的结束时间，格式为 yyyyMMddHHmm，最小单位分 */
    @XmlElement(name = "time_expire")
    private String            timeExpire;

    @XmlElement(name = "notify_url")
    private String            notifyUrl;

    @XmlElement(name = "prod_tag")
    private String            prodTag;

    /**
     * Getter method for property <tt>subject</tt>.
     * 
     * @return property value of subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Setter method for property <tt>subject</tt>.
     * 
     * @param subject value to be assigned to property subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Getter method for property <tt>body</tt>.
     * 
     * @return property value of body
     */
    public String getBody() {
        return body;
    }

    /**
     * Setter method for property <tt>body</tt>.
     * 
     * @param body value to be assigned to property body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Getter method for property <tt>goodsDetail</tt>.
     * 
     * @return property value of goodsDetail
     */
    public String getGoodsDetail() {
        return goodsDetail;
    }

    /**
     * Setter method for property <tt>goodsDetail</tt>.
     * 
     * @param goodsDetail value to be assigned to property goodsDetail
     */
    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    /**
     * Getter method for property <tt>operatorId</tt>.
     * 
     * @return property value of operatorId
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * Setter method for property <tt>operatorId</tt>.
     * 
     * @param operatorId value to be assigned to property operatorId
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
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

    /**
     * Getter method for property <tt>alipayStoreId</tt>.
     * 
     * @return property value of alipayStoreId
     */
    public String getAlipayStoreId() {
        return alipayStoreId;
    }

    /**
     * Setter method for property <tt>alipayStoreId</tt>.
     * 
     * @param alipayStoreId value to be assigned to property alipayStoreId
     */
    public void setAlipayStoreId(String alipayStoreId) {
        this.alipayStoreId = alipayStoreId;
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
     * Getter method for property <tt>timeExpire</tt>.
     * 
     * @return property value of timeExpire
     */
    public String getTimeExpire() {
        return timeExpire;
    }

    /**
     * Setter method for property <tt>timeExpire</tt>.
     * 
     * @param timeExpire value to be assigned to property timeExpire
     */
    public void setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire;
    }

    /**
     * Getter method for property <tt>prodTag</tt>.
     * 
     * @return property value of prodTag
     */
    public String getProdTag() {
        return prodTag;
    }

    /**
     * Setter method for property <tt>prodTag</tt>.
     * 
     * @param prodTag value to be assigned to property prodTag
     */
    public void setProdTag(String prodTag) {
        this.prodTag = prodTag;
    }

    /**
     * Getter method for property <tt>notifyUrl</tt>.
     * 
     * @return property value of notifyUrl
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * Setter method for property <tt>notifyUrl</tt>.
     * 
     * @param notifyUrl value to be assigned to property notifyUrl
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

}
