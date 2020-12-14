package com.galaxy.miniprogram.bean.refundquery;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.galaxy.miniprogram.bean.BaseReturnEntity;

/**
 * @Author galaxy
 * @Date 2019/11/03 21:59
 **/
public class ResultRefundQuery extends BaseReturnEntity {

    @JacksonXmlProperty(localName = "total_refund_count")
    private String totalRefundCount;


    @JacksonXmlProperty(localName = "transaction_id")
    private String transactionId;


    @JacksonXmlProperty(localName = "out_trade_no")
    private String outTradeNo;


    @JacksonXmlProperty(localName = "total_fee")
    private String totalFee;


    @JacksonXmlProperty(localName = "settlement_total_fee")
    private String settlementTotalFee;

    @JacksonXmlProperty(localName = "fee_type")
    private String feeType;

    @JacksonXmlProperty(localName = "cash_fee")
    private String cashFee;

    @JacksonXmlProperty(localName = "refund_count")
    private String refundCount;

    @JacksonXmlProperty(localName = "out_refund_no_$n")
    private String outRefundNo$N;

    @JacksonXmlProperty(localName = "refund_id_$n")
    private String refundId$N;

    @JacksonXmlProperty(localName = "refund_channel_$n")
    private String refundChannel$N;

    @JacksonXmlProperty(localName = "refund_fee_$n")
    private String refundFee$N;

    @JacksonXmlProperty(localName = "settlement_refund_fee_$n")
    private String settlementRefundFee$N;

    @JacksonXmlProperty(localName = "coupon_type_$n_$m")
    private String couponType$N$M;

    @JacksonXmlProperty(localName = "coupon_refund_fee_$n")
    private String couponRefundFee$N;

    @JacksonXmlProperty(localName = "coupon_refund_count_$n")
    private String couponRefundCount$N;

    @JacksonXmlProperty(localName = "coupon_refund_id_$n_$m")
    private String couponRefundId$N$M;

    @JacksonXmlProperty(localName = "coupon_refund_fee_$n_$m")
    private String couponRefundFee$N$M;

    public String getTotalRefundCount() {
        return totalRefundCount;
    }

    public void setTotalRefundCount(String totalRefundCount) {
        this.totalRefundCount = totalRefundCount;
    }

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

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getSettlementTotalFee() {
        return settlementTotalFee;
    }

    public void setSettlementTotalFee(String settlementTotalFee) {
        this.settlementTotalFee = settlementTotalFee;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getCashFee() {
        return cashFee;
    }

    public void setCashFee(String cashFee) {
        this.cashFee = cashFee;
    }

    public String getRefundCount() {
        return refundCount;
    }

    public void setRefundCount(String refundCount) {
        this.refundCount = refundCount;
    }

    public String getOutRefundNo$N() {
        return outRefundNo$N;
    }

    public void setOutRefundNo$N(String outRefundNo$N) {
        this.outRefundNo$N = outRefundNo$N;
    }

    public String getRefundId$N() {
        return refundId$N;
    }

    public void setRefundId$N(String refundId$N) {
        this.refundId$N = refundId$N;
    }

    public String getRefundChannel$N() {
        return refundChannel$N;
    }

    public void setRefundChannel$N(String refundChannel$N) {
        this.refundChannel$N = refundChannel$N;
    }

    public String getRefundFee$N() {
        return refundFee$N;
    }

    public void setRefundFee$N(String refundFee$N) {
        this.refundFee$N = refundFee$N;
    }

    public String getSettlementRefundFee$N() {
        return settlementRefundFee$N;
    }

    public void setSettlementRefundFee$N(String settlementRefundFee$N) {
        this.settlementRefundFee$N = settlementRefundFee$N;
    }

    public String getCouponType$N$M() {
        return couponType$N$M;
    }

    public void setCouponType$N$M(String couponType$N$M) {
        this.couponType$N$M = couponType$N$M;
    }

    public String getCouponRefundFee$N() {
        return couponRefundFee$N;
    }

    public void setCouponRefundFee$N(String couponRefundFee$N) {
        this.couponRefundFee$N = couponRefundFee$N;
    }

    public String getCouponRefundCount$N() {
        return couponRefundCount$N;
    }

    public void setCouponRefundCount$N(String couponRefundCount$N) {
        this.couponRefundCount$N = couponRefundCount$N;
    }

    public String getCouponRefundId$N$M() {
        return couponRefundId$N$M;
    }

    public void setCouponRefundId$N$M(String couponRefundId$N$M) {
        this.couponRefundId$N$M = couponRefundId$N$M;
    }

    public String getCouponRefundFee$N$M() {
        return couponRefundFee$N$M;
    }

    public void setCouponRefundFee$N$M(String couponRefundFee$N$M) {
        this.couponRefundFee$N$M = couponRefundFee$N$M;
    }

    @Override
    public String toString() {
        return "ResultRefundQuery{" +
                "totalRefundCount='" + totalRefundCount + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", totalFee='" + totalFee + '\'' +
                ", settlementTotalFee='" + settlementTotalFee + '\'' +
                ", feeType='" + feeType + '\'' +
                ", cashFee='" + cashFee + '\'' +
                ", refundCount='" + refundCount + '\'' +
                ", outRefundNo$N='" + outRefundNo$N + '\'' +
                ", refundId$N='" + refundId$N + '\'' +
                ", refundChannel$N='" + refundChannel$N + '\'' +
                ", refundFee$N='" + refundFee$N + '\'' +
                ", settlementRefundFee$N='" + settlementRefundFee$N + '\'' +
                ", couponType$N$M='" + couponType$N$M + '\'' +
                ", couponRefundFee$N='" + couponRefundFee$N + '\'' +
                ", couponRefundCount$N='" + couponRefundCount$N + '\'' +
                ", couponRefundId$N$M='" + couponRefundId$N$M + '\'' +
                ", couponRefundFee$N$M='" + couponRefundFee$N$M + '\'' +
                "} " + super.toString();
    }
}
