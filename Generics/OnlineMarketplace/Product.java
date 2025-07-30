package OnlineMarketplace;

public class Product<T> {
    private final String name;
    private double price;
    private final T category;

    private final String RESET = "\u001b[0m";
    private final String GREEN = "\u001b[32m";
    private final String BLUE  = "\u001b[34m";

    public Product (String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return this.name; }

    public double getPrice() { return this.price; }

    public T getCategory() { return this.category; }

    public void setPrice(double newPrice) { this.price = newPrice; }

    @Override
    public String toString() {
        return String.format(
                  GREEN + "Product : " + BLUE + "%s, "
                + GREEN + "Price : " + BLUE + "%.2f, "
                + GREEN + "Category : " + BLUE + "%s"
                + RESET, this.name, this.price, this.category
        );
    }
}