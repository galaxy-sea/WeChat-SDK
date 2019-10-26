package com.galaxy.wechat.pay.miniprogram.bean;

import com.galaxy.wechat.pay.miniprogram.util.XmlValue;

public abstract class AbstractBean {
    @XmlValue(name = "appid")
    private String appid;

    @XmlValue(name = "mch_id")
    private String mchId;

    @XmlValue(name = "nonce_str")
    private String nonceStr;

    @XmlValue(name = "sign")
    private String sign;

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

