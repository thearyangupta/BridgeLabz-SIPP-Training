
import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        for (int i = 6; i <= 9; i++) {
            System.out.println("Table for " + number + " up to " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(number + " * " + j + " = " + (number * j));
            }
        }
        scanner.close();
    }
}
