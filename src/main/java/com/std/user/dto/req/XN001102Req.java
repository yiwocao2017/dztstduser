package com.std.user.dto.req;

public class XN001102Req {
    // 手机号（必填）
    private String mobile;

    // kind(必填)
    private String kind;

    // 公司编号(选填)
    private String companyCode;

    // 系统编号（必填）
    private String systemCode;

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }
}
