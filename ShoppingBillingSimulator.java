package M;
import java.util.Scanner;

public class ShoppingBillingSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = {"Shoes", "Bag", "Watch", "T-shirt"};
        int[] prices = {1000, 1500, 2000, 800};

        System.out.println("Welcome to the Shopping Billing Simulator!\n");

        boolean continueShopping = true;
        double totalBill = 0;

        while (continueShopping) {
            System.out.println("Available Products:");
            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + ". " + products[i] + " - Rs" + prices[i]);
            }

            System.out.print("\nEnter the Product Number you want to buy: ");
            int choice = scanner.nextInt();

            if (choice < 1 || choice > products.length) {
                System.out.println("Invalid Product Selection!!!");
            } else {
                String selectedProduct = products[choice - 1];
                int actualPrice = prices[choice - 1];
                double discount = 0.10 * actualPrice;
                double finalPrice = actualPrice - discount;

                System.out.println("\nProduct Details:");
                System.out.println("Product Selected: " + selectedProduct);
                System.out.println("Actual Price: Rs" + actualPrice);
                System.out.println("Discount (10%): Rs" + discount);
                System.out.println("Final Price to Pay: Rs" + finalPrice);

                totalBill += finalPrice;
            }

            System.out.print("\nDo you want to add more items? (Yes or No): ");
            scanner.nextLine();
            String response = scanner.nextLine().toLowerCase();

            if (!response.equals("yes")) {
                continueShopping = false;
                System.out.println("\nThank you for shopping with us!");
                System.out.println("Your Total Bill: Rs" + totalBill);
            }

        }

        scanner.close();
    }
}
