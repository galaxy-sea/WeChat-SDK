package com.galaxy.miniprogram.util;


import com.galaxy.miniprogram.bean.BaseEntity;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;


/**
 * @Author galaxy
 * @Date 2019/10/25 19：40
 **/
public class XmlSerializableUtils {

    private static final String ROOT = "xml";

    /** 生成带有 sign 的 XML 格式字符串 */
    public static String toXml(BaseEntity entity) throws IllegalAccessException {

        Document document = DocumentHelper.createDocument();
        Element root = document.addElement(ROOT);

        Field[] fields = getAllField(entity.getClass());

        for (Field field : fields) {
            XmlValue xmlValue = field.getAnnotation(XmlValue.class);
            if (xmlValue != null) {
                field.setAccessible(true);
                Object value = field.get(entity);
                if (value != null) {
                    Element element = root.addElement(xmlValue.name());
                    String text = String.valueOf(value);
                    if (xmlValue.isCDATA()) {
                        element.addCDATA(text);
                    } else {
                        element.addText(text);
                    }
                }
            }
        }
        return document.asXML();
    }

    /** xml to object */
    public static <T> T toObject(String xml, Class<T> clazz) throws DocumentException, IllegalAccessException, InstantiationException {
        Document document = DocumentHelper.parseText(xml);
        Element rootElement = document.getRootElement();

        T object = clazz.newInstance();
        Field[] fields = getAllField(clazz);

        for (Field field : fields) {
            XmlValue annotation = field.getAnnotation(XmlValue.class);
            if (annotation == null) {
                continue;
            }
            Element element = rootElement.element(annotation.name());
            if (element == null) {
                continue;
            }
            String text = element.getText();
            field.setAccessible(true);
            Object value = castToJavaBean(text, field.getType());
            field.set(object, value);
            field.setAccessible(false);
        }
        return object;
    }


    /** object to map */
    public static Map<String, String> toMap(BaseEntity entity) throws IllegalAccessException {

        Map<String, String> map = new TreeMap<String, String>();

        Field[] fields = getAllField(entity.getClass());
        for (Field field : fields) {
            XmlValue xmlValue = field.getAnnotation(XmlValue.class);
            if (xmlValue != null) {
                field.setAccessible(true);
                Object value = field.get(entity);
                field.setAccessible(false);
                if (value != null) {
                    map.put(xmlValue.name(), String.valueOf(value));
                }
            }
        }
        return map;
    }


    /** 获取class下的全部字段 */
    private static Field[] getAllField(Class clazz) {
        return getAllField(clazz.getSuperclass(), clazz.getDeclaredFields());
    }

    private static Field[] getAllField(Class clazz, Field[] allField) {
        if (clazz == Object.class) {
            return allField;
        }

        Field[] fields = clazz.getDeclaredFields();

        int length = allField.length;
        allField = Arrays.copyOf(allField, length + fields.length);
        System.arraycopy(fields, 0, allField, length, fields.length);

        return getAllField(clazz.getSuperclass(), allField);
    }

    /** 把object转换成相应的配型 */
    private static <T> T castToJavaBean(Object obj, Class<T> clazz) {
        return com.alibaba.fastjson.util.TypeUtils.castToJavaBean(obj, clazz);
    }
}