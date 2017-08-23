/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.un;

import com.witon.wpay.domain.req.un.UnTradeQueryReq;
import com.witon.wpay.domain.resp.un.UnTradeQueryResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UnionTradeQueryReq.java, v 0.1 2017年8月23日 下午2:31:25 song.li@witontek.com Exp $
 */
public class UnionTradeQueryReq extends AbstractWitonRequest<UnTradeQueryReq, UnTradeQueryResp> {

    /**  */
    private static final long serialVersionUID = -2836538739930614530L;
    private UnTradeQueryReq   biz_content;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.un.trade.query";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public UnTradeQueryReq getBizReq() {
        return biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractSpReq)
     */
    @Override
    public void setBizReq(UnTradeQueryReq biz_content) {
        this.biz_content = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<UnTradeQueryResp> getRespClazz() {
        return UnTradeQueryResp.class;
    }

}
