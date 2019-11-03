package com.galaxy.miniprogram.bean.refund;

import com.galaxy.miniprogram.bean.BaseReturnEntity;
import com.galaxy.miniprogram.util.XmlValue;

/**
 * @Author galaxy
 * @Date 2019/11/03 21:27
 **/
public class ResultRefund extends BaseReturnEntity {

    @XmlValue(name = "transaction_id")
    private String transactionId;


    @XmlValue(name = "out_trade_no")
    private String outTradeNo;


    @XmlValue(name = "out_refund_no")
    private String outRefundNo;


    @XmlValue(name = "refund_id")
    private String refundId;



    @XmlValue(name = "refund_fee")
    private Integer refundFee;



    @XmlValue(name = "settlement_refund_fee")
    private Integer settlementRefundFee;



    @XmlValue(name = "total_fee")
    private Integer totalFee;



    @XmlValue(name = "settlement_total_fee")
    private Integer settlementTotalFee;


    @XmlValue(name = "fee_type")
    private String feeType;


    @XmlValue(name = "cash_fee")
    private Integer cashFee;


    @XmlValue(name = "cash_fee_type")
    private String cashFeeType;


    @XmlValue(name = "cash_refund_fee")
    private String 	cashRefundFee;


    @XmlValue(name = "coupon_type_$n")
    private String couponType$N;


    @XmlValue(name = "coupon_refund_fee")
    private Integer couponRefundFee;


    @XmlValue(name = "coupon_refund_fee_$n")
    private Integer couponRefundFee$N;


    @XmlValue(name = "coupon_refund_count")
    private Integer couponRefundCount;

    @XmlValue(name = "coupon_refund_id_$n")
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
