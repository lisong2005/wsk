/**
 * Witontek.com.
 * Copyright (c) 2012-2017 All Rights Reserved.
 */
package com.witon.wpay.domain.resp.wx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.witon.wpay.domain.resp.AbstractSpResp;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: SpTradeCloseyResp.java, v 0.1 2017年4月7日 下午2:15:45 song.li@witontek.com Exp $
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SpTradeCloseyResp extends AbstractSpResp {

    /**  */
    private static final long serialVersionUID = -741983562609685571L;

    private String            recall;

    /**
     * Getter method for property <tt>recall</tt>.
     * 
     * @return property value of recall
     */
    public String getRecall() {
        return recall;
    }

    /**
     * Setter method for property <tt>recall</tt>.
     * 
     * @param recall value to be assigned to property recall
     */
    public void setRecall(String recall) {
        this.recall = recall;
    }

}
