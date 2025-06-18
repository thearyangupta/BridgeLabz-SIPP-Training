public class GreatestFactorWhile {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int number = sc.nextInt();

        int greatestFactor = 1;
        int counter = number - 1;

        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("Greatest factor" + greatestFactor);
    }
}
