/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request;

import com.witon.wpay.domain.req.wx.SpJspayCreateReq;
import com.witon.wpay.domain.resp.wx.SpJspayCreateResp;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WxSpJspayCreateReq.java, v 0.1 2017年4月17日 下午2:51:55 song.li@witontek.com Exp $
 */
public class WxSpJspayCreateReq extends AbstractWitonRequest<SpJspayCreateReq, SpJspayCreateResp> {

    /**  */
    private static final long serialVersionUID = -5255857744808620604L;

    private SpJspayCreateReq  biz_content;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public SpJspayCreateReq getBizReq() {
        return this.biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractRequest)
     */
    @Override
    public void setBizReq(SpJspayCreateReq biz_content) {
        this.biz_content = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<SpJspayCreateResp> getRespClazz() {
        return SpJspayCreateResp.class;
    }
}
