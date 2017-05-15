/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.domain.resp.alipay;

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
public class AliSpTradeRefundResp extends AbstractResponse {

    /**  */
    private static final long serialVersionUID = 5513381442562769614L;

    private String            trade_no;
    private String            wt_trade_no;
    private String            refund_no;
    private String            wt_refund_no;
    private long              refund_fee;
    private String            buyer_logon_id;
    private String            buyer_user_id;
    private String            refund_success_time;

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
     * Getter method for property <tt>refund_success_time</tt>.
     * 
     * @return property value of refund_success_time
     */
    public String getRefund_success_time() {
        return refund_success_time;
    }

    /**
     * Setter method for property <tt>refund_success_time</tt>.
     * 
     * @param refund_success_time value to be assigned to property refund_success_time
     */
    public void setRefund_success_time(String refund_success_time) {
        this.refund_success_time = refund_success_time;
    }

}
