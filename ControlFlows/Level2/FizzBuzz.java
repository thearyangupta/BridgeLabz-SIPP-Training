public class FizzBuzz {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num = sc.nextInt();

        if (num < 1) {
            return;
        }

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
