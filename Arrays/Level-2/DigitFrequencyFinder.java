import java.util.Scanner;

public class DigitFrequencyFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        int[] digits = new int[10];
        int count = 0;

        while (number != 0) {
            int digit = (int) (number % 10);
            digits[digit]++;
            number /= 10;
            count++;
        }

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (digits[i] > 0) {
                System.out.println(i + ": " + digits[i]);
            }
        }
    }
}