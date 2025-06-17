import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to generate multiplication tables from 6 to 9: ");
        int number = scanner.nextInt();
        int[] multiplicationResult = new int[4];

        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }
    }
}