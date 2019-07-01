package com.std.user.enums;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author: miyb 
 * @since: 2015-2-26 下午2:15:22 
 * @history:
 */
public enum EBizType {
    AJ_REG("01", "注册送积分"), AJ_SIGN("02", "每日签到"), AJ_SCTX_FIRST("03", "首次上传头像"), AJ_ZLWS_FIRST(
            "04", "首次完善资料"),

    // 姚橙系统
    YC_SCB("YC_SCB", "扫描二维码送橙币");

    public static Map<String, EBizType> getBizTypeMap() {
        Map<String, EBizType> map = new HashMap<String, EBizType>();
        for (EBizType bizType : EBizType.values()) {
            map.put(bizType.getCode(), bizType);
        }
        return map;
    }

    EBizType(String code, String value) {
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
