/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request;

import com.witon.wpay.domain.req.alipay.AliSpScanCreateReq;
import com.witon.wpay.domain.resp.alipay.AliSpScanCreateResp;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: AlipayScanCreateReq.java, v 0.1 2017年5月15日 下午4:26:56 song.li@witontek.com Exp $
 */
public class AlipayScanCreateReq extends
                                 AbstractWitonRequest<AliSpScanCreateReq, AliSpScanCreateResp> {

    /**  */
    private static final long  serialVersionUID = -4932342067725421594L;

    private AliSpScanCreateReq biz_content;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.alip.trade.scan.create";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public AliSpScanCreateReq getBizReq() {
        return biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractRequest)
     */
    @Override
    public void setBizReq(AliSpScanCreateReq biz_content) {
        this.biz_content = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<AliSpScanCreateResp> getRespClazz() {
        return AliSpScanCreateResp.class;
    }

}
