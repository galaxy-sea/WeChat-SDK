package com.galaxy.miniprogram;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WechatPayMiniprogramApplication {

    public static void main(String[] args) {
        SpringApplication.run(WechatPayMiniprogramApplication.class, args);
    }


    @Bean
    public XmlMapper xmlMapper() {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true).setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        xmlMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return xmlMapper;
    }


}
