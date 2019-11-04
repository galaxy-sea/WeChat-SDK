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

    private static final String KEY = "adminllwl20191111llwladmin666666";

    public void set(BaseEntity entity) {
        entity.setAppid("wx452861bdcf531613");
        entity.setMchId("1561031551");
    }

    @Test
    public void unifiedOrder() throws Exception {
        UnifiedOrder unifiedOrder = new UnifiedOrder();
        unifiedOrder.setBody("orderTest");
        unifiedOrder.setOutTradeNo("201911041349");
        unifiedOrder.setTotalFee(1);
        unifiedOrder.setSpbillCreateIp("101.64.156.106");
        unifiedOrder.setTradeType("JSAPI");
        // unifiedOrder.setSignType();
        unifiedOrder.setAppid("wx452861bdcf531613");
        unifiedOrder.setMchId("1561031551");
        unifiedOrder.setOpenid("oc6cs5Fg7-XMANpQEnJ8b-cLTTik");

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