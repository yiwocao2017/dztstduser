package com.std.user.dto.req;

public class XN805077Req {

    // userId（必填）
    private String userId;

    // 头像（必填）
    private String photo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
