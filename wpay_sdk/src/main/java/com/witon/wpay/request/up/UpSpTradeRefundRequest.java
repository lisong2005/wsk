/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.up;

import com.witon.wpay.domain.req.up.UpSpTradeRefundReq;
import com.witon.wpay.domain.resp.up.UpSpTradeRefundResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UpSpTradeRefundRequest.java, v 0.1 2017年7月27日 上午8:28:10 song.li@witontek.com Exp $
 */
public class UpSpTradeRefundRequest extends
                                    AbstractWitonRequest<UpSpTradeRefundReq, UpSpTradeRefundResp> {

    /**  */
    private static final long  serialVersionUID = 2708638846365238817L;
    private UpSpTradeRefundReq bizReq;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.up.trade.refund";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public UpSpTradeRefundReq getBizReq() {
        return this.bizReq;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractSpReq)
     */
    @Override
    public void setBizReq(UpSpTradeRefundReq biz_content) {
        this.bizReq = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<UpSpTradeRefundResp> getRespClazz() {
        return UpSpTradeRefundResp.class;
    }

}
