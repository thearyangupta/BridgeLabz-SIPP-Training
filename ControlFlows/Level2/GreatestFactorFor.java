public class GreatestFactorFor {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int number = sc.nextInt();

        int greatestFactor = 1;

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("Greatest factor " + greatestFactor);
    }
}
