public class MultiplicationTable {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
