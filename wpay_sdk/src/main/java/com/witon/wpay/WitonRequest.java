/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay;

import com.witon.wpay.domain.req.AbstractSpReq;
import com.witon.wpay.domain.resp.AbstractSpResp;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WitonRequest.java, v 0.1 2017年4月17日 下午1:07:10 song.li@witontek.com Exp $
 */
public interface WitonRequest<Q extends AbstractSpReq, P extends AbstractSpResp> {

    public String getMethod();

    public Q getBizReq();

    public void setBizReq(Q biz_content);

    public Class<P> getRespClazz();

}
