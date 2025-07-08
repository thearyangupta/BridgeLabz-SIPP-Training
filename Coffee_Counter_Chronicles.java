import java.util.Scanner;

public class Coffee_Counter_Chronicles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coffeeType;
        int quantity;
        double price = 0;
        double gstRate = 0.18;

        System.out.println(" Welcome to Sparsh's Café ");
        System.out.println("Available Coffee Types: espresso, latte, cappuccino, americano");
        System.out.println("Type 'exit' to close the counter.");

        while (true) {
            System.out.print("\nEnter coffee type: ");
            coffeeType = scanner.nextLine().toLowerCase();

            if (coffeeType.equals("exit")) {
                System.out.println(" Café closed. Have a nice day!");
                break;
            }

            switch (coffeeType) {
                case "espresso":
                    price = 100;
                    break;
                case "latte":
                    price = 120;
                    break;
                case "cappuccino":
                    price = 150;
                    break;
                case "americano":
                    price = 130;
                    break;
                default:
                    System.out.println(" Invalid coffee type. Please try again.");
                    continue; 
            }

            System.out.print("Enter quantity: ");
            quantity = scanner.nextInt();
            scanner.nextLine(); 

            double total = price * quantity;
            double gst = total * gstRate;
            double finalAmount = total + gst;

            System.out.println("🧾 Bill Summary:");
            System.out.println("Coffee: " + coffeeType);
            System.out.println("Quantity: " + quantity);
            System.out.println("Base Price: ₹" + total);
            System.out.println("GST (18%): ₹" + gst);
            System.out.println("Total Bill: ₹" + finalAmount);
        }

        scanner.close();
    }
}
