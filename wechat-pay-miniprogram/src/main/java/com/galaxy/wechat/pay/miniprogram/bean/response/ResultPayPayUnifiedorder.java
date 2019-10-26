package com.galaxy.wechat.pay.miniprogram.bean.response;

import com.galaxy.wechat.pay.miniprogram.bean.AbstractBean;
import com.galaxy.wechat.pay.miniprogram.util.XmlValue;

/**
 * @Author galaxy
 * @Date 2019/10/20 18:40
 **/
public class ResultPayPayUnifiedorder extends AbstractBean {

    @XmlValue(name = "trade_type", isCDATA = true)
    protected String tradeType;

    @XmlValue(name = "prepay_id", isCDATA = true)
    protected String prepayId;

    @XmlValue(name = "code_url", isCDATA = true)
    protected String codeUrl;

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    @Override
    public String toString() {
        return "ResultPayUnifiedorder{" +
                "tradeType='" + tradeType + '\'' +
                ", prepayId='" + prepayId + '\'' +
                ", codeUrl='" + codeUrl + '\'' +
                "} " + super.toString();
    }
}
