package com.galaxy.miniprogram.bean.refund;

import com.galaxy.miniprogram.bean.BaseEntity;

/**
 * 当交易发生之后一段时间内，由于买家或者卖家的原因需要退款时，卖家可以通过退款接口将支付款退还给买家，
 * 微信支付将在收到退款请求并且验证成功之后，按照退款规则将支付款按原路退到买家帐号上。
 *
 * 注意：
 *
 * 1、交易时间超过一年的订单无法提交退款
 *
 * 2、微信支付退款支持单笔交易分多次退款，多次退款需要提交原支付订单的商户订单号和设置不同的退款单号。
 * 申请退款总金额不能超过订单金额。 一笔退款失败后重新提交，请不要更换退款单号，请使用原商户退款单号
 *
 * 3、请求频率限制：150qps，即每秒钟正常的申请退款请求次数不超过150次
 *
 * 错误或无效请求频率限制：6qps，即每秒钟异常或错误的退款申请请求不超过6次
 *
 * 4、每个支付订单的部分退款次数不能超过50次
 *
 * @Author galaxy
 * @Date 2019/11/03 21:15
 **/
public class Refund extends BaseEntity {

    // @XmlValue(name = "transaction_id")
    private String transactionId;


    // @XmlValue(name = "out_trade_no")
    private String outTradeNo;


    // @XmlValue(name = "out_refund_no")
    private String outRefundNo;

    // @XmlValue(name = "total_fee")
    private Integer totalFee;

    // @XmlValue(name = "refund_fee")
    private Integer refundFee;

    // @XmlValue(name = "refund_fee_type")
    private String refundFeeType;


    // @XmlValue(name = "refund_desc")
    private String refundDesc;

    // @XmlValue(name = "refund_account")
    private String refundAccount;

    // @XmlValue(name = "notify_url")
    private String notifyUrl;


    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getOutRefundNo() {
        return outRefundNo;
    }

    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public Integer getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(Integer refundFee) {
        this.refundFee = refundFee;
    }

    public String getRefundFeeType() {
        return refundFeeType;
    }

    public void setRefundFeeType(String refundFeeType) {
        this.refundFeeType = refundFeeType;
    }

    public String getRefundDesc() {
        return refundDesc;
    }

    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc;
    }

    public String getRefundAccount() {
        return refundAccount;
    }

    public void setRefundAccount(String refundAccount) {
        this.refundAccount = refundAccount;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    @Override
    public String toString() {
        return "Refund{" +
                "transactionId='" + transactionId + '\'' +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", outRefundNo='" + outRefundNo + '\'' +
                ", totalFee='" + totalFee + '\'' +
                ", refundFee='" + refundFee + '\'' +
                ", refundFeeType='" + refundFeeType + '\'' +
                ", refundDesc='" + refundDesc + '\'' +
                ", refundAccount='" + refundAccount + '\'' +
                ", notifyUrl='" + notifyUrl + '\'' +
                "} " + super.toString();
    }
}
