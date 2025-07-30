package UniversityCourseManagementSystem;

public class ExamBased extends CourseType{
    @Override
    public String getEvaluation() {
        return "Final Exam - 70% + Mid-Term Exam - 30%";
    }
}
