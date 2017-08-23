/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request.un;

import com.witon.wpay.domain.req.un.UnMicropayCreateReq;
import com.witon.wpay.domain.resp.un.UnMicropayCreateResp;
import com.witon.wpay.request.AbstractWitonRequest;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UnionMicropayCreateReq.java, v 0.1 2017年8月23日 下午2:30:01 song.li@witontek.com Exp $
 */
public class UnionMicropayCreateReq extends
                                    AbstractWitonRequest<UnMicropayCreateReq, UnMicropayCreateResp> {

    /**  */
    private static final long   serialVersionUID = -3812288362640101613L;
    private UnMicropayCreateReq biz_content;

    /** 
     * @see com.witon.wpay.WitonRequest#getMethod()
     */
    @Override
    public String getMethod() {
        return "witon.un.trade.micropay.create";
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getBizReq()
     */
    @Override
    public UnMicropayCreateReq getBizReq() {
        return biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#setBizReq(com.witon.wpay.domain.req.AbstractSpReq)
     */
    @Override
    public void setBizReq(UnMicropayCreateReq biz_content) {
        this.biz_content = biz_content;
    }

    /** 
     * @see com.witon.wpay.WitonRequest#getRespClazz()
     */
    @Override
    public Class<UnMicropayCreateResp> getRespClazz() {
        return UnMicropayCreateResp.class;
    }

}
