package com.common;

import org.apache.ibatis.io.Resources;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Properties;

@Component
public class PageSizeTest {

    public static int pageSize;

    public PageSizeTest() {
        pageSize = Integer.parseInt(getPageSize("pagesize"));
    }


    private static Properties properties = null;

    static {
        init();
    }

    private static void init() {
        properties = new Properties();
        try {
            properties.load(Resources.getResourceAsStream("common.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPageSize(String pageSize) {
        if (properties == null) {
            init();
        }
        return properties.getProperty(pageSize);
    }

    public static void main(String[] args) {
        String pageSize = getPageSize("pagesize");
        System.out.println(pageSize);
    }
}
