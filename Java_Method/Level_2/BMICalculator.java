import java.util.*;

public class BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            double weight = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            double height = sc.nextDouble();
            double bmi = calculateBMI(weight, height);
            data[i][0] = weight;
            data[i][1] = height;
            data[i][2] = bmi;
            status[i] = getBMIStatus(bmi);
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", data[i][0], data[i][1], data[i][2], status[i]);
        }
    }
}
