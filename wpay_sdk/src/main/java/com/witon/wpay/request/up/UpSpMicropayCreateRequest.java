/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.up;

import com.witon.wpay.domain.req.up.UpSpMicropayCreateReq;
import com.witon.wpay.domain.resp.up.UpSpMicropayCreateResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UpSpMicropayCreateRequest.java, v 0.1 2017年7月27日 上午8:26:09 song.li@witontek.com Exp $
 */
public class UpSpMicropayCreateRequest extends
                                       AbstractWitonRequest<UpSpMicropayCreateReq, UpSpMicropayCreateResp> {

    /**  */
    private static final long     serialVersionUID = -4067337035665589587L;
    private UpSpMicropayCreateReq bizReq;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.up.trade.micropay.create";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public UpSpMicropayCreateReq getBizReq() {
        return bizReq;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractSpReq)
     */
    @Override
    public void setBizReq(UpSpMicropayCreateReq biz_content) {
        this.bizReq = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<UpSpMicropayCreateResp> getRespClazz() {
        return UpSpMicropayCreateResp.class;
    }

}
