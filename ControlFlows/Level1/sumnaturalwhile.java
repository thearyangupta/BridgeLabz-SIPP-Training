public class sumnaturalwhile {
    static void compareSum(int n) {
        if (n >= 1) {
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum (loop): " + sum + ", Sum (formula): " + formulaSum);
        } else {
            System.out.println("Not a natural number");
        }
    }
    public static void main(String[] args) {
        compareSum(10);
    }
}
