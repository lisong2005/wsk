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
 * @version $Id: WftSpTradeQueryResp.java, v 0.1 2017年7月5日 下午1:24:08 song.li@witontek.com Exp $
 */
@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class WftSpTradeQueryResp extends AbstractSpResp {

    /**  */
    private static final long serialVersionUID = -7243199466695235941L;

    private String            openid;
    private String            bank_type;
    private long              total_fee;

    private String            wt_trade_no;
    private String            trade_no;

    private String            time_end;
    private String            trade_state;

    /**
     * Getter method for property <tt>openid</tt>.
     * 
     * @return property value of openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * Setter method for property <tt>openid</tt>.
     * 
     * @param openid value to be assigned to property openid
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * Getter method for property <tt>bank_type</tt>.
     * 
     * @return property value of bank_type
     */
    public String getBank_type() {
        return bank_type;
    }

    /**
     * Setter method for property <tt>bank_type</tt>.
     * 
     * @param bank_type value to be assigned to property bank_type
     */
    public void setBank_type(String bank_type) {
        this.bank_type = bank_type;
    }

    /**
     * Getter method for property <tt>total_fee</tt>.
     * 
     * @return property value of total_fee
     */
    public long getTotal_fee() {
        return total_fee;
    }

    /**
     * Setter method for property <tt>total_fee</tt>.
     * 
     * @param total_fee value to be assigned to property total_fee
     */
    public void setTotal_fee(long total_fee) {
        this.total_fee = total_fee;
    }

    /**
     * Getter method for property <tt>wt_trade_no</tt>.
     * 
     * @return property value of wt_trade_no
     */
    public String getWt_trade_no() {
        return wt_trade_no;
    }

    /**
     * Setter method for property <tt>wt_trade_no</tt>.
     * 
     * @param wt_trade_no value to be assigned to property wt_trade_no
     */
    public void setWt_trade_no(String wt_trade_no) {
        this.wt_trade_no = wt_trade_no;
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
     * Getter method for property <tt>time_end</tt>.
     * 
     * @return property value of time_end
     */
    public String getTime_end() {
        return time_end;
    }

    /**
     * Setter method for property <tt>time_end</tt>.
     * 
     * @param time_end value to be assigned to property time_end
     */
    public void setTime_end(String time_end) {
        this.time_end = time_end;
    }

    /**
     * Getter method for property <tt>trade_state</tt>.
     * 
     * @return property value of trade_state
     */
    public String getTrade_state() {
        return trade_state;
    }

    /**
     * Setter method for property <tt>trade_state</tt>.
     * 
     * @param trade_state value to be assigned to property trade_state
     */
    public void setTrade_state(String trade_state) {
        this.trade_state = trade_state;
    }

}
