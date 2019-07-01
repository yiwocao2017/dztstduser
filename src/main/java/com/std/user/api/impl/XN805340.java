package com.std.user.api.impl;

import com.std.user.ao.IInvitationAO;
import com.std.user.api.AProcessor;
import com.std.user.common.JsonUtil;
import com.std.user.core.StringValidater;
import com.std.user.dto.req.XN805340Req;
import com.std.user.exception.BizException;
import com.std.user.exception.ParaException;
import com.std.user.spring.SpringContextHolder;

/**
 * 批量生成邀请码
 * @author: shan 
 * @since: 2016年12月17日 下午4:42:18 
 * @history:
 */
public class XN805340 extends AProcessor {
    private IInvitationAO invitationAO = SpringContextHolder
        .getBean(IInvitationAO.class);

    private XN805340Req req = null;

    @Override
    public Object doBusiness() throws BizException {
        invitationAO.addInvitation(Integer.valueOf(req.getNumber()));
        return new Boolean(true);
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN805340Req.class);
        StringValidater.validateBlank(req.getNumber());
    }
}
