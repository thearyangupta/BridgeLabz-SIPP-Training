package ResumeScreeningSystem;

import java.util.List;

public class ProductManager extends JobRole {
    @Override
    public String getJobRole() {
        return "Product Manager";
    }

    @Override
    public List<String> getRequiredSkills() {
        return List.of("Leadership", "Creativity", "Communication Skills");
    }
}
