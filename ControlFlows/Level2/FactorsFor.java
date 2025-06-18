public class FactorsFor {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                System.out.println(i);
        }
    }
}
