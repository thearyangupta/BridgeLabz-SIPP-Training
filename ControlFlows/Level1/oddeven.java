public class oddeven {
    static void printOddEven(int n) {
        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0)
                    System.out.println(i + " is Even");
                else
                    System.out.println(i + " is Odd");
            }
        } else {
            System.out.println("Not a natural number");
        }
    }
    public static void main(String[] args) {
        printOddEven(10);
    }
}
