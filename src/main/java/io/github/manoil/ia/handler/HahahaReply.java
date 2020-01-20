package io.github.manoil.ia.handler;

import java.util.Random;

/**
 * 哈哈哈回复器
 *
 * @author Sod-Momas
 */
public class HahahaReply implements AcerReply {
    @Override
    public boolean hitGPoint(String thread) {
        // 单关键词列表
        final String[] repository = {
                "今天我",
                "σ",
                "来蛤我",
                "( ´_ゝ`)",
                "( ・_ゝ・)",
                "我竟然",
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
                "哈哈哈哈哈哈哈哈哈",
                "蛤蛤蛤蛤蛤蛤蛤",
                "σ`∀´)UCCU",
                " ﾟ∀ﾟ)σ哈哈哈哈哈哈",
                "po好蠢啊( ﾟ∀ﾟ)σ",
        };
        // 随机生成一个下标, 随机范围是 [0 , 数组的长度),
        // 左闭区间右开区间,所以不用担心数据越界
        final int index = new Random().nextInt(message.length);
        // 取出数组中的值返回
        return message[index];
    }
}
