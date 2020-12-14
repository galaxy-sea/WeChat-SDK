package com.galaxy.miniprogram.util;

import com.galaxy.miniprogram.bean.BaseEntity;
import org.apache.commons.beanutils.BeanUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class SignatureUtils {


    /**
     * 判断签名是否正确，必须包含sign字段，否则返回false。
     */
    public static boolean isSignatureValid(final BaseEntity baseEntity, String key) throws Exception {
        if (baseEntity.getSign() != null) {
            return false;
        }
        String sign = baseEntity.getSign();
        return generateSignature(baseEntity, baseEntity.getSignType(), key).equals(sign);
    }
    

    /**
     * 生成Sign，
     */
    public static String generateSignature(final BaseEntity baseEntity, String signType, final String key) throws Exception {
        String sign = baseEntity.getSign();
        baseEntity.setSign(null);
        baseEntity.setSignType(signType);
        // Map<String, String> map = XmlSerializableUtils.toMap(baseEntity);
        TreeMap<String, Object> map = new TreeMap<>();
        BeanUtils.populate(baseEntity, map);
        baseEntity.setSign(sign);
        return generateSignature(map, signType, key);
    }

    private static String generateSignature(Map<String, Object> map, String signType, final String key) throws Exception {
        final StringBuffer sb = new StringBuffer();
        for (final Map.Entry<String, Object> entry : map.entrySet()) {
            sb.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
        }
        sb.append("key=").append(key);

        if (SignType.MD5.getType().equals(signType)) {
            return md5(sb.toString()).toUpperCase();
        } else if (SignType.HMAC_SHA256.getType().equals(signType)) {
            return hmacsha256(sb.toString(), key);
        } else {
            throw new Exception(String.format("Invalid signType: %s", signType));
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
