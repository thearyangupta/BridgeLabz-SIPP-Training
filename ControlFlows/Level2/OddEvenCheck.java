public class OddEvenCheck {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int number = sc.nextInt();

        if (number < 1) {
            return;
        }

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is Even");
            else
                System.out.println(i + " is Odd");
        }
    }
}
