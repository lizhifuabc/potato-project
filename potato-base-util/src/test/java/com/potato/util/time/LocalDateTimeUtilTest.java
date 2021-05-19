package com.potato.util.time;

import org.junit.Test;

import java.time.LocalDateTime;

/**
 * LocalDateTimeUtil测试
 *
 * @author lizhifu
 * @date 2021/5/19
 */
public class LocalDateTimeUtilTest {
    @Test
    public void offsetSeconds(){
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTimeUtil.offsetSeconds(LocalDateTime.now(),60));
        System.out.println(LocalDateTimeUtil.offsetSeconds(LocalDateTime.now(),-60));
    }
}
