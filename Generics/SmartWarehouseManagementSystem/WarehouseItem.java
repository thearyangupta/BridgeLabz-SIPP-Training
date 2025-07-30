package SmartWarehouseManagementSystem;

public abstract class WarehouseItem {
    private final int id;
    private final String name;

    public WarehouseItem(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return this.id; }

    public String getName() { return name; }

    public abstract String getType();

    @Override
    public String toString() {
        return "\nID : " + getId() + "\nName : " + getName();
    }
}
