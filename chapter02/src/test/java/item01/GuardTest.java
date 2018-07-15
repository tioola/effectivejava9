package item01;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

import static org.assertj.core.api.Assertions.assertThat;

public class GuardTest {

    @Test
    public void testWhenUrgentGetSupervisor() {

        final Guard supervisor = Guard.getInstance(Boolean.TRUE);

        assertThat(supervisor).isInstanceOf(SupervisorGuard.class);
    }

    @Test
    public void testWhenWeekendGetWeekendGuard() {

        final LocalDate nextSaturday = LocalDate.now()
                .with(TemporalAdjusters.next(DayOfWeek.SATURDAY));


        final Guard weekendGuard = Guard.forDay(nextSaturday);

        assertThat(weekendGuard).isInstanceOf(WeekendGuard.class);
    }

    @Test
    public void testWhenWeekdayGetRegularGuard(){

        final LocalDate monday = LocalDate.now()
                .with(TemporalAdjusters.next(DayOfWeek.MONDAY));

        final Guard regularGuard = Guard.forDay(monday);

        assertThat(regularGuard).isInstanceOf(RegularGuard.class);
    }


}