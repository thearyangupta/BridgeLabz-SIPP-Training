import java.util.Scanner;

public class BMIStatus2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            double weight, height;
            do {
                System.out.println("Enter weight and height (in meters) for person " + (i + 1));
                weight = sc.nextDouble();
                height = sc.nextDouble();
            } while (weight <= 0 || height <= 0);

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = weight / (height * height);

            double bmi = personData[i][2];
            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d: Height=%.2f, Weight=%.2f, BMI=%.2f, Status=%s%n",
                i + 1, personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
    }
}
