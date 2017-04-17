/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay;

import com.witon.wpay.util.BaseModel;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WitonResponse.java, v 0.1 2017年4月17日 下午1:07:32 song.li@witontek.com Exp $
 */
public class WitonResponse<T> extends BaseModel {

    /**  */
    private static final long serialVersionUID = 3017829044386342059L;

    private String            code;
    private String            msg;
    private String            sub_code;
    private String            sub_msg;
    private long              timestamp;

    private String            signType;
    private String            sign;

    private String            respContent;

    private T                 bizResp;

    private Class<T>          bizRespClass;

    /**
     * Getter method for property <tt>code</tt>.
     * 
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     * 
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter method for property <tt>msg</tt>.
     * 
     * @return property value of msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Setter method for property <tt>msg</tt>.
     * 
     * @param msg value to be assigned to property msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * Getter method for property <tt>sub_code</tt>.
     * 
     * @return property value of sub_code
     */
    public String getSub_code() {
        return sub_code;
    }

    /**
     * Setter method for property <tt>sub_code</tt>.
     * 
     * @param sub_code value to be assigned to property sub_code
     */
    public void setSub_code(String sub_code) {
        this.sub_code = sub_code;
    }

    /**
     * Getter method for property <tt>sub_msg</tt>.
     * 
     * @return property value of sub_msg
     */
    public String getSub_msg() {
        return sub_msg;
    }

    /**
     * Setter method for property <tt>sub_msg</tt>.
     * 
     * @param sub_msg value to be assigned to property sub_msg
     */
    public void setSub_msg(String sub_msg) {
        this.sub_msg = sub_msg;
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
     * Getter method for property <tt>respContent</tt>.
     * 
     * @return property value of respContent
     */
    public String getRespContent() {
        return respContent;
    }

    /**
     * Setter method for property <tt>respContent</tt>.
     * 
     * @param respContent value to be assigned to property respContent
     */
    public void setRespContent(String respContent) {
        this.respContent = respContent;
    }

    /**
     * Getter method for property <tt>bizResp</tt>.
     * 
     * @return property value of bizResp
     */
    public T getBizResp() {
        return bizResp;
    }

    /**
     * Setter method for property <tt>bizResp</tt>.
     * 
     * @param bizResp value to be assigned to property bizResp
     */
    public void setBizResp(T bizResp) {
        this.bizResp = bizResp;
    }

    /**
     * Getter method for property <tt>bizRespClass</tt>.
     * 
     * @return property value of bizRespClass
     */
    public Class<T> getBizRespClass() {
        return bizRespClass;
    }

}
