/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.domain.resp.wft;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.witon.wpay.domain.resp.AbstractSpResp;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WftSpJspayCreateResp.java, v 0.1 2017年7月5日 上午11:03:29 song.li@witontek.com Exp $
 */
@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class WftSpJspayCreateResp extends AbstractSpResp {

    /**  */
    private static final long serialVersionUID = -5365312950674247526L;

    /** 微信公众号id */
    private String            wx_appId;
    /** 当前的时间，精确到秒 */
    private String            wx_timeStamp;
    /** 随机字符串 */
    private String            wx_nonceStr;
    /** 订单详情扩展字符串 */
    private String            wx_package;
    /** 签名方式 */
    private String            wx_signType;
    /** 签名 */
    private String            wx_paySign;
    /** 综合支付平台订单支付页面 */
    private String            wt_pay_url;

    /**
     * Getter method for property <tt>wx_appId</tt>.
     * 
     * @return property value of wx_appId
     */
    public String getWx_appId() {
        return wx_appId;
    }

    /**
     * Setter method for property <tt>wx_appId</tt>.
     * 
     * @param wx_appId value to be assigned to property wx_appId
     */
    public void setWx_appId(String wx_appId) {
        this.wx_appId = wx_appId;
    }

    /**
     * Getter method for property <tt>wx_timeStamp</tt>.
     * 
     * @return property value of wx_timeStamp
     */
    public String getWx_timeStamp() {
        return wx_timeStamp;
    }

    /**
     * Setter method for property <tt>wx_timeStamp</tt>.
     * 
     * @param wx_timeStamp value to be assigned to property wx_timeStamp
     */
    public void setWx_timeStamp(String wx_timeStamp) {
        this.wx_timeStamp = wx_timeStamp;
    }

    /**
     * Getter method for property <tt>wx_nonceStr</tt>.
     * 
     * @return property value of wx_nonceStr
     */
    public String getWx_nonceStr() {
        return wx_nonceStr;
    }

    /**
     * Setter method for property <tt>wx_nonceStr</tt>.
     * 
     * @param wx_nonceStr value to be assigned to property wx_nonceStr
     */
    public void setWx_nonceStr(String wx_nonceStr) {
        this.wx_nonceStr = wx_nonceStr;
    }

    /**
     * Getter method for property <tt>wx_package</tt>.
     * 
     * @return property value of wx_package
     */
    public String getWx_package() {
        return wx_package;
    }

    /**
     * Setter method for property <tt>wx_package</tt>.
     * 
     * @param wx_package value to be assigned to property wx_package
     */
    public void setWx_package(String wx_package) {
        this.wx_package = wx_package;
    }

    /**
     * Getter method for property <tt>wx_signType</tt>.
     * 
     * @return property value of wx_signType
     */
    public String getWx_signType() {
        return wx_signType;
    }

    /**
     * Setter method for property <tt>wx_signType</tt>.
     * 
     * @param wx_signType value to be assigned to property wx_signType
     */
    public void setWx_signType(String wx_signType) {
        this.wx_signType = wx_signType;
    }

    /**
     * Getter method for property <tt>wx_paySign</tt>.
     * 
     * @return property value of wx_paySign
     */
    public String getWx_paySign() {
        return wx_paySign;
    }

    /**
     * Setter method for property <tt>wx_paySign</tt>.
     * 
     * @param wx_paySign value to be assigned to property wx_paySign
     */
    public void setWx_paySign(String wx_paySign) {
        this.wx_paySign = wx_paySign;
    }

    /**
     * Getter method for property <tt>wt_pay_url</tt>.
     * 
     * @return property value of wt_pay_url
     */
    public String getWt_pay_url() {
        return wt_pay_url;
    }

    /**
     * Setter method for property <tt>wt_pay_url</tt>.
     * 
     * @param wt_pay_url value to be assigned to property wt_pay_url
     */
    public void setWt_pay_url(String wt_pay_url) {
        this.wt_pay_url = wt_pay_url;
    }

}
