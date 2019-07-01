package com.std.user.common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertiesUtil {

    private static Properties props = null;

    public static void init(String configFile) {
        props = new Properties();
        try {
            InputStream in = PropertiesUtil.class
                .getResourceAsStream(configFile);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            props.load(br);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        if (props == null) {
            // throw new Exception("配置文件初始化失败");
        }
        return props.getProperty(key);
    }

    public static final class Config {

        public static String ACCOUNT_URL = props.getProperty("ACCOUNT_URL");

        public static String SMS_URL = props.getProperty("SMS_URL");

        public static String IDENTIFY_URL = props.getProperty("IDENTIFY_URL");

        public static String JMS_ROLECODE = props.getProperty("JMS_ROLECODE");

        public static String YC_JMS_ROLECODE = props
            .getProperty("YC_JMS_ROLECODE");

        public static String PARTNER_ROLECODE = props
            .getProperty("PARTNER_ROLECODE");

        public static String DZT_PARTNER_ROLECODE = props
            .getProperty("DZT_PARTNER_ROLECODE");

        public static String DZT_LTS_ROLECODE = props
            .getProperty("DZT_LTS_ROLECODE");

        public static String APP_KEY = props.getProperty("APP_KEY");

        public static String MASTER_SECRET = props.getProperty("MASTER_SECRET");

        public static String APNS_PRODUCTION = props
            .getProperty("APNS_PRODUCTION");

    }
}
