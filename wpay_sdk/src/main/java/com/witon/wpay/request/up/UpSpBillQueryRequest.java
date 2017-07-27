/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.up;

import com.witon.wpay.domain.req.up.UpSpBillQueryReq;
import com.witon.wpay.domain.resp.up.UpSpBillQueryResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UpSpBillQueryRequest.java, v 0.1 2017年7月27日 上午8:25:12 song.li@witontek.com Exp $
 */
public class UpSpBillQueryRequest extends
                                  AbstractWitonRequest<UpSpBillQueryReq, UpSpBillQueryResp> {

    /**  */
    private static final long serialVersionUID = -3166470617095625983L;

    private UpSpBillQueryReq  bizReq;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.up.bill.query";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public UpSpBillQueryReq getBizReq() {
        return this.bizReq;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractSpReq)
     */
    @Override
    public void setBizReq(UpSpBillQueryReq biz_content) {
        this.bizReq = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<UpSpBillQueryResp> getRespClazz() {
        return UpSpBillQueryResp.class;
    }

}
