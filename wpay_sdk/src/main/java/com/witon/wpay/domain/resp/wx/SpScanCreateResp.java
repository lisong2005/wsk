/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.domain.resp.wx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.witon.wpay.domain.resp.AbstractResponse;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: SpScanCreateResp.java, v 0.1 2017年4月7日 下午2:01:49 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SpScanCreateResp extends AbstractResponse {

    /**  */
    private static final long serialVersionUID = -5429785932604134581L;

    /** 微信支付二维码地址 */
    private String            code_url;

    /**
     * Getter method for property <tt>code_url</tt>.
     * 
     * @return property value of code_url
     */
    public String getCode_url() {
        return code_url;
    }

    /**
     * Setter method for property <tt>code_url</tt>.
     * 
     * @param code_url value to be assigned to property code_url
     */
    public void setCode_url(String code_url) {
        this.code_url = code_url;
    }

}
