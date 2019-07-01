package com.std.user.api.impl;

import com.std.user.ao.ICPasswordAO;
import com.std.user.api.AProcessor;
import com.std.user.common.JsonUtil;
import com.std.user.core.StringValidater;
import com.std.user.dto.req.XN806021Req;
import com.std.user.dto.res.BooleanRes;
import com.std.user.exception.BizException;
import com.std.user.exception.ParaException;
import com.std.user.spring.SpringContextHolder;

/** 
 * 删除密码记录
 * @author: zuixian 
 * @since: 2016年10月10日 下午3:58:13 
 * @history:
 */
public class XN806021 extends AProcessor {

    private ICPasswordAO cPasswordAO = SpringContextHolder
        .getBean(ICPasswordAO.class);

    private XN806021Req req = null;

    @Override
    public Object doBusiness() throws BizException {
        int count = cPasswordAO.dropCPassword(req.getCode());
        return new BooleanRes(count > 0 ? true : false);
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN806021Req.class);
        StringValidater.validateBlank(req.getCode());
    }
}
