/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request;

import com.witon.wpay.domain.req.wx.SpScanCreateReq;
import com.witon.wpay.domain.resp.wx.SpScanCreateResp;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WxSpScanCreateReq.java, v 0.1 2017年4月17日 下午3:20:01 song.li@witontek.com Exp $
 */
public class WxSpScanCreateReq extends AbstractWitonRequest<SpScanCreateReq, SpScanCreateResp> {

    /**  */
    private static final long serialVersionUID = 8582187193487426771L;

    private SpScanCreateReq   biz_content;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.wxsp.trade.scan.create";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public SpScanCreateReq getBizReq() {
        return biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractRequest)
     */
    @Override
    public void setBizReq(SpScanCreateReq biz_content) {
        this.biz_content = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<SpScanCreateResp> getRespClazz() {
        return SpScanCreateResp.class;
    }

}
