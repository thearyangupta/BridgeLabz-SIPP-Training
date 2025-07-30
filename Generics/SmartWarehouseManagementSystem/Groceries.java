package SmartWarehouseManagementSystem;

import java.time.LocalDate;

public class Groceries extends WarehouseItem {
    private final LocalDate expDate;

    public Groceries (int id, String name, LocalDate expDate) {
        super(id, name);
        this.expDate = expDate;
    }

    @Override
    public String getType() {
        return "[Groceries]";
    }

    @Override
    public String toString() {
        return getType() + super.toString() + "\nExpiry Date : " + this.expDate;
    }
}
