package io.github.manoil.ia.handler;

import org.junit.Test;

public class AcerReplyTests {

    /**
     * 测试一千次默认 acer 回复效果
     */
    @Test
    public void defaultAcerReply() {
        final String thread = "哈哈,这是一条默认串";
        for (int i = 0; i < 1000; i++) {
            final DefaultAcerReply acer = new DefaultAcerReply();
            if (acer.hitGPoint(thread)) {
                final String message = acer.reply();
                System.out.println(message);
            }
        }
    }
}
