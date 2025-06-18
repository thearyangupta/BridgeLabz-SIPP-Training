public class MultiplesBelow100While {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int number = sc.nextInt();

        int counter = 1;
        while (counter < 100) {
            if (counter % number == 0)
                System.out.println(counter);
            counter++;
        }
    }
}
