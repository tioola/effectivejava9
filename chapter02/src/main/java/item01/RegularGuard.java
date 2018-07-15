package item01;

class RegularGuard extends Guard {

     protected RegularGuard(){}

    @Override
    public String getGuardInfo() {
        return "I'm the regular guard what do you need?";
    }

    /**
     * Regular guard has medium chances to solve the issue.
     * @return if the issue is solved or not.
     */
    @Override
    public boolean solveIssue() {
        synchronized (this){
            return Math.random() < 0.5;
        }
    }

}
