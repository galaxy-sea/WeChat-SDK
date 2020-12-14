package com.galaxy.miniprogram.bean.unifiedorder;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.galaxy.miniprogram.bean.BaseReturnEntity;

/**
 * @Author galaxy
 * @Date 2019/10/20 18:40
 **/
public class ResultUnifiedOrder extends BaseReturnEntity {

    /**
     * 交易类型，取值为：JSAPI，NATIVE，APP等
     */
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "device_info")
    private String deviceInfo;

    /**
     * 微信生成的预支付会话标识，用于后续接口调用中使用，该值有效期为2小时
     */
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "trade_type")
    private String tradeType;

    /**
     * trade_type=NATIVE时有返回，此url用于生成支付二维码，然后提供给用户进行扫码支付。
     * 注意：code_url的值并非固定，使用时按照URL格式转成二维码即可
     */
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "prepay_id")
    private String prepayId;

    /**
     * trade_type=NATIVE时有返回，此url用于生成支付二维码，然后提供给用户进行扫码支付。
     * 注意：code_url的值并非固定，使用时按照URL格式转成二维码即可
     */
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "code_url")
    private String codeUrl;


    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

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
        return "ResultPayPayUnifiedorder{" +
                "deviceInfo='" + deviceInfo + '\'' +
                ", tradeType='" + tradeType + '\'' +
                ", prepayId='" + prepayId + '\'' +
                ", codeUrl='" + codeUrl + '\'' +
                "} " + super.toString();
    }
}
