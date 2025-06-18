public class Program2 {
    public static void main(String[] args) {
        int n = 10; // Example input
        if (n > 0) {
            System.out.println("Sum of first " + n + " natural numbers (recursive): " + sumRecursive(n));
            System.out.println("Sum of first " + n + " natural numbers (formula): " + sumFormula(n));
        } else {
            System.out.println("Please enter a natural number greater than 0.");
        }
    }

    // Recursive method to calculate the sum of first n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    // Method to calculate the sum using the formula
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
}