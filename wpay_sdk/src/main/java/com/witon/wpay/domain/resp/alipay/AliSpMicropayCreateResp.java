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
 * @version $Id: SpMicropayCreateResp.java, v 0.1 2017年4月7日 下午2:12:07 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AliSpMicropayCreateResp extends AbstractSpResp {

    /**  */
    private static final long serialVersionUID = -651003420190520615L;

    private String            buyer_logon_id;
    private String            buyer_user_id;
    private long              total_fee;
    private String            wt_trade_no;
    private String            trade_no;
    private String            time_end;

    /**
     * Getter method for property <tt>buyer_logon_id</tt>.
     * 
     * @return property value of buyer_logon_id
     */
    public String getBuyer_logon_id() {
        return buyer_logon_id;
    }

    /**
     * Setter method for property <tt>buyer_logon_id</tt>.
     * 
     * @param buyer_logon_id value to be assigned to property buyer_logon_id
     */
    public void setBuyer_logon_id(String buyer_logon_id) {
        this.buyer_logon_id = buyer_logon_id;
    }

    /**
     * Getter method for property <tt>buyer_user_id</tt>.
     * 
     * @return property value of buyer_user_id
     */
    public String getBuyer_user_id() {
        return buyer_user_id;
    }

    /**
     * Setter method for property <tt>buyer_user_id</tt>.
     * 
     * @param buyer_user_id value to be assigned to property buyer_user_id
     */
    public void setBuyer_user_id(String buyer_user_id) {
        this.buyer_user_id = buyer_user_id;
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

}
