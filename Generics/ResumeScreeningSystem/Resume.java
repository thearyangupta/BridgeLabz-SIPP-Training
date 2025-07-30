package ResumeScreeningSystem;

import java.util.List;

public class Resume<T extends JobRole> {
    private String candidateName;
    private List<String> candidateSkills;
    private T targetRole;

    public Resume(String candidateName, List<String> candidateSkills, T targetRole) {
        this.candidateName = candidateName;
        this.candidateSkills = candidateSkills;
        this.targetRole = targetRole;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public List<String> getCandidateSkills() {
        return candidateSkills;
    }

    public T getTargetRole() {
        return targetRole;
    }
}
