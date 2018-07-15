package item01;


import java.time.LocalDate;

import static java.util.Objects.isNull;
import static utils.ChapterUtils.isWeekend;

public abstract class Guard {

    private static Guard supervisor;

    //Make the constructor protected so we can extend this class
    protected Guard() {
    }

    public abstract String getGuardInfo();

    public abstract boolean solveIssue();

    /**
     * get instance based on the urgency and the day.
     * If the emergency boolean is true it returns the supervisor singleton.
     * instance.
     *
     * @param emergency
     * @return
     *
     */
    public static Guard getInstance(final boolean emergency) {
        if (emergency) {
            //We do a lazy initalization of the Supervisor ,in our example it is an expensive object.
            if(isNull(Guard.supervisor)){
                Guard.supervisor = new SupervisorGuard();
            }
            return Guard.supervisor;
        }
        if (isWeekend()) {
            return new WeekendGuard();
        }
        return new RegularGuard();
    }

    public static Guard forDay(final LocalDate dayOfWork) {
        if (isWeekend(dayOfWork)) {
            return new WeekendGuard();
        }
        return new RegularGuard();
    }


}
