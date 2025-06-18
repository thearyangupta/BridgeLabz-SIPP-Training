public class FactorsWhile {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int number = sc.nextInt();

        int i = 1;
        while (i < number) {
            if (number % i == 0)
                System.out.println(i);
            i++;
        }
    }
}
