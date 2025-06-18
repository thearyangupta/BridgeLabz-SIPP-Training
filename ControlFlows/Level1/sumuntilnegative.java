import  java.util.*;
public class sumuntilnegative {

    static void computeSum(Scanner sc) {
        int total = 0;
        while (true) {
            int input = sc.nextInt();
            if (input <= 0) break;
            total += input;
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        computeSum(sc);

    }
}
