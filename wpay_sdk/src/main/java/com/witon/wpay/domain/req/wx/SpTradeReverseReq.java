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
 * @version $Id: SpTradeReverseReq.java, v 0.1 2017年4月8日 上午9:21:56 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SpTradeReverseReq extends AbstractRequest {

    /**  */
    private static final long serialVersionUID = -5138984674537541373L;

    @XmlElement(name = "wx_appid")
    private String            wxAppId;

    @XmlElement(name = "trade_no")
    private String            tradeNo;

    @XmlElement(name = "wt_trade_no")
    private String            wtTradeNo;

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
