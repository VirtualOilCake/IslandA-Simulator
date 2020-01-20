package io.github.manoil.ia.handler;

import java.util.Random;

/**
 * 性癖回复器
 *
 * @author Sod-Momas
 */
public class SexHobbyReply implements AcerReply {
    @Override
    public boolean hitGPoint(String thread) {
        // 单关键词列表
        final String[] repository = {
                "喜欢",
                "我可以",
                "suki",
                "xp",
                "Xp",
                "XP",
                "hso",
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
                "兄啊，你的xp真的好鸡掰怪啊！",
                "？？？？？",
                "人不能，至少不应该",
                "说实话，我可以",
                "？？？？？？",
                "(　д ) ﾟ ﾟ",
        };
        // 随机生成一个下标, 随机范围是 [0 , 数组的长度),
        // 左闭区间右开区间,所以不用担心数据越界
        final int index = new Random().nextInt(message.length);
        // 取出数组中的值返回
        return message[index];

    }
}
