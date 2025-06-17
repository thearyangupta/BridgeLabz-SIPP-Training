import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println("The number " + numbers[i] + " is negative.");
            } else if (numbers[i] == 0) {
                System.out.println("The number is zero.");
            } else {
                System.out.println("The number " + numbers[i] + " is positive.");
                if (numbers[i] % 2 == 0) {
                    System.out.println("The number " + numbers[i] + " is even.");
                } else {
                    System.out.println("The number " + numbers[i] + " is odd.");
                }
            }
        }
        
        if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first element is greater than the last element.");
        } else if (numbers[0] < numbers[numbers.length - 1]) {
            System.out.println("The first element is less than the last element.");
        } else {
            System.out.println("The first element is equal to the last element.");
        }
        
        scanner.close();
    }
}