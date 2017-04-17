/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request;

import com.witon.wpay.domain.req.wx.SpMicropayCreateReq;
import com.witon.wpay.domain.resp.wx.SpMicropayCreateResp;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WxSpMicropayCreateReq.java, v 0.1 2017年4月17日 下午2:58:49 song.li@witontek.com Exp $
 */
public class WxSpMicropayCreateReq extends
                                   AbstractWitonRequest<SpMicropayCreateReq, SpMicropayCreateResp> {

    /**  */
    private static final long   serialVersionUID = 2288611911407252749L;

    private SpMicropayCreateReq biz_content;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public SpMicropayCreateReq getBizReq() {
        return biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractRequest)
     */
    @Override
    public void setBizReq(SpMicropayCreateReq biz_content) {
        this.biz_content = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<SpMicropayCreateResp> getRespClazz() {
        return SpMicropayCreateResp.class;
    }

}
