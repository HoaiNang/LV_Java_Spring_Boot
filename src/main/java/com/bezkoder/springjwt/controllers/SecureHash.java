package com.bezkoder.springjwt.controllers;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SecureHash {
public static String generateSecureHash(String merchantCode, String amount, String orderCode, String returnUrl, String secureSecret) {
        String input = merchantCode + amount + orderCode + returnUrl + secureSecret;

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(input.getBytes("UTF-8"));

            byte[] byteData = md.digest();

            // Chuyển byte thành dạng hex string
            StringBuilder sb = new StringBuilder();
            for (byte b : byteData) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException | java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
