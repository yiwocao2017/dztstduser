/**
 * @Title ZC703164.java 
 * @Package com.xnjr.cpzc.service.impl 
 * @Description 
 * @author xieyj  
 * @date 2015年8月19日 下午7:48:10 
 * @version V1.0   
 */
package com.std.user.api.impl;

import com.std.user.ao.IAddressAO;
import com.std.user.api.AProcessor;
import com.std.user.common.JsonUtil;
import com.std.user.core.StringValidater;
import com.std.user.dto.req.XN805163Req;
import com.std.user.exception.BizException;
import com.std.user.exception.ParaException;
import com.std.user.spring.SpringContextHolder;

/** 
 * 收件地址-修改默认地址
 * @author: xieyj 
 * @since: 2015年8月19日 下午7:48:10 
 * @history:
 */
public class XN805163 extends AProcessor {
    private IAddressAO addressAO = SpringContextHolder
        .getBean(IAddressAO.class);

    private XN805163Req req = null;

    /**
     * @see com.xnjr.mall.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        int count = addressAO.setDefaultAddress(req.getUserId(), req.getCode());
        return new Boolean(count > 0 ? true : false);
    }

    /**
     * @see com.xnjr.mall.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN805163Req.class);
        StringValidater.validateBlank(req.getUserId(), req.getCode());
    }
}
