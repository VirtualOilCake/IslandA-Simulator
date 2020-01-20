package io.github.manoil.ia.handler;

import java.util.Random;

/**
 * 日语回复器
 *
 * @author Sod-Momas
 */
public class JapaneseReply implements AcerReply {
    @Override
    public boolean hitGPoint(String thread) {
        // 单关键词列表
        final String[] repository = {
                "は",
                "を",
                "へ",
                "の",
                "な",
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
                "君日本语本当上手",
                "真就日语岛呗",
                "上手、上手",
                "a岛人均N1",
        };
        // 随机生成一个下标, 随机范围是 [0 , 数组的长度),
        // 左闭区间右开区间,所以不用担心数据越界
        final int index = new Random().nextInt(message.length);
        // 取出数组中的值返回
        return message[index];
    }
}
