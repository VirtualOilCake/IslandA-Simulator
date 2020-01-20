package io.github.manoil.ia.util;

import java.util.Random;

public abstract class CookieUtil {
    /**
     * 饼干生成器
     *
     * @return 一个饼干
     */
    public static String generateCookie() {
        final int cookieLength = 7;//饼干长度
        //饼干所包含的内容
        final char[] cookieForm = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
        // 随机数生成器
        final Random random = new Random();
        // 饼干拼接器
        final StringBuilder sb = new StringBuilder(cookieLength);
        for (int i = 0; i < cookieLength; i++) {
            // 算出随机下标
            int index = random.nextInt(cookieLength);
            // 取出串里的符号
            sb.append(cookieForm[index]);
        }
        // 把拼接的数字字母拼接成饼干
        return sb.toString();
    }
}
