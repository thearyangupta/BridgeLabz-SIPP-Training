package SmartWarehouseManagementSystem;

import java.util.List;
import java.util.ArrayList;

public class Storage<T extends WarehouseItem> {

    static final String RESET = "\u001b[0m";
    static final String BLUE = "\u001b[34m";
    static final String GREEN = "\u001b[32m";

    private final List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
        System.out.println(BLUE + "Added : " + GREEN + item.getName() + RESET);
    }

    public T getItem(int idx) {
        return items.get(idx);
    }

    public List<T> getAllItems() {
        return items;
    }

    public static void displayAllItems(List<? extends WarehouseItem> itemList) {
        System.out.println("\n---------------------------- " + BLUE + "Item List" + RESET + " ----------------------------");
        for (WarehouseItem item : itemList) {
            System.out.println(item);
        }
        System.out.println("-------------------------------------------------------------------");
    }

}
