package com.galaxy.miniprogram.bean.unifiedorder;

import com.galaxy.miniprogram.bean.BaseReturnEntity;
import com.galaxy.miniprogram.util.XmlValue;

/**
 * @Author galaxy
 * @Date 2019/10/20 18:40
 **/
public class ResultUnifiedOrder extends BaseReturnEntity {

    /**
     * 交易类型，取值为：JSAPI，NATIVE，APP等
     */
    @XmlValue(name = "device_info", isCDATA = true)
    private String deviceInfo;

    /**
     * 微信生成的预支付会话标识，用于后续接口调用中使用，该值有效期为2小时
     */
    @XmlValue(name = "trade_type", isCDATA = true)
    private String tradeType;

    /**
     * trade_type=NATIVE时有返回，此url用于生成支付二维码，然后提供给用户进行扫码支付。
     * 注意：code_url的值并非固定，使用时按照URL格式转成二维码即可
     */
    @XmlValue(name = "prepay_id", isCDATA = true)
    private String prepayId;

    /**
     * trade_type=NATIVE时有返回，此url用于生成支付二维码，然后提供给用户进行扫码支付。
     * 注意：code_url的值并非固定，使用时按照URL格式转成二维码即可
     */
    @XmlValue(name = "code_url", isCDATA = true)
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
