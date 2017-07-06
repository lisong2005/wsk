/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.wx;

import com.witon.wpay.domain.req.wx.SpBillQueryReq;
import com.witon.wpay.domain.resp.wx.SpBillQueryResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WxSpBillQueryReq.java, v 0.1 2017年4月17日 下午2:44:28 song.li@witontek.com Exp $
 */
public class WxSpBillQueryReq extends AbstractWitonRequest<SpBillQueryReq, SpBillQueryResp> {

    /**  */
    private static final long serialVersionUID = -5255857744808620604L;

    private SpBillQueryReq    biz_content;

    /**
     * Getter method for property <tt>method</tt>.
     * 
     * @return property value of method
     */
    public String getMethod() {
        return "witon.wxsp.bill.query";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public SpBillQueryReq getBizReq() {
        return this.biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractRequest)
     */
    @Override
    public void setBizReq(SpBillQueryReq biz_content) {
        this.biz_content = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<SpBillQueryResp> getRespClazz() {
        return SpBillQueryResp.class;
    }

}
