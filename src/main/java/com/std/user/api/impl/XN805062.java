package com.std.user.api.impl;

import com.std.user.api.AProcessor;
import com.std.user.common.JsonUtil;
import com.std.user.core.StringValidater;
import com.std.user.dto.req.XN805062Req;
import com.std.user.dto.res.XN805062Res;
import com.std.user.exception.BizException;
import com.std.user.exception.ParaException;

/**
 * 修改银行卡
 * @author: myb858 
 * @since: 2016年1月13日 下午2:10:42 
 * @history:
 */
public class XN805062 extends AProcessor {

    private XN805062Req req = null;

    @Override
    public Object doBusiness() throws BizException {
        return new XN805062Res(true);
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN805062Req.class);
        StringValidater.validateBlank(req.getCode(), req.getBankCardNo(),
            req.getUpdater());

    }
}
