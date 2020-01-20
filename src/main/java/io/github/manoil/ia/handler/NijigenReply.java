package io.github.manoil.ia.handler;

import java.util.Random;

/**
 * 二次元回复器
 *
 * @author Sod-Momas
 */
public class NijigenReply implements AcerReply {
    @Override
    public boolean hitGPoint(String thread) {
        // 单关键词列表
        final String[] repository = {
                "二次元",
                "呐",
                "米娜桑",
                "啊诺",
                "！？",
                "动漫",
                "三次元",
                "？！",
                "(｡◕∀◕｡)",
                "☆",
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
                "守❤护❤最❤好❤的❤二❤次❤元",
                "呐呐呐呐呐",
                "呐，就硬呐",
                "小殇君不要⊂彡☆))д`)",
                "(　^ω^)给二次元的你一个微笑",
                "您就是二刺螈？",
                "二刺螈二刺螈",
                "纯度，太高了",
                "呕呕呕呕呕",
                "D区",
                "欢乐恶搞不是法外地",
                "D区",
                "致",
                "A岛核物理研究所(　д ) ﾟ ﾟ",
                "a岛×\n福岛√",
                "福岛JK不要上岛",
        };
        // 随机生成一个下标, 随机范围是 [0 , 数组的长度),
        // 左闭区间右开区间,所以不用担心数据越界
        final int index = new Random().nextInt(message.length);
        // 取出数组中的值返回
        return message[index];
    }
}
