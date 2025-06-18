import java.util.Scanner;

public class HarshadNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int original = number;
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        if (original % sum == 0) {
            System.out.println(original + " is a Harshad Number");
        } else {
            System.out.println(original + " is Not a Harshad Number");
        }
    }
}
