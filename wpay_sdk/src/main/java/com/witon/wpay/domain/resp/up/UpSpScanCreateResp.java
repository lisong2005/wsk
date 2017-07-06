/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.domain.resp.up;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.witon.wpay.domain.resp.AbstractSpResp;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UpSpScanCreateResp.java, v 0.1 2017年6月30日 上午11:56:32 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UpSpScanCreateResp extends AbstractSpResp {

    /**  */
    private static final long serialVersionUID = 1858152897299230137L;

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
