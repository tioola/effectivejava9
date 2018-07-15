package item01;

/**
 * Weekend guards will be returned only on the weekends.
 */
public class WeekendGuard extends Guard {

    @Override
    public String getGuardInfo() {
        return "I'm the weekend guard, I only work during the weekends!";
    }

    /**
     * Weekend guard has fewer chances to solve the issue.
     * @return is the issue solved.
     */
    @Override
    public boolean solveIssue() {
        return Math.random() < 0.3;
    }
}
