package com.galaxy.miniprogram.bean;

import com.galaxy.miniprogram.util.XmlValue;

/**
 * @author galaxy
 */
public abstract class BaseEntity {

    /**
     * 微信分配的小程序ID
     */
    @XmlValue(name = "appid")
    private String appid;

    /**
     * 微信支付分配的商户号
     */
    @XmlValue(name = "mch_id")
    private String mchId;

    /**
     * 随机字符串，长度要求在32位以内。
     * 无需关心, 回自动生成的
     */
    @XmlValue(name = "nonce_str")
    private String nonceStr;

    /**
     * 通过签名算法计算得出的签名值
     */
    @XmlValue(name = "sign")
    private String sign;

    /**
     * 签名类型，默认为MD5，支持HMAC-SHA256和MD5。
     */
    @XmlValue(name = "sign_type")
    private String signType;


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

