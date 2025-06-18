public class PowerUsingFor {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int number = sc.nextInt();

        int power = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        System.out.println("Result: " + result);
    }
}
