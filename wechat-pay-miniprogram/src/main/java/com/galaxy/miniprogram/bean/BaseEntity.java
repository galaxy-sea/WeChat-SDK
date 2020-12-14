package com.galaxy.miniprogram.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 公共的五个参数
 * appid
 * mch_id
 * nonce_str
 * sign
 * sign_type
 *
 * @author galaxy
 */
@JacksonXmlRootElement(localName = "xml")
public abstract class BaseEntity {

    /**
     * 微信分配的小程序ID
     */
    @JacksonXmlProperty(localName = "appid")
    protected String appid;

    /**
     * 微信支付分配的商户号
     */
    @JacksonXmlProperty(localName = "mch_id")
    protected String mchId;

    /**
     * 随机字符串，长度要求在32位以内。
     * 无需关心, 回自动生成的
     */
    @JacksonXmlProperty(localName = "nonce_str")
    protected String nonceStr;

    /**
     * 通过签名算法计算得出的签名值
     */
    @JacksonXmlProperty(localName = "sign")
    protected String sign;

    /**
     * 签名类型，默认为MD5，支持HMAC-SHA256和MD5。
     */
    @JacksonXmlProperty(localName = "sign_type")
    protected String signType;


    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    @Override
    public String toString() {
        return "AbstractBean{" +
                "appid='" + appid + '\'' +
                ", mchId='" + mchId + '\'' +
                ", nonceStr='" + nonceStr + '\'' +
                ", sign='" + sign + '\'' +
                ", signType='" + signType + '\'' +
                '}';
    }
}

