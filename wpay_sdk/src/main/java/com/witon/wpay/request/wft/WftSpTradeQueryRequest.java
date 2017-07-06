/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.wft;

import com.witon.wpay.domain.req.wft.WftSpTradeQueryReq;
import com.witon.wpay.domain.resp.wft.WftSpTradeQueryResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WftSpTradeQueryRequest.java, v 0.1 2017年7月6日 下午3:46:57 song.li@witontek.com Exp $
 */
public class WftSpTradeQueryRequest extends
                                    AbstractWitonRequest<WftSpTradeQueryReq, WftSpTradeQueryResp> {

    /**  */
    private static final long  serialVersionUID = 1211934763257122398L;

    private WftSpTradeQueryReq bizReq;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.wft.trade.query";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public WftSpTradeQueryReq getBizReq() {
        return bizReq;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractSpReq)
     */
    @Override
    public void setBizReq(WftSpTradeQueryReq biz_content) {
        this.bizReq = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<WftSpTradeQueryResp> getRespClazz() {
        return WftSpTradeQueryResp.class;
    }

}
