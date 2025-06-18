import java.util.Scanner;

public class calculateStudentFee {
        public static void calculateStudentFeeFunction() {
        double fee;
        double discountPercent;
        Scanner sc = new Scanner(System.in);

        fee = sc.nextDouble();
        discountPercent = sc.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
    public static void main(String[] args) {
        System.out.println("Enter the fee and discount percentage:");
        calculateStudentFeeFunction();
    }
}
