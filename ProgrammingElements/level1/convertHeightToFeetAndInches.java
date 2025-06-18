import java.util.Scanner;

public class convertHeightToFeetAndInches {
        public static void convertHeightToFeetAndInchesFunction() {
        double heightInCm;
        Scanner sc = new Scanner(System.in);
        heightInCm = sc.nextDouble();

        double totalInches = heightInCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your Height in cm is " + heightInCm + ", while in feet is " + feet + " and inches is " + inches);
    }   
    public static void main(String[] args) {
        System.out.println("Enter your height in cm:");
        convertHeightToFeetAndInchesFunction();
    }
}
