package com.galaxy.miniprogram.bean.refundquery;

import com.galaxy.miniprogram.bean.BaseEntity;
import com.galaxy.miniprogram.util.XmlValue;

/**
 * 查询退款
 * 应用场景
 * 提交退款申请后，通过调用该接口查询退款状态。退款有一定延时，用零钱支付的退款20分钟内到账，银行卡支付的退款3个工作日后重新查询退款状态。
 *
 * 注意：如果单个支付订单部分退款次数超过20次请使用退款单号查询
 *
 * 分页查询
 * 当一个订单部分退款超过10笔后，商户用微信订单号或商户订单号调退款查询API查询退款时，默认返回前10笔和total_refund_count（订单总退款次数）。商户需要查询同一订单下超过10笔的退款单时，可传入订单号及offset来查询，微信支付会返回offset及后面的10笔，以此类推。当商户传入的offset超过total_refund_count，则系统会返回报错PARAM_ERROR。
 *
 * 举例：
 *
 * 一笔订单下的退款单有36笔，当商户想查询第25笔时，可传入订单号及offset=24，微信支付平台会返回第25笔到第35笔的退款单信息，或商户可直接传入退款单号查询退款
 *
 * 退款状态机
 * 退款状态变化如下：
 *
 *
 * 接口地址
 * 接口链接：https://api.mch.weixin.qq.com/pay/refundquery
 *
 * 是否需要证书
 * 不需要。
 *
 * @Author galaxy
 * @Date 2019/11/03 21:59
 **/
public class RefundQuery extends BaseEntity {

    @XmlValue(name = "transaction_id")
    private String transactionId;


    @XmlValue(name = "out_trade_no")
    private String outTradeNo;


    @XmlValue(name = "out_refund_no")
    private String outRefundNo;


    @XmlValue(name = "refund_id")
    private String refundId;


    @XmlValue(name = "offset")
    private String offset;

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

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "RefundQuery{" +
                "transactionId='" + transactionId + '\'' +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", outRefundNo='" + outRefundNo + '\'' +
                ", refundId='" + refundId + '\'' +
                ", offset='" + offset + '\'' +
                "} " + super.toString();
    }
}
