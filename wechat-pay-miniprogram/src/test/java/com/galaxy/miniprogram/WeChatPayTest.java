package com.galaxy.miniprogram;

import com.alibaba.fastjson.JSON;
import com.galaxy.miniprogram.bean.BaseEntity;
import com.galaxy.miniprogram.bean.unifiedorder.PaySignDTO;
import com.galaxy.miniprogram.bean.orderquery.OrderQuery;
import com.galaxy.miniprogram.bean.unifiedorder.UnifiedOrder;
import com.galaxy.miniprogram.bean.orderquery.ResultOrderQuery;
import com.galaxy.miniprogram.bean.unifiedorder.ResultUnifiedOrder;
import com.galaxy.miniprogram.service.WeChatPayService;
import com.galaxy.miniprogram.service.impl.WeChatPayServiceImpl;
import com.galaxy.miniprogram.util.SignType;
import org.junit.Test;

public class WeChatPayTest {

    private static final String KEY = "adminllwl20191111llwladmin666666";

    public void set(BaseEntity entity) {
        entity.setAppid("wx452861bdcf531613");
        entity.setMchId("1561031551");
    }

    @Test
    public void unifiedOrder() throws Exception {
        WeChatPayService weChatPay = new WeChatPayServiceImpl();


        UnifiedOrder unifiedOrder = new UnifiedOrder();
        unifiedOrder.setBody("orderTest");
        unifiedOrder.setOutTradeNo("20191103113619");
        unifiedOrder.setTotalFee(1);
        unifiedOrder.setSpbillCreateIp("101.64.156.106");
        unifiedOrder.setNotifyUrl("http://d5bf6ef7.ngrok.io");
        unifiedOrder.setTradeType("JSAPI");
        // unifiedOrder.setSignType();

        unifiedOrder.setAppid("wx452861bdcf531613");
        unifiedOrder.setMchId("1561031551");
        unifiedOrder.setOpenid("oc6cs5Fg7-XMANpQEnJ8b-cLTTik");

        ResultUnifiedOrder resultUnifiedOrder = weChatPay.unifiedOrder(unifiedOrder, SignType.MD5, KEY);

        PaySignDTO paySignDTO = weChatPay.toPaySignDTO(resultUnifiedOrder, SignType.MD5, KEY);

        System.out.println(JSON.toJSONString(resultUnifiedOrder));
        System.out.println(JSON.toJSONString(paySignDTO));

    }

    @Test
    public void orderQuery() throws Exception {
        WeChatPayService weChatPay = new WeChatPayServiceImpl();
        OrderQuery orderQuery = new OrderQuery();
        set(orderQuery);
        orderQuery.setOutTradeNo("20191103113619");
        ResultOrderQuery resultOrderQuery = weChatPay.orderQuery(orderQuery, SignType.MD5, KEY);
        System.out.println(JSON.toJSONString(resultOrderQuery));

    }
}