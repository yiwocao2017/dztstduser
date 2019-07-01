package com.std.user.api.impl;

import org.apache.commons.lang3.StringUtils;

import com.std.user.ao.IUserAO;
import com.std.user.api.AProcessor;
import com.std.user.common.JsonUtil;
import com.std.user.core.StringValidater;
import com.std.user.domain.User;
import com.std.user.dto.req.XN805056Req;
import com.std.user.dto.res.XN805056Res;
import com.std.user.enums.EBoolean;
import com.std.user.exception.BizException;
import com.std.user.exception.ParaException;
import com.std.user.spring.SpringContextHolder;

/**
 * 根据userId获取用户信息
 * @author: myb858 
 * @since: 2015年8月23日 下午1:48:57 
 * @history:
 */
public class XN805056 extends AProcessor {
    private IUserAO userAO = SpringContextHolder.getBean(IUserAO.class);

    private XN805056Req req = null;

    @Override
    public Object doBusiness() throws BizException {
        User user = userAO.doGetUser(req.getUserId());
        XN805056Res res = new XN805056Res();
        if (user != null) {
            res.setUserId(user.getUserId());
            res.setLoginName(user.getLoginName());
            res.setLoginPwdStrength(user.getLoginPwdStrength());
            res.setNickname(user.getNickname());
            res.setKind(user.getKind());
            res.setLevel(user.getLevel());

            res.setUserReferee(user.getUserReferee());
            res.setUserRefereeName(user.getUserRefereeName());
            res.setMobile(user.getMobile());
            res.setIdKind(user.getIdKind());
            res.setIdNo(user.getIdNo());

            res.setRealName(user.getRealName());
            if (null != user.getDivRate()) {
                res.setDivRate(String.valueOf(user.getDivRate()));
            }
            res.setTradePwdStrength(user.getTradePwdStrength());
            if (StringUtils.isNotBlank(user.getIdNo())) {
                res.setIdentityFlag(EBoolean.YES.getCode());
            } else {
                res.setIdentityFlag(EBoolean.NO.getCode());
            }
            if (StringUtils.isNotBlank(user.getTradePwdStrength())) {
                res.setTradepwdFlag(EBoolean.YES.getCode());
            } else {
                res.setTradepwdFlag(EBoolean.NO.getCode());
            }
            res.setRoleCode(user.getRoleCode());
            res.setStatus(user.getStatus());
            res.setCreateDatetime(user.getCreateDatetime());
            res.setUpdater(user.getUpdater());
            res.setUpdateDatetime(user.getUpdateDatetime());

            res.setRemark(user.getRemark());
            res.setPdf(user.getPdf());
            res.setTotalFansNum(String.valueOf(user.getTotalFansNum()));
            res.setTotalFollowNum(String.valueOf(user.getTotalFollowNum()));
            res.setOpenId(user.getOpenId());

            res.setUnionId(user.getUnionId());
            res.setCompanyCode(user.getCompanyCode());

            res.setUserExt(user.getUserExt());
        }
        return res;
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN805056Req.class);
        StringValidater.validateBlank(req.getUserId());
    }

}
