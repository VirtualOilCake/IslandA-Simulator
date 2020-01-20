package io.github.manoil.ia.handler;

import java.util.Random;

/**
 * 致癌物回复器
 *
 * @author Sod-Momas
 */
public class CarcinogenReply implements AcerReply {
    @Override
    public boolean hitGPoint(String thread) {
        // 单关键词列表
        final String[] repository = {
                "这都是什么神仙",
                "宝藏男孩",
                "妈妈爱你",
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
