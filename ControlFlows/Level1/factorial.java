public class factorial {
    static void Fact(int n) {
        if (n >= 0) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println(fact);
        } else {
            System.out.println("Not a positive integer");
        }
    }
    public static void main(String[] args) {
        Fact(5);
    }
}
