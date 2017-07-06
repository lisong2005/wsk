/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.alipay;

import com.witon.wpay.domain.req.alipay.AliSpBillQueryReq;
import com.witon.wpay.domain.resp.alipay.AliSpBillQueryResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: AlipayBillQueryReq.java, v 0.1 2017年5月15日 下午4:23:28 song.li@witontek.com Exp $
 */
public class AlipayBillQueryReq extends
                                AbstractWitonRequest<AliSpBillQueryReq, AliSpBillQueryResp> {

    /**  */
    private static final long serialVersionUID = 6423694844286492917L;

    private AliSpBillQueryReq biz_content;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.alip.bill.query";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public AliSpBillQueryReq getBizReq() {
        return biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractRequest)
     */
    @Override
    public void setBizReq(AliSpBillQueryReq biz_content) {
        this.biz_content = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<AliSpBillQueryResp> getRespClazz() {
        return AliSpBillQueryResp.class;
    }

}
