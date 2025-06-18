
public class calculateTotalPrice {
        public static void calculateTotalPrices() {
        double Price = 99.99;
        int quantity = 5;

        double totalPrice = Price * quantity;

        System.out.println("The total purchase price is INR " + Price +
                " if the quantity " + quantity + " and unit price is INR " + Price);
    }
    public static void main(String[] args) {
        calculateTotalPrices();
    }
}
