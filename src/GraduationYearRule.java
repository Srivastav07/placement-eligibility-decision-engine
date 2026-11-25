package src;

class GraduationYearRule extends EligibilityRule {
    @Override
    public String getRuleName() {

        return "Graduation Year";
    }

    public boolean check(Candidate candidate, Job job) {
        return candidate.getGraduationYear() == job.getRequiredGraduationYear();
    }

}
