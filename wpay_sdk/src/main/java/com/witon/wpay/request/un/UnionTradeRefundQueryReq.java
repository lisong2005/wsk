/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.un;

import com.witon.wpay.domain.req.un.UnTradeRefundQueryReq;
import com.witon.wpay.domain.resp.un.UnTradeRefundQueryResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UnionTradeRefundQueryReq.java, v 0.1 2017年8月23日 下午2:32:36 song.li@witontek.com Exp $
 */
public class UnionTradeRefundQueryReq extends
                                      AbstractWitonRequest<UnTradeRefundQueryReq, UnTradeRefundQueryResp> {

    /**  */
    private static final long     serialVersionUID = -1541924627204003657L;
    private UnTradeRefundQueryReq biz_content;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.un.trade.refund.query";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public UnTradeRefundQueryReq getBizReq() {
        return biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractSpReq)
     */
    @Override
    public void setBizReq(UnTradeRefundQueryReq biz_content) {
        this.biz_content = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<UnTradeRefundQueryResp> getRespClazz() {
        return UnTradeRefundQueryResp.class;
    }

}
