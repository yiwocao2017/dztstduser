package com.std.user.dto.res;

public class BooleanRes {
    // 是否成功
    private boolean isSuccess;

    public BooleanRes() {
    }

    public BooleanRes(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
}
