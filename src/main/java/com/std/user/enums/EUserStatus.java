package com.std.user.enums;

public enum EUserStatus {
    NORMAL("0", "正常"), Li_Locked("1", "程序锁定"), Ren_Locked("2", "人工锁定"), TO_APPROVE(
            "3", "待审核"), APPROVE_NO("4", "审核不通过");

    EUserStatus(String code, String value) {
        this.code = code;
        this.value = value;
    }

    private String code;

    private String value;

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
