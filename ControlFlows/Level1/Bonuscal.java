public class Bonuscal {
    static void calculateBonus(double salary, int years) {
        if (years > 5) {
            double bonus = 0.05 * salary;
            System.out.println( bonus);
        } else {
            System.out.println("No bonus applicable");
        }
    }
    public static void main(String[] args) {
        calculateBonus(50000, 6);
    }
}
