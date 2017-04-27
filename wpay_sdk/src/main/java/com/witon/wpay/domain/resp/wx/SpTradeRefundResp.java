/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.domain.resp.wx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.witon.wpay.domain.resp.AbstractResponse;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: SpTradeRefundResp.java, v 0.1 2017年4月7日 下午2:16:45 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SpTradeRefundResp extends AbstractResponse {

    /**  */
    private static final long serialVersionUID = 5513381442562769614L;

    private String            trade_no;
    private String            wt_trade_no;
    private String            refund_no;
    private String            wt_refund_no;
    private long              refund_fee;
    private long              total_fee;

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
     * Getter method for property <tt>refund_no</tt>.
     * 
     * @return property value of refund_no
     */
    public String getRefund_no() {
        return refund_no;
    }

    /**
     * Setter method for property <tt>refund_no</tt>.
     * 
     * @param refund_no value to be assigned to property refund_no
     */
    public void setRefund_no(String refund_no) {
        this.refund_no = refund_no;
    }

    /**
     * Getter method for property <tt>wt_refund_no</tt>.
     * 
     * @return property value of wt_refund_no
     */
    public String getWt_refund_no() {
        return wt_refund_no;
    }

    /**
     * Setter method for property <tt>wt_refund_no</tt>.
     * 
     * @param wt_refund_no value to be assigned to property wt_refund_no
     */
    public void setWt_refund_no(String wt_refund_no) {
        this.wt_refund_no = wt_refund_no;
    }

    /**
     * Getter method for property <tt>refund_fee</tt>.
     * 
     * @return property value of refund_fee
     */
    public long getRefund_fee() {
        return refund_fee;
    }

    /**
     * Setter method for property <tt>refund_fee</tt>.
     * 
     * @param refund_fee value to be assigned to property refund_fee
     */
    public void setRefund_fee(long refund_fee) {
        this.refund_fee = refund_fee;
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

}
