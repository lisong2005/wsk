/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.wx;

import com.witon.wpay.domain.req.wx.SpTradeCloseReq;
import com.witon.wpay.domain.resp.wx.SpTradeCloseResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WxSpTradeCloseyReq.java, v 0.1 2017年4月17日 下午3:21:34 song.li@witontek.com Exp $
 */
public class WxSpTradeCloseReq extends AbstractWitonRequest<SpTradeCloseReq, SpTradeCloseResp> {

    /**  */
    private static final long serialVersionUID = -7590636453729453968L;

    private SpTradeCloseReq   req;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.wxsp.trade.close";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public SpTradeCloseReq getBizReq() {
        return req;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractRequest)
     */
    @Override
    public void setBizReq(SpTradeCloseReq biz_content) {
        this.req = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<SpTradeCloseResp> getRespClazz() {
        return SpTradeCloseResp.class;
    }

}
