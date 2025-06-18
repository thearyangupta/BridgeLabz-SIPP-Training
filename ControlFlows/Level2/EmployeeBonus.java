public class EmployeeBonus {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        double salary = sc.nextDouble();

        int years = sc.nextInt();

        if (years > 5) {
            double bonus = 0.05 * salary;
            System.out.println(bonus);
        } else {
            System.out.println("No bonus for less than or equal to 5 years.");
        }
    }
}
