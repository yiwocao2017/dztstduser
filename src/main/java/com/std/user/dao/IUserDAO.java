/**
 * @Title IUserDAO.java 
 * @Package com.ibis.pz 
 * @Description 
 * @author miyb  
 * @date 2015-2-6 上午10:22:02 
 * @version V1.0   
 */
package com.std.user.dao;

import com.std.user.dao.base.IBaseDAO;
import com.std.user.domain.User;

/** 
 * @author: miyb 
 * @since: 2015-2-6 上午10:22:02 
 * @history:
 */
public interface IUserDAO extends IBaseDAO<User> {
    String NAMESPACE = IUserDAO.class.getName().concat(".");

    /**
     * 代注册
     * @param user
     * @return 
     * @create: 2015年11月10日 下午2:18:42 myb858
     * @history:
     */
    public int insertRen(User data);

    /** 
     * 更改姓名
     * @param data
     * @return 
     * @create: 2015-2-23 下午4:28:41 miyb
     * @history: 
     */
    public int updateRealName(User data);

    /** 
     * 实名认证
     * @param data
     * @return 
     * @create: 2015-2-23 下午4:28:41 miyb
     * @history: 
     */
    public int updateIdentity(User data);

    /** 
     * 设置支付密码
     * @param data
     * @return 
     * @create: 2015-2-23 下午4:28:41 miyb
     * @history: 
     */
    public int updateTradePwd(User data);

    /** 
     * 设置登录密码
     * @param data
     * @return 
     * @create: 2015-2-23 下午4:28:41 miyb
     * @history: 
     */
    public int updateLoginPwd(User data);

    /** 
     * 更新手机号
     * @param data
     * @return 
     * @create: 2015-2-23 下午4:28:41 miyb
     * @history: 
     */
    public int updateMobile(User data);

    /**
     * 绑定手机号
     * @param data
     * @return 
     * @create: 2016年11月22日 下午8:02:25 xieyj
     * @history:
     */
    public int updateBindMobile(User data);

    /**
     * 更新状态
     * @param data
     * @return 
     * @create: 2016年5月24日 下午9:20:18 myb858
     * @history:
     */
    public int updateStatus(User data);

    /**
     * 更新角色
     * @param data
     * @return 
     * @create: 2016年5月24日 下午9:20:31 myb858
     * @history:
     */
    public int updateRole(User data);

    /**
     * 更新Pdf
     * @param data
     * @return 
     * @create: 2016年8月31日 上午9:17:25 xieyj
     * @history:
     */
    public int updatePdf(User data);

    /**
     * 更新用户名
     * @param data
     * @return 
     * @create: 2016年10月22日 下午12:01:48 xieyj
     * @history:
     */
    public int updateLoginName(User data);

    /** 
     * 更新昵称
     * @param data
     * @return 
     * @create: 2016年9月18日 下午5:24:13 zuixian
     * @history: 
     */
    public int updateNickname(User data);

    /**
     * 更新公司编号
     * @param data
     * @return 
     * @create: 2017年3月1日 下午4:51:28 xieyj
     * @history:
     */
    public int updateCompany(User data);

    public int update(User data);

    public int updateLevel(User data);

    /**
     * 更新用户手机号和真实信息
     * @param data
     * @return 
     * @create: 2016年12月28日 下午4:57:18 xieyj
     * @history:
     */
    public int updateSupple(User data);

    /**
     * 微信登录更新用户信息
     * @param data
     * @return 
     * @create: 2017年4月7日 下午6:00:25 asus
     * @history:
     */
    public int updateWxInfo(User data);

    public int updateWxOpenId(User data);

    public int approveUser(User data);

    public int updateDivRate(User data);
}
