package com.potato.util.time;

import org.junit.Test;

import java.util.Date;

/**
 * DateUtil 测试
 *
 * @author lizhifu
 * @date 2021/5/19
 */
public class DateUtilTest {
    @Test
    public void test(){
        Date date = new Date();
        System.out.println(date);
        System.out.println(DateUtil.offsetSeconds(date,60));
    }
}
