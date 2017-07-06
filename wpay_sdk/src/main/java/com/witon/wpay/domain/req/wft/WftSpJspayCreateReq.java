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
 * @version $Id: WftSpJspayCreateReq.java, v 0.1 2017年7月5日 上午10:03:11 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class WftSpJspayCreateReq extends AbstractSpReq {

    /**  */
    private static final long serialVersionUID = -1134967447604529572L;

    @XmlElement(name = "wx_appid")
    private String            wxAppId;

    @XmlElement(name = "open_id")
    private String            openId;

    private String            body;

    @XmlElement(name = "trade_no")
    private String            tradeNo;
    @XmlElement(name = "total_fee")
    private long              totalFee;

    @XmlElement(name = "create_ip")
    private String            createIp;

    @XmlElement(name = "notify_url")
    private String            notifyUrl;

    @XmlElement(name = "limit_pay")
    private String            limitPay;

    @XmlElement(name = "prod_tag")
    private String            prodTag;

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
     * Getter method for property <tt>openId</tt>.
     * 
     * @return property value of openId
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * Setter method for property <tt>openId</tt>.
     * 
     * @param openId value to be assigned to property openId
     */
    public void setOpenId(String openId) {
        this.openId = openId;
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
     * Getter method for property <tt>createIp</tt>.
     * 
     * @return property value of createIp
     */
    public String getCreateIp() {
        return createIp;
    }

    /**
     * Setter method for property <tt>createIp</tt>.
     * 
     * @param createIp value to be assigned to property createIp
     */
    public void setCreateIp(String createIp) {
        this.createIp = createIp;
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
     * Getter method for property <tt>limitPay</tt>.
     * 
     * @return property value of limitPay
     */
    public String getLimitPay() {
        return limitPay;
    }

    /**
     * Setter method for property <tt>limitPay</tt>.
     * 
     * @param limitPay value to be assigned to property limitPay
     */
    public void setLimitPay(String limitPay) {
        this.limitPay = limitPay;
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
