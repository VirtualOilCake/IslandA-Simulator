package io.github.manoil.ia.handler;

import java.util.Random;

/**
 * 举高高回复器,是小公主都会举高高哦!
 *
 * @author Sod-Momas
 */
public class PrincessReply implements AcerReply {
    @Override
    public boolean hitGPoint(String thread) {
        // 单关键词列表
        final String[] repository = {
                "轮到我",
                "举高高",
        };
        for (String keyword : repository) {
            if (thread.contains(keyword)) {
                // 命中关键词则立刻返回
                return true;
            }
        }
        // 复合关键词判断
        return thread.contains("今天") && thread.contains("生日");
    }

    @Override
    public String reply() {
        // 用来回复的消息数组
        final String[] message = {
                "举高高(ノﾟ∀ﾟ)ノ",
                "举高高(ノﾟ∀ﾟ)ノ",
                "举高高(ノﾟ∀ﾟ)ノ",
                "举高高(ノﾟ∀ﾟ)ノ",
                "举高高(ノﾟ∀ﾟ)ノ",
                "举高高(ノﾟ∀ﾟ)ノ",
                "举高高(ノﾟ∀ﾟ)ノ",
                "锯睾睾(ノﾟ∀ﾟ)ノ",
                "举高高(ノﾟ∀ﾟ)ノ",
                "举高高(ノﾟ∀ﾟ)ノ",
                "举高高(ノﾟ∀ﾟ)ノ",
                "举高高(ノﾟ∀ﾟ)ノ",
                "举高高(ノﾟ∀ﾟ)ノ",
                "举高高(ノﾟ∀ﾟ)ノ",
                "举高高(ノﾟ∀ﾟ)ノ",
                "举高高(ノﾟ∀ﾟ)ノ",
                "举高高(ノﾟ∀ﾟ)ノ",
                "锯睾睾(ノﾟ∀ﾟ)ノ",
        };
        // 随机生成一个下标, 随机范围是 [0 , 数组的长度),
        // 左闭区间右开区间,所以不用担心数据越界
        final int index = new Random().nextInt(message.length);
        // 取出数组中的值返回
        return message[index];
    }
}
