/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request;

import com.witon.wpay.domain.req.wx.SpTradeQueryReq;
import com.witon.wpay.domain.resp.wx.SpTradeQueryResp;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WxSpTradeQueryReq.java, v 0.1 2017年4月17日 下午3:22:33 song.li@witontek.com Exp $
 */
public class WxSpTradeQueryReq extends AbstractWitonRequest<SpTradeQueryReq, SpTradeQueryResp> {

    /**  */
    private static final long serialVersionUID = 4543760881174287765L;

    private SpTradeQueryReq   req;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.wxsp.trade.query";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public SpTradeQueryReq getBizReq() {
        return req;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractRequest)
     */
    @Override
    public void setBizReq(SpTradeQueryReq biz_content) {
        this.req = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<SpTradeQueryResp> getRespClazz() {
        return SpTradeQueryResp.class;
    }

}
