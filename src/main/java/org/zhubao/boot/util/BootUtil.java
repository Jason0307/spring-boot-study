package org.zhubao.boot.util;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

public class BootUtil {

    private static Md5PasswordEncoder md5 = new Md5PasswordEncoder();

    public static String md5Encode(String username, String password) {

        String encodePassword = md5.encodePassword(username.trim(), password.trim());
        return encodePassword;
    }

    public static boolean isPasswordValid(String username, String password, String encodePassword) {
        
        boolean result = md5.isPasswordValid(encodePassword, username.trim(), password.trim());
        return result;
    }
}
