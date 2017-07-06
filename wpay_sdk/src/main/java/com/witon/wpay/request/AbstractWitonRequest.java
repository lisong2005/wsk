/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.request;

import com.witon.wpay.WitonRequest;
import com.witon.wpay.domain.req.AbstractSpReq;
import com.witon.wpay.domain.resp.AbstractSpResp;
import com.witon.wpay.util.BaseModel;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: AbstractWitonRequest.java, v 0.1 2017年4月17日 下午2:53:52 song.li@witontek.com Exp $
 */
public abstract class AbstractWitonRequest<Q extends AbstractSpReq, P extends AbstractSpResp>
                                          extends BaseModel implements WitonRequest<Q, P> {

    /**  */
    private static final long serialVersionUID = -6987317831299844118L;

}
