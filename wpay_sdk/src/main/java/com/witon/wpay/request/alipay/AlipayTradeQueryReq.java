/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.alipay;

import com.witon.wpay.domain.req.alipay.AliSpTradeQueryReq;
import com.witon.wpay.domain.resp.alipay.AliSpTradeQueryResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: AlipayTradeQueryReq.java, v 0.1 2017年5月15日 下午4:29:19 song.li@witontek.com Exp $
 */
public class AlipayTradeQueryReq extends
                                 AbstractWitonRequest<AliSpTradeQueryReq, AliSpTradeQueryResp> {

    /**  */
    private static final long  serialVersionUID = -8538574312168130660L;

    private AliSpTradeQueryReq biz_content;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.alip.trade.query";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public AliSpTradeQueryReq getBizReq() {
        return biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractRequest)
     */
    @Override
    public void setBizReq(AliSpTradeQueryReq biz_content) {
        this.biz_content = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<AliSpTradeQueryResp> getRespClazz() {
        return AliSpTradeQueryResp.class;
    }

}
