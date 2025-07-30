package SmartWarehouseManagementSystem;

import java.time.LocalDate;

public class WarehouseMain {
    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics(1,"PC","Framework"));
        electronicsStorage.addItem(new Electronics(2,"Smartphone","Nubia RedMagic"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries(1,"Broccoli", LocalDate.now().plusDays(7)));
        groceriesStorage.addItem(new Groceries(2,"Mango",LocalDate.now().plusDays(5)));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture(1,"Sofa","Fabric"));
        furnitureStorage.addItem(new Furniture(2,"Dining Table","Glass and Wood"));

        Storage.displayAllItems(electronicsStorage.getAllItems());
        Storage.displayAllItems(groceriesStorage.getAllItems());
        Storage.displayAllItems(furnitureStorage.getAllItems());


    }
}
