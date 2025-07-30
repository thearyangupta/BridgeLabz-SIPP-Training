package SmartWarehouseManagementSystem;

public class Electronics extends WarehouseItem {
    private final String brand;

    public Electronics (int id, String name, String brand) {
        super(id, name);
        this.brand = brand;
    }

    @Override
    public String getType() {
        return "[Electronics]";
    }

    @Override
    public String toString() {
        return getType() + super.toString() + "\nBrand : " + this.brand;
    }
}
