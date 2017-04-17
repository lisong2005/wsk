/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request;

import com.witon.wpay.domain.req.wx.SpTradeReverseReq;
import com.witon.wpay.domain.resp.wx.SpTradeReverseResp;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WxSpTradeReverseReq.java, v 0.1 2017年4月17日 下午3:26:33 song.li@witontek.com Exp $
 */
public class WxSpTradeReverseReq extends
                                 AbstractWitonRequest<SpTradeReverseReq, SpTradeReverseResp> {

    /**  */
    private static final long serialVersionUID = 8415737526434003532L;

    private SpTradeReverseReq req;

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
    public SpTradeReverseReq getBizReq() {
        return this.req;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractRequest)
     */
    @Override
    public void setBizReq(SpTradeReverseReq biz_content) {
        this.req = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<SpTradeReverseResp> getRespClazz() {
        return SpTradeReverseResp.class;
    }

}
