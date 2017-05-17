/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.domain.req.un;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.witon.wpay.domain.req.AbstractRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: SpScanCreateReq.java, v 0.1 2017年4月8日 上午9:08:11 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UnTradeCreateReq extends AbstractRequest {

    /**  */
    private static final long serialVersionUID = -3663634563789755832L;

    @XmlElement(name = "body")
    private String            body;

    @XmlElement(name = "trade_no")
    private String            tradeNo;

    @XmlElement(name = "total_fee")
    private long              totalFee;

    @XmlElement(name = "notify_url")
    private String            notifyUrl;

    @XmlElement(name = "prod_tag")
    private String            prodTag;

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

}
