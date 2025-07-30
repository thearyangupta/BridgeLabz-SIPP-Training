package ResumeScreeningSystem;

import java.util.ArrayList;
import java.util.List;

public class ScreeningMain {
    public static void main(String[] args) {
        ScreeningSystem system = new ScreeningSystem();

        Resume<SoftwareEngineer> seResume = new Resume<>(
                "A",
                List.of("Java", "Spring Boot", "SQL", "DSA"),
                new SoftwareEngineer()
        );

        Resume<DataScientist> dsResume = new Resume<>(
                "B",
                List.of("Python", "ML", "TensorFlow", "Statistics"),
                new DataScientist()
        );

        Resume<SoftwareEngineer> seResume2 = new Resume<>(
                "C",
                List.of("Java", "Python"),
                new SoftwareEngineer()
        );

        List<Resume<? extends JobRole>> resumeBatch = new ArrayList<>();
        resumeBatch.add(seResume);
        resumeBatch.add(dsResume);
        resumeBatch.add(seResume2);

        system.screenBatch(resumeBatch);
    }
}