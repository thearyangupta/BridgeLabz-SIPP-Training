public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        int n = 10; // Example input
        if (n > 0) {
            int sumForLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumForLoop += i;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using for loop: " + sumForLoop);
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Results are equal: " + (sumForLoop == sumFormula));
        } else {
            System.out.println(n + " is not a natural number");
        }
    }
}