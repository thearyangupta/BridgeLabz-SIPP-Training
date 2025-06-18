import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1));
            physics[i] = sc.nextDouble();
            chemistry[i] = sc.nextDouble();
            maths[i] = sc.nextDouble();

            percent[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percent[i] >= 80)
                grade[i] = "A";
            else if (percent[i] >= 70)
                grade[i] = "B";
            else if (percent[i] >= 60)
                grade[i] = "C";
            else if (percent[i] >= 50)
                grade[i] = "D";
                else if (percent[i] >= 40)
                grade[i] = "E";
            else
                grade[i] = "R";
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d: Physics=%.1f, Chemistry=%.1f, Maths=%.1f, Percentage=%.2f%%, Grade=%s%n",
                i + 1, physics[i], chemistry[i], maths[i], percent[i], grade[i]);
        }
    }
}
