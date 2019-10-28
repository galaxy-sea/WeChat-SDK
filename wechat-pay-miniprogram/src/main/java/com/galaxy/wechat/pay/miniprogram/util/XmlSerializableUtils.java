package com.galaxy.wechat.pay.miniprogram.util;


import com.galaxy.wechat.pay.miniprogram.bean.AbstractBean;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/**
 * @Author galaxy
 * @Date 2019/10/25 19：40
 **/
public class XmlSerializableUtils {

    public static final String ROOT = "xml";

    /** 生成带有 sign 的 XML 格式字符串 */
    private static String toXml(AbstractBean abstractBean) throws IllegalAccessException {

        Document document = DocumentHelper.createDocument();
        Element root = document.addElement(ROOT);

        List<Field> fields = ReflectUtils.getAllField(abstractBean.getClass());

        for (Field field : fields) {
            XmlValue xmlValue = field.getAnnotation(XmlValue.class);
            if (xmlValue != null) {
                field.setAccessible(true);
                Object value = field.get(abstractBean);
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
    public static <T extends AbstractBean> T toObject(String xml, Class<T> clazz) throws DocumentException, IllegalAccessException, InstantiationException {
        Document document = DocumentHelper.parseText(xml);
        Element rootElement = document.getRootElement();

        T object = clazz.newInstance();
        List<Field> fields = ReflectUtils.getAllField(clazz);

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
            Object value = ReflectUtils.castToJavaBean(text, field.getType());
            field.set(object, value);
            field.setAccessible(false);
        }
        return object;
    }


    /** object to map */
    public static Map<String, String> toMap(AbstractBean abstractBean) throws IllegalAccessException {

        Map<String, String> map = new TreeMap<String, String>();

        List<Field> fields = ReflectUtils.getAllField(abstractBean.getClass());
        for (Field field : fields) {
            XmlValue xmlValue = field.getAnnotation(XmlValue.class);
            if (xmlValue != null) {
                field.setAccessible(true);
                Object value = field.get(abstractBean);
                field.setAccessible(false);
                if (value != null) {
                    map.put(xmlValue.name(), String.valueOf(value));
                }
            }
        }
        return map;
    }
}