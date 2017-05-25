/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request;

import com.witon.wpay.domain.req.wx.SpTradeRefundQueryReq2;
import com.witon.wpay.domain.resp.wx.SpTradeRefundQueryResp2;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WxSpTradeRefundQueryReq.java, v 0.1 2017年4月17日 下午3:23:53 song.li@witontek.com Exp $
 */
public class WxSpTradeRefundQueryReq2 extends
                                      AbstractWitonRequest<SpTradeRefundQueryReq2, SpTradeRefundQueryResp2> {

    /**  */
    private static final long      serialVersionUID = 6248516447254420196L;

    private SpTradeRefundQueryReq2 req;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.wxsp.trade.refund.query2";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public SpTradeRefundQueryReq2 getBizReq() {
        return req;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractRequest)
     */
    @Override
    public void setBizReq(SpTradeRefundQueryReq2 biz_content) {
        this.req = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<SpTradeRefundQueryResp2> getRespClazz() {
        return SpTradeRefundQueryResp2.class;
    }

}
