package com.galaxy.wechat.pay.miniprogram.bean.request;

import com.galaxy.wechat.pay.miniprogram.bean.AbstractBean;
import com.galaxy.wechat.pay.miniprogram.util.XmlValue;

/**
 * 统一下单的请求的bean
 *
 * @Author galaxy
 * @Date 2019/10/19 13:29
 **/
public class PayUnifiedorder extends AbstractBean {


    @XmlValue(name = "body")
    private String body;

    @XmlValue(name = "out_trade_no")
    private String outTradeNo;

    @XmlValue(name = "total_fee")
    private Integer totalFee;

    @XmlValue(name = "spbill_create_ip")
    private String spbillCreateIp;

    @XmlValue(name = "notify_url")
    private String notifyUrl;

    @XmlValue(name = "trade_type")
    private String tradeType;

    @XmlValue(name = "device_info")
    private String deviceInfo;

    @XmlValue(name = "detail", isCDATA = true)
    private String detail;


    @XmlValue(name = "attach")
    private String attach;

    @XmlValue(name = "fee_type")
    private String feeType;

    @XmlValue(name = "time_start")
    private String timeStart;

    @XmlValue(name = "time_expire")
    private String timeExpire;

    @XmlValue(name = "goods_tag")
    private String goodsTag;

    @XmlValue(name = "product_id")
    private String productId;

    @XmlValue(name = "limit_pay")
    private String limitPay;

    @XmlValue(name = "openid")
    private String openid;

    @XmlValue(name = "receipt")
    private String receipt;

    @XmlValue(name = "scene_info")
    private String sceneinfo;


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
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

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
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

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
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

    public String getSceneinfo() {
        return sceneinfo;
    }

    public void setSceneinfo(String sceneinfo) {
        this.sceneinfo = sceneinfo;
    }

    @Override
    public String toString() {
        return "PayUnifiedorder{" +
                "body='" + body + '\'' +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", totalFee=" + totalFee +
                ", spbillCreateIp='" + spbillCreateIp + '\'' +
                ", notifyUrl='" + notifyUrl + '\'' +
                ", tradeType='" + tradeType + '\'' +
                ", deviceInfo='" + deviceInfo + '\'' +
                ", detail='" + detail + '\'' +
                ", attach='" + attach + '\'' +
                ", feeType='" + feeType + '\'' +
                ", timeStart='" + timeStart + '\'' +
                ", timeExpire='" + timeExpire + '\'' +
                ", goodsTag='" + goodsTag + '\'' +
                ", productId='" + productId + '\'' +
                ", limitPay='" + limitPay + '\'' +
                ", openid='" + openid + '\'' +
                ", receipt='" + receipt + '\'' +
                ", sceneinfo='" + sceneinfo + '\'' +
                "} " + super.toString();
    }
}