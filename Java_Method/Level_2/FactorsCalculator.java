import java.util.*;

public class FactorsCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] factors = findFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum of Factors: " + sum(factors));
        System.out.println("Sum of Square of Factors: " + sumOfSquares(factors));
        System.out.println("Product of Factors: " + product(factors));
    }

    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0)
                count++;
        int[] arr = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0)
                arr[index++] = i;
        return arr;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) total += num;
        return total;
    }

    public static int product(int[] arr) {
        int prod = 1;
        for (int num : arr) prod *= num;
        return prod;
    }

    public static int sumOfSquares(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += Math.pow(num, 2);
        return sum;
    }
}
