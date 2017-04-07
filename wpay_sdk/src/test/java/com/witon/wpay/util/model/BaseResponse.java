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
 * @version $Id: BaseResponse.java, v 0.1 2017年3月23日 下午5:03:21 song.li@witontek.com Exp $
 */
@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class BaseResponse extends BaseModel {

    /**  */
    private static final long serialVersionUID = 8262039605293919149L;

    private String            code;
    private String            msg;

    @XmlElement(name = "sub_code")
    private String            subCode;
    @XmlElement(name = "sub_msg")
    private String            subMsg;

    private long              timestamp;
    private String            respContent;

    private String            sign;
    private String            signType         = "RSA2";

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
     * Getter method for property <tt>subCode</tt>.
     * 
     * @return property value of subCode
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * Setter method for property <tt>subCode</tt>.
     * 
     * @param subCode value to be assigned to property subCode
     */
    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    /**
     * Getter method for property <tt>subMsg</tt>.
     * 
     * @return property value of subMsg
     */
    public String getSubMsg() {
        return subMsg;
    }

    /**
     * Setter method for property <tt>subMsg</tt>.
     * 
     * @param subMsg value to be assigned to property subMsg
     */
    public void setSubMsg(String subMsg) {
        this.subMsg = subMsg;
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

}
