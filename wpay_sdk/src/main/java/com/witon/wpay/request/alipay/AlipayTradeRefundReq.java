/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.alipay;

import com.witon.wpay.domain.req.alipay.AliSpTradeRefundReq;
import com.witon.wpay.domain.resp.alipay.AliSpTradeRefundResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: AlipayTradeRefundReq.java, v 0.1 2017年5月15日 下午4:31:07 song.li@witontek.com Exp $
 */
public class AlipayTradeRefundReq extends
                                  AbstractWitonRequest<AliSpTradeRefundReq, AliSpTradeRefundResp> {

    /**  */
    private static final long   serialVersionUID = -492631556713688625L;

    private AliSpTradeRefundReq biz_content;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.alip.trade.refund";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public AliSpTradeRefundReq getBizReq() {
        return this.biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractRequest)
     */
    @Override
    public void setBizReq(AliSpTradeRefundReq biz_content) {
        this.biz_content = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<AliSpTradeRefundResp> getRespClazz() {
        return AliSpTradeRefundResp.class;
    }

}
