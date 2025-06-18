import java.util.*;

public class RecursiveSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }

        int recursiveSum = sumRecursive(n);
        int formulaSum = n * (n + 1) / 2;
        System.out.println("Recursive Sum: " + recursiveSum);
        System.out.println("Formula Sum: " + formulaSum);
        System.out.println("Match: " + (recursiveSum == formulaSum));
    }

    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }
}
