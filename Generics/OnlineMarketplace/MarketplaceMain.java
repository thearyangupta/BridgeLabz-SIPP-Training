package OnlineMarketplace;

public class MarketplaceMain {
    public static void main(String[] args) {
        Marketplace mp = new Marketplace();

        Product<BookCategory> b1 = new Product<>("Elements of Programming Interviews",4500,BookCategory.EDUCATION);
        Product<BookCategory> b2 = new Product<>("A man from planet Earth",1860,BookCategory.SCI_FI);

        Product<ClothingCategory> c1 = new Product<>("Shirt",1499.99,ClothingCategory.MENS);
        Product<ClothingCategory> c2 = new Product<>("Footwear",1250,ClothingCategory.WOMENS);

        Product<GadgetsCategory> g1 = new Product<>("Samsung S25 Ultra",1_25_000,GadgetsCategory.SMARTPHONE);
        Product<GadgetsCategory> g2 = new Product<>("MacBook M5",3_50_000,GadgetsCategory.LAPTOP);

        mp.addProduct(b1);
        mp.addProduct(b2);
        mp.addProduct(c1);
        mp.addProduct(c2);
        mp.addProduct(g1);
        mp.addProduct(g2);

        mp.displayCatalog();

        mp.removeProduct("Shirt");
        mp.removeProduct("Shirt");

        mp.applyDiscount(b1,15);

        mp.displayCatalog();
    }
}
