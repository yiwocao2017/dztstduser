package com.std.user.dto.req;

public class XN806150Req extends APageReq {

    private static final long serialVersionUID = 1L;

    // 编号（选填）
    private String certificateCode;

    // 类型（选填）
    private String certificateType;

    // 公司编号（选填）
    private String companyCode;

    // 名称（选填）
    private String companyName;

    // 状态（选填）
    private String status;

    // 更新人（选填）
    private String applyUser;

    // 更新人（选填）
    private String approveUser;

    // 省（选填）
    private String province;

    // 市（选填）
    private String city;

    // 区（选填）
    private String area;

    public String getCertificateCode() {
        return certificateCode;
    }

    public void setCertificateCode(String certificateCode) {
        this.certificateCode = certificateCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApplyUser() {
        return applyUser;
    }

    public void setApplyUser(String applyUser) {
        this.applyUser = applyUser;
    }

    public String getApproveUser() {
        return approveUser;
    }

    public void setApproveUser(String approveUser) {
        this.approveUser = approveUser;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
