/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.up;

import com.witon.wpay.domain.req.up.UpSpTradeRefundQueryReq;
import com.witon.wpay.domain.resp.up.UpSpTradeRefundQueryResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UpSpTradeRefundQueryRequest.java, v 0.1 2017年7月27日 上午8:27:41 song.li@witontek.com Exp $
 */
public class UpSpTradeRefundQueryRequest extends
                                         AbstractWitonRequest<UpSpTradeRefundQueryReq, UpSpTradeRefundQueryResp> {

    /**  */
    private static final long       serialVersionUID = 8609269300291836777L;
    private UpSpTradeRefundQueryReq bizReq;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.up.trade.refund.query";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public UpSpTradeRefundQueryReq getBizReq() {
        return bizReq;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractSpReq)
     */
    @Override
    public void setBizReq(UpSpTradeRefundQueryReq biz_content) {
        this.bizReq = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<UpSpTradeRefundQueryResp> getRespClazz() {
        return UpSpTradeRefundQueryResp.class;
    }

}
