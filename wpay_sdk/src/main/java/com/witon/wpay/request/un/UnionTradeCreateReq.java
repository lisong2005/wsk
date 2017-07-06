/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.un;

import com.witon.wpay.domain.req.un.UnTradeCreateReq;
import com.witon.wpay.domain.resp.un.UnTradeCreateResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UnionTradeCreateReq.java, v 0.1 2017年5月17日 上午8:33:49 song.li@witontek.com Exp $
 */
public class UnionTradeCreateReq extends AbstractWitonRequest<UnTradeCreateReq, UnTradeCreateResp> {

    /**  */
    private static final long serialVersionUID = 1276650528304672672L;

    private UnTradeCreateReq  biz_content;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.un.trade.create";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public UnTradeCreateReq getBizReq() {
        return this.biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractRequest)
     */
    @Override
    public void setBizReq(UnTradeCreateReq biz_content) {
        this.biz_content = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<UnTradeCreateResp> getRespClazz() {
        return UnTradeCreateResp.class;
    }

}
