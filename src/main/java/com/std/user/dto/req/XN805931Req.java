package com.std.user.dto.req;

public class XN805931Req {

    // 用户编号（必填）
    private String userId;

    // 位置（必填）
    private String location;

    // 金额（必填）
    private String amount;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
