package com.galaxy.miniprogram.bean.refund;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.galaxy.miniprogram.bean.BaseReturnEntity;

/**
 * @Author galaxy
 * @Date 2019/11/03 21:27
 **/
public class ResultRefund extends BaseReturnEntity {

    @JacksonXmlProperty(localName = "transaction_id")
    private String transactionId;


    @JacksonXmlProperty(localName = "out_trade_no")
    private String outTradeNo;


    @JacksonXmlProperty(localName = "out_refund_no")
    private String outRefundNo;


    @JacksonXmlProperty(localName = "refund_id")
    private String refundId;


    @JacksonXmlProperty(localName = "refund_fee")
    private Integer refundFee;


    @JacksonXmlProperty(localName = "settlement_refund_fee")
    private Integer settlementRefundFee;


    @JacksonXmlProperty(localName = "total_fee")
    private Integer totalFee;


    @JacksonXmlProperty(localName = "settlement_total_fee")
    private Integer settlementTotalFee;


    @JacksonXmlProperty(localName = "fee_type")
    private String feeType;


    @JacksonXmlProperty(localName = "cash_fee")
    private Integer cashFee;


    @JacksonXmlProperty(localName = "cash_fee_type")
    private String cashFeeType;


    @JacksonXmlProperty(localName = "cash_refund_fee")
    private String cashRefundFee;


    @JacksonXmlProperty(localName = "coupon_type_$n")
    private String couponType$N;


    @JacksonXmlProperty(localName = "coupon_refund_fee")
    private Integer couponRefundFee;


    @JacksonXmlProperty(localName = "coupon_refund_fee_$n")
    private Integer couponRefundFee$N;


    @JacksonXmlProperty(localName = "coupon_refund_count")
    private Integer couponRefundCount;

    @JacksonXmlProperty(localName = "coupon_refund_id_$n")
    private String couponRefundId$N;


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

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public Integer getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(Integer refundFee) {
        this.refundFee = refundFee;
    }

    public Integer getSettlementRefundFee() {
        return settlementRefundFee;
    }

    public void setSettlementRefundFee(Integer settlementRefundFee) {
        this.settlementRefundFee = settlementRefundFee;
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public Integer getSettlementTotalFee() {
        return settlementTotalFee;
    }

    public void setSettlementTotalFee(Integer settlementTotalFee) {
        this.settlementTotalFee = settlementTotalFee;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public Integer getCashFee() {
        return cashFee;
    }

    public void setCashFee(Integer cashFee) {
        this.cashFee = cashFee;
    }

    public String getCashFeeType() {
        return cashFeeType;
    }

    public void setCashFeeType(String cashFeeType) {
        this.cashFeeType = cashFeeType;
    }

    public String getCashRefundFee() {
        return cashRefundFee;
    }

    public void setCashRefundFee(String cashRefundFee) {
        this.cashRefundFee = cashRefundFee;
    }

    public String getCouponType$N() {
        return couponType$N;
    }

    public void setCouponType$N(String couponType$N) {
        this.couponType$N = couponType$N;
    }

    public Integer getCouponRefundFee() {
        return couponRefundFee;
    }

    public void setCouponRefundFee(Integer couponRefundFee) {
        this.couponRefundFee = couponRefundFee;
    }

    public Integer getCouponRefundFee$N() {
        return couponRefundFee$N;
    }

    public void setCouponRefundFee$N(Integer couponRefundFee$N) {
        this.couponRefundFee$N = couponRefundFee$N;
    }

    public Integer getCouponRefundCount() {
        return couponRefundCount;
    }

    public void setCouponRefundCount(Integer couponRefundCount) {
        this.couponRefundCount = couponRefundCount;
    }

    public String getCouponRefundId$N() {
        return couponRefundId$N;
    }

    public void setCouponRefundId$N(String couponRefundId$N) {
        this.couponRefundId$N = couponRefundId$N;
    }

    @Override
    public String toString() {
        return "ResultRefund{" +
                "transactionId='" + transactionId + '\'' +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", outRefundNo='" + outRefundNo + '\'' +
                ", refundId='" + refundId + '\'' +
                ", refundFee=" + refundFee +
                ", settlementRefundFee=" + settlementRefundFee +
                ", totalFee=" + totalFee +
                ", settlementTotalFee=" + settlementTotalFee +
                ", feeType='" + feeType + '\'' +
                ", cashFee=" + cashFee +
                ", cashFeeType='" + cashFeeType + '\'' +
                ", cashRefundFee='" + cashRefundFee + '\'' +
                ", couponType$N='" + couponType$N + '\'' +
                ", couponRefundFee=" + couponRefundFee +
                ", couponRefundFee$N=" + couponRefundFee$N +
                ", couponRefundCount=" + couponRefundCount +
                ", couponRefundId$N='" + couponRefundId$N + '\'' +
                "} " + super.toString();
    }
}
