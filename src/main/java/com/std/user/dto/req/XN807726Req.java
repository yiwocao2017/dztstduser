package com.std.user.dto.req;

public class XN807726Req {

    // 大类(选填)
    private String kind;

    // 产生项(选填)
    private String type;

    // 作用等级(选填)
    private String level;

    // 系统编号(必填)
    private String systemCode;

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
