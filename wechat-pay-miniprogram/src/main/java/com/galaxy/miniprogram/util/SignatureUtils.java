package com.galaxy.miniprogram.util;

import com.galaxy.miniprogram.bean.BaseEntity;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Map;
import java.util.Random;

public class SignatureUtils {


    /**
     * 生成Sign， abstractBean中的sign在包含生成当中, 请手动复制为null
     */
    public static String generateSignature(final BaseEntity baseEntity, final String key) throws Exception {
        if (baseEntity.getSignType() == null) {
            baseEntity.setSignType(WXPayConstants.SignType.MD5.getType());
        }

        final Map<String, String> map = XmlSerializableUtils.toMap(baseEntity);

        final StringBuffer sb = new StringBuffer();
        for (final Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
        }
        sb.append("key=").append(key);

        if (WXPayConstants.SignType.MD5.getType().equals(baseEntity.getSignType())) {
            return md5(sb.toString()).toUpperCase();
        } else if (WXPayConstants.SignType.MD5.getType().equals(baseEntity.getSignType())) {
            return hmacsha256(sb.toString(), key);
        } else {
            throw new Exception(String.format("Invalid sign_type: %s", baseEntity.getSignType()));
        }
    }


    private static final char[] SYMBOLS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    private static final Random RANDOM = new SecureRandom();

    /**
     * 获取随机字符串 Nonce Str
     *
     * @return String 随机字符串
     */
    public static String generateNonceStr() {
        final char[] nonceChars = new char[32];
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
    private static String md5(final String data) throws Exception {
        final java.security.MessageDigest md = MessageDigest.getInstance("MD5");
        final byte[] array = md.digest(data.getBytes("UTF-8"));
        final StringBuilder sb = new StringBuilder();
        for (final byte item : array) {
            sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
        }
        return sb.toString();
    }

    /**
     * 生成 HMACSHA256
     *
     * @param data 待处理数据
     * @param key  密钥
     * @return 加密结果
     * @throws Exception
     */
    private static String hmacsha256(final String data, final String key) throws Exception {
        final Mac sha256Hmac = Mac.getInstance("HmacSHA256");
        final SecretKeySpec secretKey = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
        sha256Hmac.init(secretKey);
        final byte[] array = sha256Hmac.doFinal(data.getBytes("UTF-8"));
        final StringBuilder sb = new StringBuilder();
        for (final byte item : array) {
            sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
        }
        return sb.toString().toUpperCase();
    }
}
