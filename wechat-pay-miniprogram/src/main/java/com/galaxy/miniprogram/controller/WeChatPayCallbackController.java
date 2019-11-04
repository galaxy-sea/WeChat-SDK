package com.galaxy.miniprogram.controller;

import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping
    public String hello() {
        return "hello";
    }

    @PostMapping("${WeChat.pay.callback.unifiedorder}")
    public String unifiedOrderCallback(@RequestBody String requestBody) {
        System.out.println(requestBody);
        return "hello";
    }

    @PostMapping("${WeChat.pay.callback.refund}")
    public String refundCallback() {
        return "hello";
    }


}
