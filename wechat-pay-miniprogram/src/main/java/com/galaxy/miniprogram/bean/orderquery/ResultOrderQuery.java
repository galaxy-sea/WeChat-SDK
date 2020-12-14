package com.galaxy.miniprogram.bean.orderquery;

import com.galaxy.miniprogram.bean.BaseReturnEntity;

/**
 *
 **/
public class ResultOrderQuery extends BaseReturnEntity {


    /**
     * 设备号	device_info	否	String(32)	013467007045764	微信支付分配的终端设备号，
     */
    // @XmlValue(name = "device_info")
    private String deviceInfo;

    /**
     * 用户标识	openid	是	String(128)	oUpF8uMuAJO_M2pxb1Q9zNjWeS6o	用户在商户appid下的唯一标识
     */
    // @XmlValue(name = "openid")
    private String openid;

    /**
     * 是否关注公众账号	is_subscribe	是	String(1)	Y	用户是否关注公众账号，Y-关注，N-未关注
     */
    // @XmlValue(name = "is_subscribe")
    private String isSubscribe;

    /**
     * 交易类型	trade_type	是	String(16)	JSAPI	调用接口提交的交易类型，取值如下：JSAPI，NATIVE，APP，MICROPAY，详细说明见参数规定
     */
    // @XmlValue(name = "trade_type")
    private String tradeType;

    /**
     * 交易状态	trade_state	是	String(32)	SUCCESS
     * SUCCESS—支付成功,  REFUND—转入退款,  NOTPAY—未支付,  CLOSED—已关闭
     * REVOKED—已撤销（刷卡支付）,  USERPAYING--用户支付中,  PAYERROR--支付失败(其他原因，如银行返回失败)
     */
    // @XmlValue(name = "trade_state")
    private String tradeState;

    /**
     * 付款银行	bank_type	是	String(16)	CMC	银行类型，采用字符串类型的银行标识
     */
    // @XmlValue(name = "bank_type")
    private String bankType;

    /**
     * 标价金额	total_fee	是	Int	100	订单总金额，单位为分
     */
    // @XmlValue(name = "total_fee")
    private Integer totalFee;

    /**
     * 应结订单金额	settlement_total_fee	否	Int	100	当订单使用了免充值型优惠券后返回该参数，应结订单金额=订单金额-免充值优惠券金额。
     */
    // @XmlValue(name = "settlement_total_fee")
    private Integer settlementTotalFee;


    /**
     * 标价币种	fee_type	否	String(8)	CNY	货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见货币类型
     */
    // @XmlValue(name = "fee_type")
    private String feeType;


    /**
     * 现金支付金额	cash_fee	是	Int	100	现金支付金额订单现金支付金额，详见支付金额
     */
    // @XmlValue(name = "cash_fee")
    private Integer cashFee;

    /**
     * 现金支付币种	cash_fee_type	否	String(16)	CNY	货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见货币类型
     */
    // @XmlValue(name = "cash_fee_type")
    private String cashFeeType;

    /**
     * 代金券金额	coupon_fee	否	Int	100	“代金券”金额<=订单金额，订单金额-“代金券”金额=现金支付金额，详见支付金额
     */
    // @XmlValue(name = "coupon_fee")
    private String couponFee;

    /**
     * 代金券使用数量	coupon_count	否	Int	1	代金券使用数量
     */
    // @XmlValue(name = "coupon_count")
    private String couponCount;

    /**
     * 代金券类型	coupon_type_$n	否	String	CASH
     * CASH--充值代金券
     * NO_CASH---非充值优惠券
     * 开通免充值券功能，并且订单使用了优惠券后有返回（取值：CASH、NO_CASH）。$n为下标,从0开始编号，举例：coupon_type_$0
     */
    // @XmlValue(name = "coupon_type_$n")
    private String couponType$N;

    /**
     * 代金券ID	coupon_id_$n	否	String(20)	10000 	代金券ID, $n为下标，从0开始编号
     */
    // @XmlValue(name = "coupon_id_$n")
    private String couponId$N;

    /**
     * 单个代金券支付金额	coupon_fee_$n	否	Int	100	单个代金券支付金额, $n为下标，从0开始编号
     */
    // @XmlValue(name = "coupon_fee_$n")
    private Integer couponFee$N;

    /**
     * 微信支付订单号	transaction_id	是	String(32)	1009660380201506130728806387	微信支付订单号
     */
    // @XmlValue(name = "transaction_id")
    private String transactionId;

    /**
     * 商户订单号	out_trade_no	是	String(32)	20150806125346	商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|*@ ，且在同一个商户号下唯一。
     */
    // @XmlValue(name = "out_trade_no")
    private String outTradeNo;

    /**
     * 附加数据	attach	否	String(128)	深圳分店	附加数据，原样返回
     */
    // @XmlValue(name = "attach")
    private String attach;

    /**
     * 支付完成时间	time_end	是	String(14)	20141030133525	订单支付时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。其他详见时间规则
     */
    // @XmlValue(name = "time_end")
    private String timeEnd;

    /**
     * 交易状态描述	trade_state_desc	是	String(256)	支付失败，请重新下单支付	对当前查询订单状态的描述和下一步操作的指引
     */
    // @XmlValue(name = "trade_state_desc")
    private String tradeStateDesc;

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getIsSubscribe() {
        return isSubscribe;
    }

    public void setIsSubscribe(String isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getTradeState() {
        return tradeState;
    }

    public void setTradeState(String tradeState) {
        this.tradeState = tradeState;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
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

    public String getCouponFee() {
        return couponFee;
    }

    public void setCouponFee(String couponFee) {
        this.couponFee = couponFee;
    }

    public String getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(String couponCount) {
        this.couponCount = couponCount;
    }

    public String getCouponType$N() {
        return couponType$N;
    }

    public void setCouponType$N(String couponType$N) {
        this.couponType$N = couponType$N;
    }

    public String getCouponId$N() {
        return couponId$N;
    }

    public void setCouponId$N(String couponId$N) {
        this.couponId$N = couponId$N;
    }

    public Integer getCouponFee$N() {
        return couponFee$N;
    }

    public void setCouponFee$N(Integer couponFee$N) {
        this.couponFee$N = couponFee$N;
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

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getTradeStateDesc() {
        return tradeStateDesc;
    }

    public void setTradeStateDesc(String tradeStateDesc) {
        this.tradeStateDesc = tradeStateDesc;
    }

    @Override
    public String toString() {
        return "ResultOrderQuery{" +
                "deviceInfo='" + deviceInfo + '\'' +
                ", openid='" + openid + '\'' +
                ", isSubscribe='" + isSubscribe + '\'' +
                ", tradeType='" + tradeType + '\'' +
                ", tradeState='" + tradeState + '\'' +
                ", bankType='" + bankType + '\'' +
                ", totalFee=" + totalFee +
                ", settlementTotalFee=" + settlementTotalFee +
                ", feeType='" + feeType + '\'' +
                ", cashFee=" + cashFee +
                ", cashFeeType='" + cashFeeType + '\'' +
                ", couponFee='" + couponFee + '\'' +
                ", couponCount='" + couponCount + '\'' +
                ", couponType$N='" + couponType$N + '\'' +
                ", couponId$N='" + couponId$N + '\'' +
                ", couponFee$N=" + couponFee$N +
                ", transactionId='" + transactionId + '\'' +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", attach='" + attach + '\'' +
                ", timeEnd='" + timeEnd + '\'' +
                ", tradeStateDesc='" + tradeStateDesc + '\'' +
                "} " + super.toString();
    }
}
