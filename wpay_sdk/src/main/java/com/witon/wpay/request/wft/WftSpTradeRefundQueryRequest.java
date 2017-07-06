/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.wft;

import com.witon.wpay.domain.req.wft.WftSpTradeRefundQueryReq;
import com.witon.wpay.domain.resp.wft.WftSpTradeRefundQueryResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WftSpTradeRefundQueryRequest.java, v 0.1 2017年7月6日 下午3:47:24 song.li@witontek.com Exp $
 */
public class WftSpTradeRefundQueryRequest extends
                                          AbstractWitonRequest<WftSpTradeRefundQueryReq, WftSpTradeRefundQueryResp> {

    /**  */
    private static final long        serialVersionUID = 3879894300850408903L;

    private WftSpTradeRefundQueryReq bizReq;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.wft.trade.refund.query";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public WftSpTradeRefundQueryReq getBizReq() {
        return bizReq;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractSpReq)
     */
    @Override
    public void setBizReq(WftSpTradeRefundQueryReq biz_content) {
        this.bizReq = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<WftSpTradeRefundQueryResp> getRespClazz() {
        return WftSpTradeRefundQueryResp.class;
    }

}
