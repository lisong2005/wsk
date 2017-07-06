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
 * @version $Id: UpSpBillQueryResp.java, v 0.1 2017年6月30日 上午11:28:44 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UpSpBillQueryResp extends AbstractSpResp {
    /**  */
    private static final long serialVersionUID = -1297820108765059979L;

    private String            url;

    /**
     * Getter method for property <tt>url</tt>.
     * 
     * @return property value of url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Setter method for property <tt>url</tt>.
     * 
     * @param url value to be assigned to property url
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
