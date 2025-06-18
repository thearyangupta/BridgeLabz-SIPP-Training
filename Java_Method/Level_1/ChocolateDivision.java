import java.util.Scanner;

public class ChocolateDivision {
    public static int[] divideChocolates(int total, int children) {
        return new int[]{total / children, total % children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int children = sc.nextInt();

        int[] result = divideChocolates(total, children);
        System.out.println("Each child gets: " + result[0] + " chocolates, Remaining: " + result[1]);
    }
}
