package UniversityCourseManagementSystem;

import java.util.List;

public class UniversitySystem {
    public static void printDetails(List<Course<? extends CourseType>> courses) {
        for (Course<? extends CourseType> c : courses) {
            c.displayCourseDetails();
            System.out.println();
        }
    }
}
