package ResumeScreeningSystem;

import java.util.List;

public class SoftwareEngineer extends JobRole {

    @Override
    public String getJobRole() { return "Software Engineer"; }

    @Override
    public List<String> getRequiredSkills() {
        return List.of("JAVA", "DSA", "OOPS", "SPRING BOOT");
    }
}
