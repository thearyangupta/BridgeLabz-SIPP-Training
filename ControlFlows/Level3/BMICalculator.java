import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        height = height / 100;
        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }
}
