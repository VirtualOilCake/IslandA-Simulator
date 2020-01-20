package io.github.manoil.ia.handler;

import java.util.Random;

/**
 * inm梗回复器
 *
 * @author Sod-Momas
 */
public class InmReply implements AcerReply {
    @Override
    public boolean hitGPoint(String thread) {
        // 单关键词列表
        final String[] repository = {
                "先辈",
                "野兽前辈",
                "  ",
                "あああああ",
                "目力",
                "homo",
                "Homo",
                "木毛",
                "田所",
                "ホモ",
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
        // 用来回复的消息数组
        final String[] message = {
                "淫梦小鬼不要上岛！",
                "你是一个一个一个",
                "唐突恶臭不要",
        };
        // 随机生成一个下标, 随机范围是 [0 , 数组的长度),
        // 左闭区间右开区间,所以不用担心数据越界
        final int index = new Random().nextInt(message.length);
        // 取出数组中的值返回
        return message[index];

    }
}
