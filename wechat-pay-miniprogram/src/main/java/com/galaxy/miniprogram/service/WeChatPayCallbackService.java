package com.galaxy.miniprogram.service;

/**
 * @author galaxy
 */
public interface WeChatPayCallbackService {

    void unifiedOrderCallback(String requestBody, String key) throws Exception;

    void refundCallback(String requestBody, String key);
}
