package io.github.manoil.ia.handler;

import java.util.Random;

/**
 * Bog回复器
 *
 * @author Sod-Momas
 */
public class BogReply implements AcerReply {
    @Override
    public boolean hitGPoint(String thread) {
        // 单关键词列表
        final String[] repository = {
                "bili",
                "pili",
                "xili",
                "批站",
                "哔哩",
                "b站",
                "干杯",
                "( ゜- ゜)つロ ",
                "ビリ",
                "乾杯",
        };
        for (String keyword : repository) {
            if (thread.contains(keyword)) {
                // 命中关键词则立刻返回
                return true;
            }
        }
        // 没有命中关键词
        return false;
    }

    @Override
    public String reply() {
        final String[] message = {
                "守❤护❤最❤好❤的❤霹❤雳❤霹❤雳",
                "pxj不要上岛！",
                "bog越来越多了",
                "钓鱼不可取",
                "(　^ω^)",
                "哪里来的bog？",
        };
        // 随机生成一个下标, 随机范围是 [0 , 数组的长度),
        // 左闭区间右开区间,所以不用担心数据越界
        final int index = new Random().nextInt(message.length);
        // 取出数组中的值返回
        return message[index];
    }
}
