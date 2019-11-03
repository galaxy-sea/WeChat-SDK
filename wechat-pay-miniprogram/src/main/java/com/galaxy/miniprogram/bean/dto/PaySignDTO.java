package com.galaxy.miniprogram.bean.dto;

import com.galaxy.miniprogram.bean.BaseEntity;
import com.galaxy.miniprogram.util.XmlValue;

/**
 * 其实我很不想写写这个类的,腾讯的文档简直和屎一样,
 * 变量和方法的命名一会儿驼峰命名,一会儿下划线命名,
 * 简直就是屎一样的文档哈哈哈,
 *
 * @Author galaxy
 * @Date 2019/11/03 11:09
 **/
public class PaySignDTO extends BaseEntity {

    /**
     * 微信分配的小程序ID
     */
    @XmlValue(name = "appId")
    private String appid;

    /**
     * 	时间戳从1970年1月1日00:00:00至今的秒数,即当前的时间
     */
    @XmlValue(name = "timeStamp")
    private String timeStamp;

    /**
     * 随机字符串，不长于32位。推荐随机数生成算法
     */
    @XmlValue(name = "nonceStr")
    private String nonceStr;

    /**
     * package是关键字就换成了prepayId作为变量名
     *
     * 统一下单接口返回的 prepay_id 参数值，提交格式如：prepay_id=wx2017033010242291fcfe0db70013231072
     */
    @XmlValue(name = "package")
    private String prepayId;

    /**
     * 签名类型，默认为MD5，支持HMAC-SHA256和MD5。注意此处需与统一下单的签名类型一致
     */
    @XmlValue(name = "signType")
    private String signType;

    /**
     * 签名
     */
    @XmlValue(name = "paySign")
    private String sign;


    @Override
    public String getAppid() {
        return appid;
    }

    @Override
    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String getNonceStr() {
        return nonceStr;
    }

    @Override
    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    @Override
    public String getSignType() {
        return signType;
    }

    @Override
    public void setSignType(String signType) {
        this.signType = signType;
    }

    @Override
    public String getSign() {
        return sign;
    }

    @Override
    public void setSign(String sign) {
        this.sign = sign;
    }
}
