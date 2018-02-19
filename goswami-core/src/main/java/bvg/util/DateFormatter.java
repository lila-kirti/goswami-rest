package bvg.util;

import org.apache.commons.lang3.time.FastDateFormat;

import java.text.ParseException;
import java.util.Date;

/**
 * @author lgalimova
 * @since 04.12.2017
 */
public class DateFormatter {

    public static String formatDate(Date date) {
        FastDateFormat format = FastDateFormat.getInstance("dd.MM.yyyy");
        return format.format(date);
    }

    public static String formatDateTime(Date date) {
        FastDateFormat format = FastDateFormat.getInstance("dd.MM.yyyy HH:mm:ss");
        return format.format(date);
    }

    public static Date parseDateTime(String date) throws ParseException {
        FastDateFormat format = FastDateFormat.getInstance("dd.MM.yyyy HH:mm:ss");
        return format.parse(date);
    }
}
