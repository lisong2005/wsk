/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request;

import com.witon.wpay.domain.req.alipay.AliSpMicropayCreateReq;
import com.witon.wpay.domain.resp.alipay.AliSpMicropayCreateResp;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: AlipayMicropayCreateReq.java, v 0.1 2017年5月15日 下午4:26:15 song.li@witontek.com Exp $
 */
public class AlipayMicropayCreateReq extends
                                     AbstractWitonRequest<AliSpMicropayCreateReq, AliSpMicropayCreateResp> {

    /**  */
    private static final long      serialVersionUID = 8707001518107665503L;

    private AliSpMicropayCreateReq biz_content;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.alip.trade.micropay.create";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public AliSpMicropayCreateReq getBizReq() {
        return this.biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractRequest)
     */
    @Override
    public void setBizReq(AliSpMicropayCreateReq biz_content) {
        this.biz_content = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<AliSpMicropayCreateResp> getRespClazz() {
        return AliSpMicropayCreateResp.class;
    }

}
