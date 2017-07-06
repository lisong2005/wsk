/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.domain.req.wx;

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
public class SpScanCreateReq extends AbstractSpReq {

    /**  */
    private static final long serialVersionUID = -3663634563789755832L;

    @XmlElement(name = "wx_appid")
    private String            wxAppId;

    @XmlElement(name = "prod_tag")
    private String            prodTag;

    @XmlElement(name = "device_info")
    private String            deviceInfo;

    private String            body;
    private String            detail;
    private String            attach;

    @XmlElement(name = "trade_no")
    private String            tradeNo;

    @XmlElement(name = "total_fee")
    private long              totalFee;

    @XmlElement(name = "create_ip")
    private String            createIp;

    @XmlElement(name = "product_id")
    private String            productId;

    @XmlElement(name = "time_start")
    private String            timeStart;

    @XmlElement(name = "time_expire")
    private String            timeExpire;

    @XmlElement(name = "goods_tag")
    private String            goodsTag;

    @XmlElement(name = "notify_url")
    private String            notifyUrl;

    @XmlElement(name = "limit_pay")
    private String            limitPay;

    /**
     * Getter method for property <tt>productId</tt>.
     * 
     * @return property value of productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Setter method for property <tt>productId</tt>.
     * 
     * @param productId value to be assigned to property productId
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

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
     * Getter method for property <tt>detail</tt>.
     * 
     * @return property value of detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * Setter method for property <tt>detail</tt>.
     * 
     * @param detail value to be assigned to property detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * Getter method for property <tt>attach</tt>.
     * 
     * @return property value of attach
     */
    public String getAttach() {
        return attach;
    }

    /**
     * Setter method for property <tt>attach</tt>.
     * 
     * @param attach value to be assigned to property attach
     */
    public void setAttach(String attach) {
        this.attach = attach;
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
     * Getter method for property <tt>timeStart</tt>.
     * 
     * @return property value of timeStart
     */
    public String getTimeStart() {
        return timeStart;
    }

    /**
     * Setter method for property <tt>timeStart</tt>.
     * 
     * @param timeStart value to be assigned to property timeStart
     */
    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
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
     * Getter method for property <tt>goodsTag</tt>.
     * 
     * @return property value of goodsTag
     */
    public String getGoodsTag() {
        return goodsTag;
    }

    /**
     * Setter method for property <tt>goodsTag</tt>.
     * 
     * @param goodsTag value to be assigned to property goodsTag
     */
    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
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

}
