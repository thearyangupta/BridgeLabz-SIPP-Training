public class calculateAverageMarks {
    public static void main(String[] args) {
        double maths = 85;
        double physics = 90;
        double chemistry = 80;
        double average = calculateAverageMarksFunction(maths, physics, chemistry);
        System.out.println("Average Marks: " + average);
    }

    public static double calculateAverageMarksFunction(double maths, double physics, double chemistry) {
        return (maths + physics + chemistry) / 3;
    }
}

