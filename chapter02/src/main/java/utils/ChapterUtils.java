package utils;


import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Util methods that will be used in the examples.
 */
public class ChapterUtils {


    public static boolean isWeekend() {
        return isWeekend(LocalDate.now());
    }

    public static boolean isWeekend(LocalDate date){

        switch (date.getDayOfWeek()) {
            case SATURDAY:
                return true;
            case SUNDAY:
                return true;
            default:
                return false;
        }

    }


}
