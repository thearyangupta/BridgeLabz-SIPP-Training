package SmartWarehouseManagementSystem;

public class Furniture extends WarehouseItem {
    private final String material;

    public Furniture(int id, String name, String material) {
        super(id, name);
        this.material = material;
    }

    @Override
    public String getType() {
        return "[Furniture]";
    }

    @Override
    public String toString() {
        return getType() + super.toString() + "\nMaterial : " + this.material;
    }
}
