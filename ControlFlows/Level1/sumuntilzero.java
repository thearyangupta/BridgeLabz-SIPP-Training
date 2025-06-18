import java.util.*;
public class sumuntilzero {
    static void computeSum(Scanner sc) {
        int total = 0, n;
        while (true) {
            n = sc.nextInt();
            if (n == 0) break;
            total += n;
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        computeSum(sc);
    }
}
