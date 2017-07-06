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
 * @version $Id: WftSpBillQueryResp.java, v 0.1 2017年7月5日 上午11:02:34 song.li@witontek.com Exp $
 */
@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class WftSpBillQueryResp extends AbstractSpResp {

    /**  */
    private static final long serialVersionUID = -4672253952021941225L;

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
