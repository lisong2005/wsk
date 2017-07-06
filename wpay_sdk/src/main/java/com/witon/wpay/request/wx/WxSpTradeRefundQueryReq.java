/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.wx;

import com.witon.wpay.domain.req.wx.SpTradeRefundQueryReq;
import com.witon.wpay.domain.resp.wx.SpTradeRefundQueryResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WxSpTradeRefundQueryReq.java, v 0.1 2017年4月17日 下午3:23:53 song.li@witontek.com Exp $
 */
public class WxSpTradeRefundQueryReq extends
                                     AbstractWitonRequest<SpTradeRefundQueryReq, SpTradeRefundQueryResp> {

    /**  */
    private static final long     serialVersionUID = 6248516447254420196L;

    private SpTradeRefundQueryReq req;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.wxsp.trade.refund.query";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public SpTradeRefundQueryReq getBizReq() {
        return req;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractRequest)
     */
    @Override
    public void setBizReq(SpTradeRefundQueryReq biz_content) {
        this.req = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<SpTradeRefundQueryResp> getRespClazz() {
        return SpTradeRefundQueryResp.class;
    }

}
