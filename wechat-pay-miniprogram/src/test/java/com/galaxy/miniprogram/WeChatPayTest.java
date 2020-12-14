package com.galaxy.miniprogram;

import com.alibaba.fastjson.JSON;
import com.galaxy.miniprogram.bean.BaseEntity;
import com.galaxy.miniprogram.bean.orderquery.OrderQuery;
import com.galaxy.miniprogram.bean.orderquery.ResultOrderQuery;
import com.galaxy.miniprogram.bean.unifiedorder.PaySignDTO;
import com.galaxy.miniprogram.bean.unifiedorder.ResultUnifiedOrder;
import com.galaxy.miniprogram.bean.unifiedorder.UnifiedOrder;
import com.galaxy.miniprogram.service.WeChatPayService;
import com.galaxy.miniprogram.service.impl.WeChatPayServiceImpl;
import com.galaxy.miniprogram.util.SignType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WechatPayMiniprogramApplication.class)
public class WeChatPayTest {

    @Autowired
    private WeChatPayService weChatPayService;

    private static final String KEY = "Dae437243546747sdf23s234234ewrfa";

    public void set(BaseEntity entity) {
        entity.setAppid("wx2e9cefc3e1f292e6");
        entity.setMchId("1305713801");
    }

    @Test
    public void unifiedOrder() throws Exception {
        UnifiedOrder unifiedOrder = new UnifiedOrder();
        unifiedOrder.setBody("orderTest");
        unifiedOrder.setOutTradeNo(String.valueOf(System.currentTimeMillis()));
        unifiedOrder.setTotalFee(1);
        unifiedOrder.setSpbillCreateIp("101.64.156.106");
        unifiedOrder.setTradeType("JSAPI");
        // unifiedOrder.setSignType();
        unifiedOrder.setAppid("wx2e9cefc3e1f292e6");
        unifiedOrder.setMchId("1305713801");
        unifiedOrder.setOpenid("oqKS-4iWf-y-CL0sGuPItozc7BWM");

        ResultUnifiedOrder resultUnifiedOrder = weChatPayService.unifiedOrder(unifiedOrder, SignType.MD5, KEY);

        PaySignDTO paySignDTO = weChatPayService.toPaySignDTO(resultUnifiedOrder, SignType.MD5, KEY);

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

    @Test
    public void hello() {
        System.out.println("hello");
    }
}