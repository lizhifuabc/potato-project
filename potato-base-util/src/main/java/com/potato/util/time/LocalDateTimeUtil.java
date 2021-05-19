package com.potato.util.time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 * 时间工具类
 *
 * @author lizhifu
 * @date 2021/5/19
 */
public class LocalDateTimeUtil {
    /**
     * 日期偏移（偏移会修改传入的对象）
     *
     * @param time   {@link LocalDateTime}
     * @param number 偏移量，正数为向后偏移，负数为向前偏移
     * @param field  偏移单位，见{@link ChronoUnit}，不能为null
     * @return 偏移后的日期时间
     */
    public static LocalDateTime offset(LocalDateTime time, long number, TemporalUnit field) {
        return time.plus(number, field);
    }
    /**
     * 日期偏移(单位毫秒)
     *
     * @param time   {@link LocalDateTime}
     * @param number 偏移量，正数为向后偏移，负数为向前偏移
     * @return 偏移后的日期时间
     */
    public static LocalDateTime offsetMillis(LocalDateTime time, long number) {
        return time.plus(number, ChronoUnit.MILLIS);
    }
    /**
     * 日期偏移(单位秒)
     *
     * @param time   {@link LocalDateTime}
     * @param number 偏移量，正数为向后偏移，负数为向前偏移
     * @return 偏移后的日期时间
     */
    public static LocalDateTime offsetSeconds(LocalDateTime time, long number) {
        return time.plus(number, ChronoUnit.SECONDS);
    }
}
