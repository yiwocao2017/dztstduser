package com.std.user.domain;

import java.util.Date;

import com.std.user.dao.base.ABaseDO;

/**
 * 菜单
 * @author: Gejin 
 * @since: 2016年4月16日 下午6:31:22 
 * @history:
 */
public class SYSMenu extends ABaseDO {
    private static final long serialVersionUID = 4733016091171187458L;

    // 菜单编号
    private String code;

    // 菜单名称
    private String name;

    // 类型
    private String type;

    // 请求url
    private String url;

    // 父菜单编号
    private String parentCode;

    // 序号
    private String orderNo;

    // 更新人
    private String updater;

    // 更新时间
    private Date updateDatetime;

    // 备注
    private String remark;

    // 系统编号（必填）
    private String systemCode;

    // ************* 模糊查询 *****************
    // 名称模糊查询
    private String nameForQuery;

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getNameForQuery() {
        return nameForQuery;
    }

    public void setNameForQuery(String nameForQuery) {
        this.nameForQuery = nameForQuery;
    }
}
