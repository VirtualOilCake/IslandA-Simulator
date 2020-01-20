package io.github.manoil.ia;

import io.github.manoil.ia.handler.*;
import io.github.manoil.ia.util.CookieUtil;

import java.util.*;

/**
 * 启动类
 *
 * @author manoil
 * @author Sod-Momas
 */
public class Main {

    // 自动生成回复的次数
    private static int times = 3;
    // 是否显示回复的饼干
    private static boolean responseCookie = true;

    /**
     * 启动类
     *
     * @param args 启动参数
     */
    public static void main(String[] args) {
        // 上岛
        final Main islandA = new Main();
        // 发表新串
        final String thread = islandA.getInput();
//        final String thread = "先辈!今天我生日!我可以上Loli!";
        // 众 acer 看到了新串
        final List<AcerReply> acers = islandA.connectAcers();
        // 众 acer 回复了串
        final List<String> replyList = islandA.fetchReply(thread, acers, times);
        // 显示 acer 们回复的内容
        islandA.printReply(replyList);
    }

    /**
     * 获取新串,获取用户输入的内容
     *
     * @return acer 发表的新串
     */
    private String getInput() {
        System.out.println("请输入您要发表的内容:\n");
        // 使用 try-whit-resource 自动关闭 scanner,防止内存泄漏
        try (final Scanner scanner = new Scanner(System.in)) {
            return scanner.nextLine();
        }
    }

    /**
     * 打印回复列表
     *
     * @param replyList acer 们的回复
     */
    private void printReply(List<String> replyList) {
        // 回复模板, 回复的内容会根据这个模板生成
        final String template = "%s ---------------------\n%s%n";
        for (String reply : replyList) {
            System.out.printf(template, CookieUtil.generateCookie(), reply);
        }
    }

    /**
     * 获取回复
     *
     * @param thread        一个串的内容
     * @param acerReplyList 看到串的 acer 们
     * @param limit         获取的回复数量,相当于一页多少条数据
     * @return acer 们的回复
     */
    private List<String> fetchReply(String thread, List<AcerReply> acerReplyList, int limit) {
        List<String> replyList = new ArrayList<>();
        // 所有的 acer 都会看到串
        for (AcerReply acer : acerReplyList) {
            // 该 acer 是否想回复
            final boolean hit = acer.hitGPoint(thread);
            if (hit) {
                // 是的他准备回复了
                replyList.add(acer.reply());
            }
        }
        // 打乱顺序
        Collections.shuffle(replyList);
        // 回复的长度,如果回复的数量没有要求的多,则按两者之间少的来,防止数组越界
        final int length = Math.min(replyList.size(), limit + 1);
        // 按照给定长度截取指定数据的回复
        return replyList.subList(0, length);
    }

    /**
     * 连接Acer们
     *
     * @return 被连接的一群Acer
     */
    private List<AcerReply> connectAcers() {
        return Arrays.asList(
                // 重复添加表示这个类型的 Acer 有多个
                new DefaultAcerReply(),
                new DefaultAcerReply(),
                new AtmReply(),
                new BogReply(),
                new CarcinogenReply(),
                new ChildrenReply(),
                new GirlfriendReply(),
                new HahahaReply(),
                new InmReply(),
                new JapaneseReply(),
                new NijigenReply(),
                new PrincessReply(),
                new SexHobbyReply(),
                new UnoriginalReply()
        );
    }
}
