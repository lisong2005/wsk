/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay;

import com.witon.wpay.domain.req.AbstractRequest;
import com.witon.wpay.domain.resp.AbstractResponse;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: WitonClient.java, v 0.1 2017年4月17日 下午12:17:39 song.li@witontek.com Exp $
 */
public interface WitonClient {

    public <Q extends AbstractRequest, P extends AbstractResponse> WitonResponse<P> exe(WitonRequest<Q, P> request);

}
