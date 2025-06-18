import java.util.Scanner;

public class StudentGrades2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3];
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Physics, Chemistry, Maths for student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextDouble();
                if (marks[i][j] < 0) {
                    System.out.println("Invalid marks. Try again.");
                    j--;
                }
            }

            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percent[i] >= 90)
                grade[i] = "A";
            else if (percent[i] >= 75)
                grade[i] = "B";
            else if (percent[i] >= 60)
                grade[i] = "C";
            else if (percent[i] >= 40)
                grade[i] = "D";
            else
                grade[i] = "F";
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d: Physics=%.1f, Chemistry=%.1f, Maths=%.1f, Percentage=%.2f%%, Grade=%s%n",
                i + 1, marks[i][0], marks[i][1], marks[i][2], percent[i], grade[i]);
        }
    }
}
