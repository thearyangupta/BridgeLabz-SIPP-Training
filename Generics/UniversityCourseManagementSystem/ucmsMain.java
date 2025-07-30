package UniversityCourseManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class ucmsMain {
    public static void main(String[] args) {
        Course<ExamBased> c1 = new Course<>("B. Tech","BT101",new ExamBased());
        Course<ResearchBased> mathCourse = new Course<>("Maths","Math202",new ResearchBased());

        List<Course<? extends CourseType>> allCourses = new ArrayList<>();
        allCourses.add(mathCourse);
        allCourses.add(c1);

        // Use the wildcard method to print details for all of them
        UniversitySystem.printDetails(allCourses);
    }
}
