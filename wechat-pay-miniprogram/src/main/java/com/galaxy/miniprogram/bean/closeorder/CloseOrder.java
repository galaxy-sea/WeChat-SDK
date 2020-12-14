package com.galaxy.miniprogram.bean.closeorder;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.galaxy.miniprogram.bean.BaseEntity;

/**
 * 应用场景
 * 以下情况需要调用关单接口：商户订单支付失败需要生成新单号重新发起支付，要对原订单号调用关单，避免重复支付；系统下单后，用户支付超时，系统退出不再受理，避免用户继续，请调用关单接口。
 *
 * 注意：订单生成后不能马上调用关单接口，最短调用时间间隔为5分钟。
 * 接口地址
 * 接口链接：https://api.mch.weixin.qq.com/pay/closeorder
 *
 * 是否需要证书
 * 不需要。
 *
 * @Author galaxy
 * @Date 2019/11/03 21:02
 **/
public class CloseOrder extends BaseEntity {

    @JacksonXmlProperty(localName = "out_trade_no")
    private String outTradeNo;

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    @Override
    public String toString() {
        return "CloseOrder{" +
                "outTradeNo='" + outTradeNo + '\'' +
                "} " + super.toString();
    }
}
