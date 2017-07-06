/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.alipay;

import com.witon.wpay.domain.req.alipay.AliSpTradeRefundQueryReq;
import com.witon.wpay.domain.resp.alipay.AliSpTradeRefundQueryResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: AlipayTradeRefundQueryReq.java, v 0.1 2017年5月15日 下午4:30:29 song.li@witontek.com Exp $
 */
public class AlipayTradeRefundQueryReq extends
                                       AbstractWitonRequest<AliSpTradeRefundQueryReq, AliSpTradeRefundQueryResp> {

    /**  */
    private static final long        serialVersionUID = 605031890413989928L;

    private AliSpTradeRefundQueryReq biz_content;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.alip.trade.refund.query";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public AliSpTradeRefundQueryReq getBizReq() {
        return this.biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractRequest)
     */
    @Override
    public void setBizReq(AliSpTradeRefundQueryReq biz_content) {
        this.biz_content = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<AliSpTradeRefundQueryResp> getRespClazz() {
        return AliSpTradeRefundQueryResp.class;
    }

}
