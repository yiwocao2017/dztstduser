/**
 * @Title ECurrency.java 
 * @Package com.ibis.account.enums 
 * @Description 
 * @author miyb  
 * @date 2015-3-15 下午4:41:06 
 * @version V1.0   
 */
package com.std.user.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: xieyj 
 * @since: 2016年12月24日 下午1:51:38 
 * @history:
 */
public enum ECurrency {
    CNY("CNY", "人民币"), JF("JF", "积分"),

    ZH_FRB("FRB", "分润币"), ZH_GXZ("GXJL", "贡献值"), ZH_QBB("QBB", "钱包币"), ZH_GWB(
            "GWB", "购物币"), ZH_HBB("HBB", "红包币"), ZH_HBYJ("HBYJ", "红包业绩"),

    CG_CGB("CGB", "菜狗币"), CG_JF("CGJF", "菜狗积分"),

    YC_CB("CB", "橙币");

    public static Map<String, ECurrency> getCurrencyMap() {
        Map<String, ECurrency> map = new HashMap<String, ECurrency>();
        for (ECurrency currency : ECurrency.values()) {
            map.put(currency.getCode(), currency);
        }
        return map;
    }

    ECurrency(String code, String value) {
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
