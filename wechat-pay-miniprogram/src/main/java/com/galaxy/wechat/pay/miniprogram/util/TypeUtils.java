package com.galaxy.wechat.pay.miniprogram.util;


public class TypeUtils {

    public static <T> T castToJavaBean(Object obj, Class<T> clazz) {
        return com.alibaba.fastjson.util.TypeUtils.castToJavaBean(obj, clazz);
    }
}
