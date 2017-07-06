/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.wft;

import com.witon.wpay.domain.req.wft.WftSpJspayCreateReq;
import com.witon.wpay.domain.resp.wft.WftSpJspayCreateResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WftSpJspayCreateRequest.java, v 0.1 2017年7月6日 下午3:45:50 song.li@witontek.com Exp $
 */
public class WftSpJspayCreateRequest extends
                                     AbstractWitonRequest<WftSpJspayCreateReq, WftSpJspayCreateResp> {

    /**  */
    private static final long   serialVersionUID = -7800241497513783585L;

    private WftSpJspayCreateReq bizReq;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.wft.trade.jspay.create";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public WftSpJspayCreateReq getBizReq() {
        return bizReq;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractSpReq)
     */
    @Override
    public void setBizReq(WftSpJspayCreateReq biz_content) {
        this.bizReq = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<WftSpJspayCreateResp> getRespClazz() {
        return WftSpJspayCreateResp.class;
    }

}
