/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.domain.req.up;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.witon.wpay.domain.req.AbstractSpReq;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UpSpTradeRefundQueryReq.java, v 0.1 2017年6月30日 上午11:25:29 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UpSpTradeRefundQueryReq extends AbstractSpReq {

    /**  */
    private static final long serialVersionUID = -1152762371156553121L;

    @XmlElement(name = "refund_no")
    private String            refundNo;

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
