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
 * @version $Id: SpTradeRefundQueryReq.java, v 0.1 2017年4月8日 上午9:21:29 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SpTradeRefundQueryReq extends AbstractSpReq {

    /**  */
    private static final long serialVersionUID = -5074666727448530123L;

    @XmlElement(name = "wx_appid")
    private String            wxAppId;

    @XmlElement(name = "refund_no")
    private String            refundNo;

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

}
