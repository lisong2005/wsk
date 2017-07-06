/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.domain.resp.alipay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.witon.wpay.domain.resp.AbstractSpResp;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: AliSpTradeCancelResp.java, v 0.1 2017年5月10日 下午1:16:02 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AliSpTradeCancelResp extends AbstractSpResp {

    /**  */
    private static final long serialVersionUID = -8290656967918943805L;

    private String            recall;
    private String            trade_no;
    private String            action;

    /**
     * Getter method for property <tt>recall</tt>.
     * 
     * @return property value of recall
     */
    public String getRecall() {
        return recall;
    }

    /**
     * Setter method for property <tt>recall</tt>.
     * 
     * @param recall value to be assigned to property recall
     */
    public void setRecall(String recall) {
        this.recall = recall;
    }

    /**
     * Getter method for property <tt>trade_no</tt>.
     * 
     * @return property value of trade_no
     */
    public String getTrade_no() {
        return trade_no;
    }

    /**
     * Setter method for property <tt>trade_no</tt>.
     * 
     * @param trade_no value to be assigned to property trade_no
     */
    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    /**
     * Getter method for property <tt>action</tt>.
     * 
     * @return property value of action
     */
    public String getAction() {
        return action;
    }

    /**
     * Setter method for property <tt>action</tt>.
     * 
     * @param action value to be assigned to property action
     */
    public void setAction(String action) {
        this.action = action;
    }

}
