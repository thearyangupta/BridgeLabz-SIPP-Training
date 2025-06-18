import java.util.Scanner;

public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number % divisor, number / divisor};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int divisor = sc.nextInt();

        int[] res = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + res[1] + ", Remainder: " + res[0]);
    }
}
