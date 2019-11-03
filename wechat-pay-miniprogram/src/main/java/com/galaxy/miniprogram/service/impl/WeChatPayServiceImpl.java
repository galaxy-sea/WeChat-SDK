package com.galaxy.miniprogram.service.impl;

import com.galaxy.miniprogram.bean.BaseEntity;
import com.galaxy.miniprogram.bean.unifiedorder.PaySignDTO;
import com.galaxy.miniprogram.bean.closeorder.CloseOrder;
import com.galaxy.miniprogram.bean.orderquery.OrderQuery;
import com.galaxy.miniprogram.bean.unifiedorder.UnifiedOrder;
import com.galaxy.miniprogram.bean.BaseReturnEntity;
import com.galaxy.miniprogram.bean.closeorder.ResultCloseOrder;
import com.galaxy.miniprogram.bean.orderquery.ResultOrderQuery;
import com.galaxy.miniprogram.bean.unifiedorder.ResultUnifiedOrder;
import com.galaxy.miniprogram.service.WeChatPayService;
import com.galaxy.miniprogram.util.HttpUtils;
import com.galaxy.miniprogram.util.SignType;
import com.galaxy.miniprogram.util.SignatureUtils;
import com.galaxy.miniprogram.util.XmlSerializableUtils;

import java.net.URI;

/**
 * @author galaxy
 */
public class WeChatPayServiceImpl implements WeChatPayService {

    private static final String PREPAY_ID_STR;


    /** 统一下单 */
    private static final URI UNIFIEDORDER_URI;
    /** 查询订单 */
    private static final URI ORDERQUERY_URI;
    /** 关闭订单 */
    private static final URI CLOSEORDER_URI;
    /** 申请退款 */
    private static final URI REFUND_URI;
    /** 查询退款 */
    private static final URI REFUNDQUERY_URI;
    /** 下载对账单 */
    private static final URI DOWNLOADBILL_URI;
    /** 下载资金账单 */
    private static final URI DOWNLOADFUNDFLOW_URI;
    /** 交易保障 */
    private static final URI REPORT_URI;
    /** 拉取订单评价数据 */
    private static final URI BATCHQUERYCOMMENT_URI;


    static {

        PREPAY_ID_STR = "prepay_id=";

        UNIFIEDORDER_URI = URI.create("https://api.mch.weixin.qq.com/pay/unifiedorder");
        ORDERQUERY_URI = URI.create("https://api.mch.weixin.qq.com/pay/orderquery");
        CLOSEORDER_URI = URI.create("https://api.mch.weixin.qq.com/pay/closeorder");
        REFUND_URI = URI.create("https://api.mch.weixin.qq.com/secapi/pay/refund");
        REFUNDQUERY_URI = URI.create("https://api.mch.weixin.qq.com/secapi/pay/refund");
        DOWNLOADBILL_URI = URI.create("https://api.mch.weixin.qq.com/pay/downloadbill");
        DOWNLOADFUNDFLOW_URI = URI.create("https://api.mch.weixin.qq.com/pay/downloadfundflow");
        REPORT_URI = URI.create("https://api.mch.weixin.qq.com/payitil/report");
        BATCHQUERYCOMMENT_URI = URI.create("https://api.mch.weixin.qq.com/billcommentsp/batchquerycomment");
    }

    private <T extends BaseReturnEntity> T starWars(BaseEntity entity, SignType signType, String key, URI uri, Class<T> clazz) throws Exception {
        String nonceStr = SignatureUtils.generateNonceStr();
        entity.setNonceStr(nonceStr);
        String sign = SignatureUtils.generateSignature(entity, signType, key);
        entity.setSign(sign);
        String requestBody = XmlSerializableUtils.toXml(entity);
        System.out.println(requestBody);
        System.out.println();
        System.out.println();
        System.out.println();
        String responseBody = HttpUtils.doPost(uri, requestBody);
        System.out.println(responseBody);
        System.out.println();
        System.out.println();
        System.out.println();
        return XmlSerializableUtils.toObject(responseBody, clazz);
    }

    /**
     * 统一下单
     * 应用场景
     * 商户在小程序中先调用该接口在微信支付服务后台生成预支付交易单，返回正确的预支付交易后调起支付。
     * 接口链接
     * URL地址：https://api.mch.weixin.qq.com/pay/unifiedorder
     */
    public ResultUnifiedOrder unifiedOrder(UnifiedOrder unifiedOrder, SignType signType, String key) throws Exception {
        return starWars(unifiedOrder, signType, key, UNIFIEDORDER_URI, ResultUnifiedOrder.class);
    }


    /**
     * 小程序调起支付数据签名字段列表：
     * 字段名	变量名	必填	类型	示例值	描述
     * 小程序ID	appId	是	String	wxd678efh567hg6787	微信分配的小程序ID
     * 时间戳	timeStamp	是	String	1490840662	时间戳从1970年1月1日00:00:00至今的秒数,即当前的时间
     * 随机串	nonceStr	是	String	5K8264ILTKCH16CQ2502SI8ZNMTM67VS	随机字符串，不长于32位。推荐随机数生成算法
     * 数据包	package	是	String	prepay_id=wx2017033010242291fcfe0db70013231072	统一下单接口返回的 prepay_id 参数值，提交格式如：prepay_id=wx2017033010242291fcfe0db70013231072
     * 签名方式	signType	是	String	MD5	签名类型，默认为MD5，支持HMAC-SHA256和MD5。注意此处需与统一下单的签名类型一致
     *
     * @param resultUnifiedOrder
     * @param signType
     * @param key
     * @return
     * @throws Exception
     */
    @Override
    public PaySignDTO toPaySignDTO(ResultUnifiedOrder resultUnifiedOrder, SignType signType, String key) throws Exception {

        PaySignDTO paySign = new PaySignDTO();
        paySign.setAppid(resultUnifiedOrder.getAppid());
        paySign.setNonceStr(SignatureUtils.generateNonceStr());
        paySign.setPrepayId(PREPAY_ID_STR + resultUnifiedOrder.getPrepayId());
        paySign.setSignType(signType.getType());
        paySign.setTimeStamp(String.valueOf(System.currentTimeMillis() / 1000));

        String sign = SignatureUtils.generateSignature(paySign, signType, key);
        paySign.setSign(sign);

        return paySign;
    }

    @Override
    public ResultOrderQuery orderQuery(OrderQuery orderQuery, SignType signType, String key) throws Exception {
        return starWars(orderQuery, signType, key, ORDERQUERY_URI, ResultOrderQuery.class);
    }

    @Override
    public ResultCloseOrder closeOrder(CloseOrder closeOrder, SignType signType, String key) throws Exception {
        return starWars(closeOrder, signType, key, CLOSEORDER_URI, ResultCloseOrder.class);
    }
}
