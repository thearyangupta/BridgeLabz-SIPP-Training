package ResumeScreeningSystem;

import java.util.List;

public class DataScientist extends JobRole {

    @Override
    public String getJobRole() {
        return "Data Scientist";
    }

    @Override
    public List<String> getRequiredSkills() {
        return List.of("PYTHON", "ML", "Statistics");
    }
}
