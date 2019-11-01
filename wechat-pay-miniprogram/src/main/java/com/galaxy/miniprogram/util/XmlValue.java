package com.galaxy.miniprogram.util;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author galaxy
 * @Date 2019/10/19 13:39
 **/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface XmlValue {

    /** xml的标签名 */
    String name() default "";

    /** 标签的参数是否为 CDATA 默认为  false */
    boolean isCDATA() default false;
}
