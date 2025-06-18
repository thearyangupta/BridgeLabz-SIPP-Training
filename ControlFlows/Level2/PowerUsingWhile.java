public class PowerUsingWhile {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int number = sc.nextInt();

        int power = sc.nextInt();

        int result = 1;
        int counter = 0;

        while (counter < power) {
            result *= number;
            counter++;
        }

        System.out.println("Result: " + result);
    }
}
