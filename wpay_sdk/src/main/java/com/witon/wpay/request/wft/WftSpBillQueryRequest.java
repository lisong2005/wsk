/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.wft;

import com.witon.wpay.domain.req.wft.WftSpBillQueryReq;
import com.witon.wpay.domain.resp.wft.WftSpBillQueryResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WftSpBillQueryRequest.java, v 0.1 2017年7月6日 下午3:45:11 song.li@witontek.com Exp $
 */
public class WftSpBillQueryRequest extends
                                   AbstractWitonRequest<WftSpBillQueryReq, WftSpBillQueryResp> {

    /**  */
    private static final long serialVersionUID = -8152987569605801077L;

    private WftSpBillQueryReq bizReq;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.wft.bill.query";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public WftSpBillQueryReq getBizReq() {
        return bizReq;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractSpReq)
     */
    @Override
    public void setBizReq(WftSpBillQueryReq biz_content) {
        this.bizReq = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<WftSpBillQueryResp> getRespClazz() {
        return WftSpBillQueryResp.class;
    }

}
