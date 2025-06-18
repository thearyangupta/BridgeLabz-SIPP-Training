import java.util.Scanner;

public class calculateTotalPurchasePrice {
        public static void calculateTotalPurchasePriceFunction() {
        Scanner sc = new Scanner(System.in);
        double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();
        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }   
    public static void main(String[] args) {
        System.out.println("Enter the unit price and quantity:");
        calculateTotalPurchasePriceFunction();
    }
}
