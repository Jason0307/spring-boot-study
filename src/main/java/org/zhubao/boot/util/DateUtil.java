package org.zhubao.boot.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String convertDateToString(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

}
