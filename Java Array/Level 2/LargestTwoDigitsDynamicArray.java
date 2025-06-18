import java.util.Scanner;

public class LargestTwoDigitsDynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }

            digits[index++] = number % 10;
            number /= 10;
        }

        int max = -1, secondMax = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > max) {
                secondMax = max;
                max = digits[i];
            } else if (digits[i] > secondMax && digits[i] != max) {
                secondMax = digits[i];
            }
        }

        System.out.println("Largest digit: " + max);
        System.out.println("Second largest digit: " + secondMax);
    }
}
