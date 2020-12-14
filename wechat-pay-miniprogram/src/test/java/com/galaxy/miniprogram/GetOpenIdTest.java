package com.galaxy.miniprogram;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @author changjinwei
 * @date 2020/9/3
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WechatPayMiniprogramApplication.class)
public class GetOpenIdTest {

    @Test
    public void getOpenidTest() {
        String url = "https://api.weixin.qq.com/sns/jscode2session?" +
                "appid=wx2e9cefc3e1f292e6" +
                "&secret=a2885b05b7f81d7326c42883ba0eb6f0" +
                "&js_code=063laZZv35l5TU2p562w3U9Hff1laZZB" +
                "&grant_type=authorization_code";
        String jscode2session = new RestTemplate().getForObject(url, String.class);
        System.out.println(jscode2session);
    }

}
