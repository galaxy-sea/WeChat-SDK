package com.galaxy.miniprogram.controller;

import com.galaxy.miniprogram.service.WeChatPayCallbackService;
import com.galaxy.miniprogram.service.WeChatPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author galaxy
 */
@RestController
@RequestMapping("${WeChat.pay.callback.middle}")
public class WeChatPayCallbackController {

    @Autowired
    private WeChatPayService weChatPayService;

    @Autowired
    private WeChatPayCallbackService weChatPayCallbackService;

    @PostMapping("${WeChat.pay.callback.unifiedorder}")
    public String unifiedOrderCallback(@RequestBody String requestBody) throws Exception {
        weChatPayCallbackService.unifiedOrderCallback(requestBody, "key");
        System.out.println(requestBody);
        return "hello";
    }

    @PostMapping("${WeChat.pay.callback.refund}")
    public String refundCallback() {
        return "hello";
    }


}
