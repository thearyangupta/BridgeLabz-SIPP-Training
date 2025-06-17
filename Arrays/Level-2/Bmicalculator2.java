import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];
        for (int i = 0; i < n; i++) {
            double weight;
            do {
                weight = sc.nextDouble();
            } while (weight <= 0);
            double height;
            do {
                height = sc.nextDouble();
            } while (height <= 0);
            personData[i][0] = height;
            personData[i][1] = weight;
        }
        for (int i = 0; i < n; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];
            double bmi = weight / (height * height);
            personData[i][2] = bmi;
            if (bmi <= 18.4) weightStatus[i] = "Underweight";
            else if (bmi <= 24.9) weightStatus[i] = "Normal";
            else if (bmi <= 39.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }
        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][0] + " " + personData[i][1] + " " + personData[i][2] + " " + weightStatus[i]);
        }
    }
}
