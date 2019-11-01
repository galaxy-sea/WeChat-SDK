package com.galaxy.miniprogram;

import com.galaxy.miniprogram.bean.request.UnifiedOrder;
import com.galaxy.miniprogram.bean.response.ResultPayUnifiedOrder;
import org.junit.Test;

public class WeChatPayTest {

    private static final String key = "adminllwl20191111llwladmin666666";

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

        ResultPayUnifiedOrder resultPayUnifiedOrder = weChatPay.unifiedOrder(unifiedOrder, key);

        System.out.println(resultPayUnifiedOrder);

    }
}