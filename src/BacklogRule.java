package src;

class BacklogRule extends EligibilityRule {

    @Override
    public String getRuleName() {
        return "Backlogs";
    }

    public boolean check(Candidate candidate, Job job) {
        return candidate.getBacklogs() <= job.getMaximumBacklogs();
    }

}
