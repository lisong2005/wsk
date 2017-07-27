/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.up;

import com.witon.wpay.domain.req.up.UpSpTradeQueryReq;
import com.witon.wpay.domain.resp.up.UpSpTradeQueryResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UpSpTradeQueryRequest.java, v 0.1 2017年7月27日 上午8:27:03 song.li@witontek.com Exp $
 */
public class UpSpTradeQueryRequest extends
                                   AbstractWitonRequest<UpSpTradeQueryReq, UpSpTradeQueryResp> {

    /**  */
    private static final long serialVersionUID = -8110216846369734745L;
    private UpSpTradeQueryReq bizReq;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.up.trade.query";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public UpSpTradeQueryReq getBizReq() {
        return this.bizReq;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractSpReq)
     */
    @Override
    public void setBizReq(UpSpTradeQueryReq biz_content) {
        this.bizReq = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<UpSpTradeQueryResp> getRespClazz() {
        return UpSpTradeQueryResp.class;
    }

}
