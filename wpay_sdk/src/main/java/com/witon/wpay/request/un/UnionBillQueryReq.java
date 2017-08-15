/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.un;

import com.witon.wpay.domain.req.un.UnBillQueryReq;
import com.witon.wpay.domain.resp.un.UnBillQueryResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UnionBillQueryReq.java, v 0.1 2017年8月15日 下午4:48:35 song.li@witontek.com Exp $
 */
public class UnionBillQueryReq extends AbstractWitonRequest<UnBillQueryReq, UnBillQueryResp> {

    /**  */
    private static final long serialVersionUID = 7396446404320017374L;

    private UnBillQueryReq    biz_content;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.un.bill.query";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public UnBillQueryReq getBizReq() {
        return this.biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractSpReq)
     */
    @Override
    public void setBizReq(UnBillQueryReq biz_content) {
        this.biz_content = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<UnBillQueryResp> getRespClazz() {
        return UnBillQueryResp.class;
    }

}
