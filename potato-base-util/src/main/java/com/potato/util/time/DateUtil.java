package com.potato.util.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 时间工具类
 *
 * @author lizhifu
 * @date 2021/5/19
 */
public class DateUtil {
    /**
     * 日期偏移(单位秒)
     *
     * @param date      日期
     * @param offset    偏移量，正数为向后偏移，负数为向前偏移
     * @return 偏移后的日期
     */
    public static Date offsetSeconds(Date date,int offset) {
        Calendar cd = new GregorianCalendar();
        cd.setTime(date);
        cd.add(GregorianCalendar.SECOND, offset);
        return cd.getTime();
    }
}
