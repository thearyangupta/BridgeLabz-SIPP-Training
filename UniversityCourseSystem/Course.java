import java.util.List;

public class Course<T extends CourseType> {
    private List<T> courses;

    public Course(List<T> courses) {
        this.courses = courses;
    }

    public void printCourses(List<? extends CourseType> list) {
        for (CourseType ct : list) {
            System.out.println(ct.getTitle());
        }
    }
}