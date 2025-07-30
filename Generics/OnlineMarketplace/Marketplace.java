package OnlineMarketplace;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Marketplace {
    private List<Product<?>> catalog = new ArrayList<>();

    public void addProduct(Product<?> product) {
        catalog.add(product);
    }

    public void removeProduct(String name) {
        boolean found = false;
        Iterator<Product<?>> iterator = catalog.iterator();
        while (iterator.hasNext()) {
            Product<?> product = iterator.next();
            if (product.getName().equalsIgnoreCase(name)) {
                found = true;
                iterator.remove();
                System.out.println("\u001b[32m" + name + " removed from catalog" + "\u001b[0m");
            }
        }
        if (!found) {
            System.out.println("\u001b[31m" + "\nNo such product exists !" + "\u001b[0m");
        }
    }

    public <T extends Product> void applyDiscount(T product, double percent) {
        double currPrice = product.getPrice();
        double discount = currPrice * (percent/100.0);
        double finalPrice = currPrice - discount;

        product.setPrice(finalPrice);

        System.out.printf("\nApplied %.2f%% discount\nfinal price : %.2f\n", percent, finalPrice);
    }

    public void displayCatalog() {
        System.out.println("\n-------------------------------------- CATALOG -----------------------------------------");
        for (Product<?> p : catalog) {
            System.out.println(p);
        }
        System.out.println("----------------------------------------------------------------------------------------\n");
    }
}
