package com.galaxy.wechat.pay.miniprogram.util;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class ReflectUtils {

    /** 把object转换成相应的配型 */
    public static <T> T castToJavaBean(Object obj, Class<T> clazz) {
        return com.alibaba.fastjson.util.TypeUtils.castToJavaBean(obj, clazz);
    }

    /** 获取class下的全部字段 */
    public static List<Field> getAllField(Class clazz) {
        List<Field> fields = Arrays.asList(clazz.getClass().getDeclaredFields());
        List<Field> superFields = Arrays.asList(clazz.getClass().getSuperclass().getDeclaredFields());
        fields.addAll(superFields);
        return fields;
    }
}
