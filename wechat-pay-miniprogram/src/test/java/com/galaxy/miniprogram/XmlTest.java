package com.galaxy.miniprogram;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * @author changjinwei
 * @date 2020/12/14
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WechatPayMiniprogramApplication.class)
public class XmlTest {

    @Autowired
    private XmlMapper xmlMapper;

    @Test
    public void whenJavaSerializedToXmlStr_thenCorrect() throws JsonProcessingException {

        String xml = xmlMapper.writeValueAsString(new SimpleBean());
        System.out.println(xml);
    }

    @Test
    public void whenJavaGotFromXmlStr_thenCorrect() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        SimpleBean value = xmlMapper.readValue("<?xml version='1.0' encoding='UTF-8'?><xml><x>1</x><y>2</y><y_date>2</y_date><y_date_data>2</y_date_data></xml>", SimpleBean.class);
        System.out.println(value);
    }

}

@JacksonXmlRootElement(localName = "xml")
class SimpleBean {
    private int x = 1;
    private int y = 2;
    private int yDate = 2;
    private int y_Date_data = 2;
    private Integer z;

    private SimpleBean bean;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public SimpleBean getBean() {
        return bean;
    }

    public void setBean(SimpleBean bean) {
        this.bean = bean;
    }


    public int getyDate() {
        return yDate;
    }

    public void setyDate(int yDate) {
        this.yDate = yDate;
    }

    public int getY_Date_data() {
        return y_Date_data;
    }

    public void setY_Date_data(int y_Date_data) {
        this.y_Date_data = y_Date_data;
    }

    @Override
    public String toString() {
        return "SimpleBean{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", bean=" + bean +
                '}';
    }
}