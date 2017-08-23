/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.domain.resp.un;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.witon.wpay.domain.resp.AbstractSpResp;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UnTradeQueryResp.java, v 0.1 2017年8月18日 下午2:14:24 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UnTradeQueryResp extends AbstractSpResp {

    /**  */
    private static final long serialVersionUID = -4109350448539418908L;

    private String            trade_no;
    private String            wt_trade_no;
    private long              total_fee;
    private String            time_end;
    private String            trade_state;
    private String            channel;

    /**
     * Getter method for property <tt>channel</tt>.
     * 
     * @return property value of channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Setter method for property <tt>channel</tt>.
     * 
     * @param channel value to be assigned to property channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
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
