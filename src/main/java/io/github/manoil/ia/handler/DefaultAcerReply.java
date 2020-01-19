package io.github.manoil.ia.handler;

import java.util.Random;

/**
 * 这是一个普通的 Acer,看见串就会回复
 * 相当暖呢
 *
 * @author Sod-Momas
 */
public class DefaultAcerReply implements AcerReply {

    /**
     * 用来回复的消息数组
     */
    private String[] message = {
            "( ﾟ∀。)",
            "( ´_ゝ`)旦",
            "(|||ﾟДﾟ)",
            "(ﾟДﾟ≡ﾟДﾟ)",
            "⊂彡☆))д`)",
            "(　^ω^)",
            "……",
            "致",
            "摩多摩多"};

    @Override
    public boolean hitGPoint(String keyword) {
        // 只要串内容不为空就进行回复
        return keyword != null && keyword.length() > 0;
    }

    @Override
    public String reply() {
        // 随机生成一个下标, 随机范围是 [0 , 数组的长度),
        // 左闭区间右开区间,所以不用担心数据越界
        final int index = new Random().nextInt(message.length);
        // 取出数组中的值返回
        return message[index];
    }
}
