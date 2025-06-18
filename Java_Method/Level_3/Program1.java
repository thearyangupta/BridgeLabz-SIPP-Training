public class Program1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": " + java.util.Arrays.toString(factors));
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors(factors));
        
        scanner.close();
    }

    public static int[] findFactors(int number) {
        java.util.ArrayList<Integer> factorList = new java.util.ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorList.add(i);
            }
        }
        return factorList.stream().mapToInt(i -> i).toArray();
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static int sumOfSquaresOfFactors(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += factor * factor;
        }
        return sumOfSquares;
    }
}