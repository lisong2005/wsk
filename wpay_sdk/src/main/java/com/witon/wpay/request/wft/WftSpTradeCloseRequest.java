/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.wft;

import com.witon.wpay.domain.req.wft.WftSpTradeCloseReq;
import com.witon.wpay.domain.resp.wft.WftSpTradeCloseResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WftSpTradeCloseRequest.java, v 0.1 2017年7月6日 下午3:46:17 song.li@witontek.com Exp $
 */
public class WftSpTradeCloseRequest extends
                                    AbstractWitonRequest<WftSpTradeCloseReq, WftSpTradeCloseResp> {

    /**  */
    private static final long  serialVersionUID = 1101597166647776424L;

    private WftSpTradeCloseReq bizReq;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.wft.trade.close";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public WftSpTradeCloseReq getBizReq() {
        return bizReq;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractSpReq)
     */
    @Override
    public void setBizReq(WftSpTradeCloseReq biz_content) {
        this.bizReq = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<WftSpTradeCloseResp> getRespClazz() {
        return WftSpTradeCloseResp.class;
    }

}
