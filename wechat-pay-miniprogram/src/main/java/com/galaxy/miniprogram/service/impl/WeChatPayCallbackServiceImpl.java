package com.galaxy.miniprogram.service.impl;

import com.galaxy.miniprogram.bean.orderquery.ResultOrderQuery;
import com.galaxy.miniprogram.service.WeChatPayCallbackService;
import com.galaxy.miniprogram.util.SignatureUtils;
import com.galaxy.miniprogram.util.XmlSerializableUtils;
import org.springframework.stereotype.Service;

/**
 * @author galaxy
 */
@Service
public class WeChatPayCallbackServiceImpl implements WeChatPayCallbackService {


    @Override
    public void unifiedOrderCallback(String requestBody, String key) throws Exception {
        ResultOrderQuery resultOrderQuery = XmlSerializableUtils.toObject(requestBody, ResultOrderQuery.class);
        boolean signatureValid = SignatureUtils.isSignatureValid(resultOrderQuery, key);
        if (signatureValid) {
            System.out.println("业务成功");
        } else {
            System.out.println("失败了");
        }
    }

    @Override
    public void refundCallback(String requestBody, String key) {

    }
}
