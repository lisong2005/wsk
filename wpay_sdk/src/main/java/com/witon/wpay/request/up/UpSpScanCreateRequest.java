/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.up;

import com.witon.wpay.domain.req.up.UpSpScanCreateReq;
import com.witon.wpay.domain.resp.up.UpSpScanCreateResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UpSpScanCreateRequest.java, v 0.1 2017年7月27日 上午8:26:41 song.li@witontek.com Exp $
 */
public class UpSpScanCreateRequest extends
                                   AbstractWitonRequest<UpSpScanCreateReq, UpSpScanCreateResp> {

    /**  */
    private static final long serialVersionUID = 6558666280850589768L;
    /**  */
    private UpSpScanCreateReq bizReq;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.up.trade.scan.create";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public UpSpScanCreateReq getBizReq() {
        return bizReq;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractSpReq)
     */
    @Override
    public void setBizReq(UpSpScanCreateReq biz_content) {
        this.bizReq = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<UpSpScanCreateResp> getRespClazz() {
        return UpSpScanCreateResp.class;
    }

}
