package com.galaxy.wechat.pay.miniprogram.util;


import com.alibaba.fastjson.util.TypeUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @Author galaxy
 * @Date 2019/10/25 19：40
 **/
public class XmlSerializableUtils {

    public static final String ROOT = "xml";

    /** object to String */
    public static String toXmlString(Object object) throws IllegalAccessException {
        Document document = toDocument(object);
        return document.asXML();
    }

    /** document to string */
    public static String toXmlString(Document document) throws IllegalAccessException {
        return document.asXML();
    }


    /** object to  Document */
    public static Document toDocument(Object object) throws IllegalAccessException {

        Document document = DocumentHelper.createDocument();
        Element root = document.addElement(ROOT);

        List<Field> fields = getAllField(object.getClass());

        for (Field field : fields) {
            XmlValue xmlValue = field.getAnnotation(XmlValue.class);
            if (xmlValue != null) {
                field.setAccessible(true);
                Object value = field.get(object);
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
        return document;
    }

    /** string to  Document */
    public static Document toDocument(String xml) throws DocumentException {
        return DocumentHelper.parseText(xml);
    }


    /** string to  map */
    public static Map<String, String> toMap(String xml) throws DocumentException {
        Document document = DocumentHelper.parseText(xml);
        Element rootElement = document.getRootElement();
        rootElement.elementIterator().forEachRemaining(element -> {
            String name = element.getName();
            String text = element.getText();
        });
        Map<String, String> map = new HashMap<String, String>();
        rootElement.elementIterator().forEachRemaining(element ->
                map.put(element.getName(), element.getText())
        );
        return map;
    }

    public static <T> T toObject(String xml, Class<T> clazz) throws DocumentException, IllegalAccessException, InstantiationException {

        Document document = DocumentHelper.parseText(xml);
        Element rootElement = document.getRootElement();

        T object = clazz.newInstance();
        List<Field> fields = getAllField(clazz);

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
            Object value = TypeUtils.castToJavaBean(text, field.getType());
            field.set(object, value);
            field.setAccessible(false);
        }
        return object;
    }


    private static List<Field> getAllField(Class clazz) {
        List<Field> fields = Arrays.asList(clazz.getClass().getDeclaredFields());
        List<Field> superFields = Arrays.asList(clazz.getClass().getSuperclass().getDeclaredFields());
        fields.addAll(superFields);
        return fields;
    }

}