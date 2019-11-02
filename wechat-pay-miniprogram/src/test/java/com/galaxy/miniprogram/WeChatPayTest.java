package com.galaxy.miniprogram;

import com.alibaba.fastjson.JSON;
import com.galaxy.miniprogram.bean.request.UnifiedOrder;
import com.galaxy.miniprogram.bean.response.ResultPayUnifiedOrder;
import com.galaxy.miniprogram.util.SignType;
import org.junit.Test;

import java.util.Map;

public class WeChatPayTest {

    private static final String KEY = "adminllwl20191111llwladmin666666";

    @Test
    public void unifiedOrder() throws Exception {
        WeChatPay weChatPay = new WeChatPay();


        UnifiedOrder unifiedOrder = new UnifiedOrder();
        unifiedOrder.setBody("orderTest");
        unifiedOrder.setOutTradeNo("201911011726");
        unifiedOrder.setTotalFee(1);
        unifiedOrder.setSpbillCreateIp("101.64.156.106");
        unifiedOrder.setNotifyUrl("http://d5bf6ef7.ngrok.io");
        unifiedOrder.setTradeType("JSAPI");
        // unifiedOrder.setSignType();

        unifiedOrder.setAppid("wx452861bdcf531613");
        unifiedOrder.setMchId("1561031551");
        unifiedOrder.setOpenid("oc6cs5Fg7-XMANpQEnJ8b-cLTTik");

        ResultPayUnifiedOrder resultPayUnifiedOrder = weChatPay.unifiedOrder(unifiedOrder, SignType.MD5, KEY);

        Map<String, String> map = weChatPay.toPaySignDTO(resultPayUnifiedOrder, SignType.MD5, KEY);

        System.out.println(JSON.toJSONString(resultPayUnifiedOrder));
        System.out.println(JSON.toJSONString(map));

    }
}