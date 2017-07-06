/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.alipay;

import com.witon.wpay.domain.req.alipay.AliSpTradeCancelReq;
import com.witon.wpay.domain.resp.alipay.AliSpTradeCancelResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WxSpTradeCancelReq.java, v 0.1 2017年5月15日 下午4:27:42 song.li@witontek.com Exp $
 */
public class AlipayTradeCancelReq extends
                                  AbstractWitonRequest<AliSpTradeCancelReq, AliSpTradeCancelResp> {

    /**  */
    private static final long   serialVersionUID = -6550941392274727372L;

    private AliSpTradeCancelReq biz_content;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.alip.trade.cancel";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public AliSpTradeCancelReq getBizReq() {
        return biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractRequest)
     */
    @Override
    public void setBizReq(AliSpTradeCancelReq biz_content) {
        this.biz_content = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<AliSpTradeCancelResp> getRespClazz() {
        return AliSpTradeCancelResp.class;
    }

}
