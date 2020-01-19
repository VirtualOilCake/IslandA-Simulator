package com.github.manoil.ia.handler;

/**
 * 此接口表示一个正在网上冲浪的 Acer,
 * 他正考虑要不要回复一个串
 *
 * @author Sod-Momas
 */
public interface AcerReply {
    /**
     * 是否命中 acer 的 G 点,
     * 命中 G 点则会触发回复,
     * 没有命中 G 点则不触发回复
     *
     * @param keyword 串关键字,可以输入整个串
     * @return 如果命中, 则返回true, 没有命中则返回false
     */
    boolean hitGPoint(String keyword);

    /**
     * 回复一个串
     *
     * @return 回复内容
     */
    String reply();
}
