package item01;

/**
 * Supervisor guard is more expensive compared to the others so there will be only one way of getting it.
 */
class SupervisorGuard extends Guard {

    protected SupervisorGuard(){}

    @Override
    public String getGuardInfo() {
        return "I'm the supervisor what do you need?";
    }

    /**
     * Supervisor has more chances to solve the issue but the same supervisor may be requested by multiple threads.
     * @return if the issue is solved or not.
     */
    @Override
    public boolean solveIssue() {
        synchronized (this){
            //Expensive operation.....
            return Math.random() < 0.8;
        }
    }

}
