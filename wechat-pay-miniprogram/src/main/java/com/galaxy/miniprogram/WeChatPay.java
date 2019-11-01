package com.galaxy.miniprogram;

import com.galaxy.miniprogram.bean.BaseEntity;
import com.galaxy.miniprogram.bean.request.UnifiedOrder;
import com.galaxy.miniprogram.bean.response.BaseReturnEntity;
import com.galaxy.miniprogram.bean.response.ResultPayUnifiedOrder;
import com.galaxy.miniprogram.util.HttpUtils;
import com.galaxy.miniprogram.util.SignatureUtils;
import com.galaxy.miniprogram.util.XmlSerializableUtils;

import java.net.URI;

/**
 * @author galaxy
 */
public class WeChatPay {


    private static final URI UNIFIEDORDER_URL_SUFFIX;

    static {
        UNIFIEDORDER_URL_SUFFIX = URI.create("https://api.mch.weixin.qq.com/pay/unifiedorder");

    }

    private <T extends BaseReturnEntity> T starWars(BaseEntity entity, String key, URI uri, Class<T> clazz) throws Exception {
        String nonceStr = SignatureUtils.generateNonceStr();
        entity.setNonceStr(nonceStr);
        String sign = SignatureUtils.generateSignature(entity, key);
        entity.setSign(sign);
        String requestBody = XmlSerializableUtils.toXml(entity);
        String responseBody = HttpUtils.doPost(uri, requestBody);
        return XmlSerializableUtils.toObject(responseBody, clazz);
    }

    public ResultPayUnifiedOrder unifiedOrder(UnifiedOrder unifiedOrder, String key) throws Exception {
        return starWars(unifiedOrder, key, UNIFIEDORDER_URL_SUFFIX, ResultPayUnifiedOrder.class);
    }


}
