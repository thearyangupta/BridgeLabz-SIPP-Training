package UniversityCourseManagementSystem;

public class Course<T extends CourseType> {
    private String name;
    private String courseCode;
    private T evaluation;

    public Course(String name, String courseCode, T evaluation) {
        this.name = name;
        this.courseCode = courseCode;
        this.evaluation = evaluation;
    }

    public void displayCourseDetails() {
        System.out.println("\n---------------- Course Details ------------------");
        System.out.println("Name : " + this.name + " (" + courseCode + ")\nEvaluation : " + evaluation.getEvaluation());
        System.out.println("--------------------------------------------------\n");
    }
}
