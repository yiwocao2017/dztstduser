package com.std.user.api.impl;

import com.std.user.ao.IUserAO;
import com.std.user.api.AProcessor;
import com.std.user.common.JsonUtil;
import com.std.user.core.StringValidater;
import com.std.user.dto.req.XN805153Req;
import com.std.user.dto.res.BooleanRes;
import com.std.user.exception.BizException;
import com.std.user.exception.ParaException;
import com.std.user.spring.SpringContextHolder;

/**
 * 绑定手机号，初始化密码
 * @author: xieyj 
 * @since: 2016年11月22日 下午8:14:23 
 * @history:
 */
public class XN805153 extends AProcessor {
    private IUserAO userAO = SpringContextHolder.getBean(IUserAO.class);

    private XN805153Req req = null;

    @Override
    public Object doBusiness() throws BizException {
        userAO.doBindMoblie(req.getUserId(), req.getMobile(),
            req.getSmsCaptcha(), req.getIsSendSms());
        return new BooleanRes(true);
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN805153Req.class);
        StringValidater.validateBlank(req.getUserId(), req.getMobile(),
            req.getSmsCaptcha());
    }
}
