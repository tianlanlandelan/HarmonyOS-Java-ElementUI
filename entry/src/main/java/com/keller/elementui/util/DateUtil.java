package com.keller.elementui.util;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

public class DateUtil {

    /**
     *
     * @param dateStr 2020-10-21
     * @return
     */
    public static Date getDate(String dateStr){
        LocalDate localDate = LocalDate.parse(dateStr);
        return Date.from(localDate.atStartOfDay().toInstant(ZoneOffset.of("+8")));
    }
}
