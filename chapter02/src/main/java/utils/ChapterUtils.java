package utils;


import item01.Guard;

import java.time.LocalDate;

/**
 * Util methods that will be used in the examples.
 */
public class ChapterUtils {


    public static boolean isWeekend() {
        final Guard instance = Guard.getInstance(true);

        return ChapterUtils.isWeekend(LocalDate.now());

    }

    public static boolean isWeekend(final LocalDate date){

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
