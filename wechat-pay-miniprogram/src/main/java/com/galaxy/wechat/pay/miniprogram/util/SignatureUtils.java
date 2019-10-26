package com.galaxy.wechat.pay.miniprogram.util;

import com.galaxy.wechat.pay.miniprogram.bean.AbstractBean;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class SignatureUtils {


    private static final char[] SYMBOLS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    private static final Random RANDOM = new SecureRandom();


    /**
     * 生成Sign， abstractBean中的sign在包含生成当中, 请手动复制为null
     */
    public static String generateSignature(AbstractBean abstractBean, String key) throws Exception {

        Map<String, String> map = new TreeMap<String, String>();

        List<Field> allField = ReflectUtils.getAllField(abstractBean.getClass());
        for (Field field : allField) {
            XmlValue annotation = field.getDeclaredAnnotation(XmlValue.class);
            if (annotation == null) {
                continue;
            }
            field.setAccessible(true);
            String name = annotation.name();
            Object value = field.get(abstractBean);
            field.setAccessible(false);
            if (value == null) {
                continue;
            }
            map.put(name, String.valueOf(value));
        }

        StringBuffer sb = new StringBuffer();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey()).append("=").append("&");
        }
        sb.append("key=").append(key);

        if (WXPayConstants.SignType.MD5.equals(abstractBean.getSignType())) {
            return MD5(sb.toString()).toUpperCase();
        } else if (WXPayConstants.SignType.HMAC_SHA256.equals(abstractBean.getSignType())) {
            return HMACSHA256(sb.toString(), key);
        } else {
            throw new Exception(String.format("Invalid sign_type: %s", abstractBean.getSignType()));
        }
    }


    /**
     * 获取随机字符串 Nonce Str
     *
     * @return String 随机字符串
     */
    public static String generateNonceStr() {
        char[] nonceChars = new char[32];
        for (int index = 0; index < nonceChars.length; ++index) {
            nonceChars[index] = SYMBOLS[RANDOM.nextInt(SYMBOLS.length)];
        }
        return new String(nonceChars);
    }

    /**
     * 生成 MD5
     *
     * @param data 待处理数据
     * @return MD5结果
     */
    public static String MD5(String data) throws Exception {
        java.security.MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] array = md.digest(data.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (byte item : array) {
            sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
        }
        return sb.toString().toUpperCase();
    }

    /**
     * 生成 HMACSHA256
     *
     * @param data 待处理数据
     * @param key  密钥
     * @return 加密结果
     * @throws Exception
     */
    public static String HMACSHA256(String data, String key) throws Exception {
        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
        sha256_HMAC.init(secret_key);
        byte[] array = sha256_HMAC.doFinal(data.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (byte item : array) {
            sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
        }
        return sb.toString().toUpperCase();
    }


}
