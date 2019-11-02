package com.galaxy.miniprogram;

import com.galaxy.miniprogram.bean.BaseEntity;
import com.galaxy.miniprogram.bean.request.UnifiedOrder;
import com.galaxy.miniprogram.bean.response.BaseReturnEntity;
import com.galaxy.miniprogram.bean.response.ResultPayUnifiedOrder;
import com.galaxy.miniprogram.util.HttpUtils;
import com.galaxy.miniprogram.util.SignType;
import com.galaxy.miniprogram.util.SignatureUtils;
import com.galaxy.miniprogram.util.XmlSerializableUtils;

import java.net.URI;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author galaxy
 */
public class WeChatPay {


    private static final URI UNIFIEDORDER_URL_SUFFIX;


    public static final String PREPAY_ID;
    public static final String APP_ID;
    public static final String NONCE_STR;
    public static final String PACKAGE;
    public static final String SIGN_TYPE;
    public static final String TIME_STAMP;
    public static final String PAY_SIGN;


    static {
        PREPAY_ID = "prepay_id=";
        APP_ID = "appId";
        NONCE_STR = "nonceStr";
        PACKAGE = "package";
        SIGN_TYPE = "signType";
        TIME_STAMP = "timeStamp";
        PAY_SIGN = "paySign";

        UNIFIEDORDER_URL_SUFFIX = URI.create("https://api.mch.weixin.qq.com/pay/unifiedorder");
    }

    private <T extends BaseReturnEntity> T starWars(BaseEntity entity, SignType signType, String key, URI uri, Class<T> clazz) throws Exception {
        String nonceStr = SignatureUtils.generateNonceStr();
        entity.setNonceStr(nonceStr);
        String sign = SignatureUtils.generateSignature(entity, signType, key);
        entity.setSign(sign);
        String requestBody = XmlSerializableUtils.toXml(entity);
        System.out.println(requestBody);
        String responseBody = HttpUtils.doPost(uri, requestBody);
        System.out.println(responseBody);
        return XmlSerializableUtils.toObject(responseBody, clazz);
    }

    /**
     * 统一下单
     * 应用场景
     * 商户在小程序中先调用该接口在微信支付服务后台生成预支付交易单，返回正确的预支付交易后调起支付。
     * 接口链接
     * URL地址：https://api.mch.weixin.qq.com/pay/unifiedorder
     */

    public ResultPayUnifiedOrder unifiedOrder(UnifiedOrder unifiedOrder, SignType signType, String key) throws Exception {
        return starWars(unifiedOrder, signType, key, UNIFIEDORDER_URL_SUFFIX, ResultPayUnifiedOrder.class);
    }


    public Map<String, String> toPaySignDTO(ResultPayUnifiedOrder resultPayUnifiedOrder, SignType signType, String key) throws Exception {
        Map<String, String> PaySign = new TreeMap<String, String>();
        PaySign.put(APP_ID, resultPayUnifiedOrder.getAppid());
        PaySign.put(NONCE_STR, SignatureUtils.generateNonceStr());
        PaySign.put(PACKAGE, PREPAY_ID + resultPayUnifiedOrder.getPrepayId());
        PaySign.put(SIGN_TYPE, signType.getType());
        PaySign.put(TIME_STAMP, String.valueOf(System.currentTimeMillis() / 1000));
        String sign = SignatureUtils.generateSignature(PaySign, signType, key);
        PaySign.put(PAY_SIGN, sign);
        PaySign.remove(APP_ID);
        return PaySign;
    }

}
