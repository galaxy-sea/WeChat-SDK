package com.galaxy.miniprogram.bean.orderquery;

import com.galaxy.miniprogram.bean.BaseEntity;

/**
 * 应用场景
 * 该接口提供所有微信支付订单的查询，商户可以通过查询订单接口主动查询订单状态，完成下一步的业务逻辑。
 *
 * 需要调用查询接口的情况：
 *
 * ◆ 当商户后台、网络、服务器等出现异常，商户系统最终未接收到支付通知；
 * ◆ 调用支付接口后，返回系统错误或未知交易状态情况；
 * ◆ 调用刷卡支付API，返回USERPAYING的状态；
 * ◆ 调用关单或撤销接口API之前，需确认支付状态；
 * 接口链接
 * https://api.mch.weixin.qq.com/pay/orderquery
 *
 * 是否需要证书
 * 不需要
 *
 * @Author galaxy
 * @Date 2019/11/03
 **/
public class OrderQuery extends BaseEntity {

    /**
     * 微信的订单号，优先使用
     */
    // @XmlValue(name = "transaction_id")
    private String transactionId;

    /**
     * 商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|*@ ，且在同一个商户号下唯一。 详见商户订单号
     */
    // @XmlValue(name = "out_trade_no")
    private String outTradeNo;


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

    @Override
    public String toString() {
        return "OrderQuery{" +
                "transactionId='" + transactionId + '\'' +
                ", outTradeNo='" + outTradeNo + '\'' +
                "} " + super.toString();
    }
}