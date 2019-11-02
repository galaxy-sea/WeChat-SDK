package com.galaxy.miniprogram.util;

/**
 * 常量
 */
public enum SignType {

    /**
     * md5
     */
    MD5("MD5"),

    /**
     * HMAC-SHA256
     */
    HMAC_SHA256("HMAC-SHA256");

    private String type;

    SignType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

