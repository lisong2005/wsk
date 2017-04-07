/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.util.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.witon.wpay.util.BaseModel;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: BaseRequest.java, v 0.1 2017年3月23日 下午5:03:03 song.li@witontek.com Exp $
 */
@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class BaseRequest extends BaseModel {

    /**  */
    private static final long serialVersionUID = -7840506067117874604L;

    @XmlElement(name = "app_id")
    private String            pid;

    private String            method;

    @XmlElement(name = "sign_type")
    private String            signType;

    private String            sign;
    private long              timestamp;
    private String            version;

    @XmlElement(name = "biz_content")
    private String            bizContent;

    /**
     * Getter method for property <tt>pid</tt>.
     * 
     * @return property value of pid
     */
    public String getPid() {
        return pid;
    }

    /**
     * Setter method for property <tt>pid</tt>.
     * 
     * @param pid value to be assigned to property pid
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * Getter method for property <tt>method</tt>.
     * 
     * @return property value of method
     */
    public String getMethod() {
        return method;
    }

    /**
     * Setter method for property <tt>method</tt>.
     * 
     * @param method value to be assigned to property method
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * Getter method for property <tt>signType</tt>.
     * 
     * @return property value of signType
     */
    public String getSignType() {
        return signType;
    }

    /**
     * Setter method for property <tt>signType</tt>.
     * 
     * @param signType value to be assigned to property signType
     */
    public void setSignType(String signType) {
        this.signType = signType;
    }

    /**
     * Getter method for property <tt>sign</tt>.
     * 
     * @return property value of sign
     */
    public String getSign() {
        return sign;
    }

    /**
     * Setter method for property <tt>sign</tt>.
     * 
     * @param sign value to be assigned to property sign
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * Getter method for property <tt>timestamp</tt>.
     * 
     * @return property value of timestamp
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Setter method for property <tt>timestamp</tt>.
     * 
     * @param timestamp value to be assigned to property timestamp
     */
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Getter method for property <tt>version</tt>.
     * 
     * @return property value of version
     */
    public String getVersion() {
        return version;
    }

    /**
     * Setter method for property <tt>version</tt>.
     * 
     * @param version value to be assigned to property version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Getter method for property <tt>bizContent</tt>.
     * 
     * @return property value of bizContent
     */
    public String getBizContent() {
        return bizContent;
    }

    /**
     * Setter method for property <tt>bizContent</tt>.
     * 
     * @param bizContent value to be assigned to property bizContent
     */
    public void setBizContent(String bizContent) {
        this.bizContent = bizContent;
    }

}
