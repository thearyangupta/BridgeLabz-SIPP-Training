import java.util.Scanner;

public class NumberSignChecker {
    public static int checkSign(int num) {
        if (num > 0) return 1;
        else if (num < 0) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = checkSign(number);
        System.out.println("Result: " + result);
    }
}
