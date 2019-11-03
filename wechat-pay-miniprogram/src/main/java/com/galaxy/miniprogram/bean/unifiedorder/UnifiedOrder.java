package com.galaxy.miniprogram.bean.unifiedorder;

import com.galaxy.miniprogram.bean.BaseEntity;
import com.galaxy.miniprogram.util.XmlValue;

/**
 * 统一下单
 * 应用场景
 * 商户在小程序中先调用该接口在微信支付服务后台生成预支付交易单，返回正确的预支付交易后调起支付。
 *
 * 接口链接
 * URL地址：https://api.mch.weixin.qq.com/pay/unifiedorder
 *
 * 是否需要证书
 *
 * 否
 *
 * @Author galaxy
 * @Date 2019/10/19 13:29
 **/
public class UnifiedOrder extends BaseEntity {

    @XmlValue(name = "device_info")
    private String deviceInfo;

    @XmlValue(name = "body")
    private String body;

    @XmlValue(name = "detail", isCDATA = true)
    private String detail;

    @XmlValue(name = "attach")
    private String attach;

    @XmlValue(name = "out_trade_no")
    private String outTradeNo;

    @XmlValue(name = "fee_type")
    private String feeType;

    @XmlValue(name = "total_fee")
    private Integer totalFee;

    @XmlValue(name = "spbill_create_ip")
    private String spbillCreateIp;

    @XmlValue(name = "time_start")
    private String timeStart;

    @XmlValue(name = "time_expire")
    private String timeExpire;

    @XmlValue(name = "goods_tag")
    private String goodsTag;

    @XmlValue(name = "notify_url")
    private String notifyUrl;

    @XmlValue(name = "trade_type")
    private String tradeType;

    @XmlValue(name = "product_id")
    private String productId;

    @XmlValue(name = "limit_pay")
    private String limitPay;

    @XmlValue(name = "openid")
    private String openid;

    @XmlValue(name = "receipt")
    private String receipt;

    @XmlValue(name = "scene_info")
    private String sceneInfo;

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public String getSpbillCreateIp() {
        return spbillCreateIp;
    }

    public void setSpbillCreateIp(String spbillCreateIp) {
        this.spbillCreateIp = spbillCreateIp;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeExpire() {
        return timeExpire;
    }

    public void setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire;
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getLimitPay() {
        return limitPay;
    }

    public void setLimitPay(String limitPay) {
        this.limitPay = limitPay;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public String getSceneInfo() {
        return sceneInfo;
    }

    public void setSceneInfo(String sceneInfo) {
        this.sceneInfo = sceneInfo;
    }

    @Override
    public String toString() {
        return "PayUnifiedorder{" +
                "deviceInfo='" + deviceInfo + '\'' +
                ", body='" + body + '\'' +
                ", detail='" + detail + '\'' +
                ", attach='" + attach + '\'' +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", feeType='" + feeType + '\'' +
                ", totalFee='" + totalFee + '\'' +
                ", spbillCreateIp='" + spbillCreateIp + '\'' +
                ", timeStart='" + timeStart + '\'' +
                ", timeExpire='" + timeExpire + '\'' +
                ", goodsTag='" + goodsTag + '\'' +
                ", notifyUrl='" + notifyUrl + '\'' +
                ", tradeType='" + tradeType + '\'' +
                ", productId='" + productId + '\'' +
                ", limitPay='" + limitPay + '\'' +
                ", openid='" + openid + '\'' +
                ", receipt='" + receipt + '\'' +
                ", sceneInfo='" + sceneInfo + '\'' +
                "} " + super.toString();
    }
}