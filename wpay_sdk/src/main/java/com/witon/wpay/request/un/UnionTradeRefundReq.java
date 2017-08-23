/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.un;

import com.witon.wpay.domain.req.un.UnTradeRefundReq;
import com.witon.wpay.domain.resp.un.UnTradeRefundResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UnionTradeRefundReq.java, v 0.1 2017年8月23日 下午2:33:46 song.li@witontek.com Exp $
 */
public class UnionTradeRefundReq extends AbstractWitonRequest<UnTradeRefundReq, UnTradeRefundResp> {

    /**  */
    private static final long serialVersionUID = -5516704899100874250L;
    private UnTradeRefundReq  biz_content;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.un.trade.refund";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public UnTradeRefundReq getBizReq() {
        return biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractSpReq)
     */
    @Override
    public void setBizReq(UnTradeRefundReq biz_content) {
        this.biz_content = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<UnTradeRefundResp> getRespClazz() {
        return UnTradeRefundResp.class;
    }

}
