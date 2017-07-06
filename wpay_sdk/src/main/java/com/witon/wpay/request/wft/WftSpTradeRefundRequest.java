/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.wft;

import com.witon.wpay.domain.req.wft.WftSpTradeRefundReq;
import com.witon.wpay.domain.resp.wft.WftSpTradeRefundResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WftSpTradeRefundRequest.java, v 0.1 2017年7月6日 下午3:47:43 song.li@witontek.com Exp $
 */
public class WftSpTradeRefundRequest extends
                                     AbstractWitonRequest<WftSpTradeRefundReq, WftSpTradeRefundResp> {

    /**  */
    private static final long   serialVersionUID = 148434262262060569L;

    private WftSpTradeRefundReq bizReq;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.wft.trade.refund";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public WftSpTradeRefundReq getBizReq() {
        return bizReq;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractSpReq)
     */
    @Override
    public void setBizReq(WftSpTradeRefundReq biz_content) {
        this.bizReq = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<WftSpTradeRefundResp> getRespClazz() {
        return WftSpTradeRefundResp.class;
    }

}
