/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request;

import com.witon.wpay.domain.req.wx.SpTradeRefundReq;
import com.witon.wpay.domain.resp.wx.SpTradeRefundResp;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WxSpTradeRefundReq.java, v 0.1 2017年4月17日 下午3:25:06 song.li@witontek.com Exp $
 */
public class WxSpTradeRefundReq extends AbstractWitonRequest<SpTradeRefundReq, SpTradeRefundResp> {

    /**  */
    private static final long serialVersionUID = -2382442015222702753L;

    private SpTradeRefundReq  req;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.wxsp.trade.refund";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public SpTradeRefundReq getBizReq() {
        return this.req;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractRequest)
     */
    @Override
    public void setBizReq(SpTradeRefundReq biz_content) {
        this.req = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<SpTradeRefundResp> getRespClazz() {
        return SpTradeRefundResp.class;
    }

}
