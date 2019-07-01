/**
 * @Title EDirection.java 
 * @Package com.ibis.account.enums 
 * @Description 
 * @author miyb  
 * @date 2015-2-26 下午3:37:06 
 * @version V1.0   
 */
package com.std.user.enums;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author: miyb 
 * @since: 2015-2-26 下午3:37:06 
 * @history:
 */
public enum ESysUser {
    SYS_USER("SYS_USER", "系统用户"), SYS_USER_CAIGO("SYS_USER_CAIGO", "菜狗系统用户编号"), SYS_USER_YAOCHENG(
            "SYS_USER_YAOCHENG", "姚橙系统用户编号"), SYS_USER_CSW("SYS_USER_CSW",
            "系统用户城市网"), SYS_USER_LLWW("SYS_USER_LLWW", "系统用户来来旺旺");

    public static Map<String, ESysUser> getMap() {
        Map<String, ESysUser> map = new HashMap<String, ESysUser>();
        for (ESysUser direction : ESysUser.values()) {
            map.put(direction.getCode(), direction);
        }
        return map;
    }

    ESysUser(String code, String value) {
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
