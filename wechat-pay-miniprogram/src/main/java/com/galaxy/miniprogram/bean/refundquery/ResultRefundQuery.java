package com.galaxy.miniprogram.bean.refundquery;

import com.galaxy.miniprogram.bean.BaseEntity;
import com.galaxy.miniprogram.util.XmlValue;

/**
 * @Author galaxy
 * @Date 2019/11/03 21:59
 **/
public class ResultRefundQuery extends BaseEntity {

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

}
