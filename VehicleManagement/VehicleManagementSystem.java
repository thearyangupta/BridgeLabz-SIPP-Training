import java.util.ArrayList;

abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String fuelType;

    public Vehicle(String brand, String model, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
    }

    public abstract double calculateServiceCost();
    public abstract void printServiceDetails();
}


class Car extends Vehicle {
    public Car(String brand, String model, String fuelType) {
        super(brand, model, fuelType);
    }

    @Override
    public double calculateServiceCost() {
        return 3000.0;
    }

    @Override
    public void printServiceDetails() {
        System.out.println("Car: " + brand + " " + model);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Service Cost: ₹" + calculateServiceCost());
        System.out.println("-----------------------------");
    }
}


class Bike extends Vehicle {
    public Bike(String brand, String model, String fuelType) {
        super(brand, model, fuelType);
    }

    @Override
    public double calculateServiceCost() {
        return 1000.0;
    }

    @Override
    public void printServiceDetails() {
        System.out.println("Bike: " + brand + " " + model);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Service Cost: ₹" + calculateServiceCost());
        System.out.println("-----------------------------");
    }
}


class Truck extends Vehicle {
    public Truck(String brand, String model, String fuelType) {
        super(brand, model, fuelType);
    }

    @Override
    public double calculateServiceCost() {
        return 5000.0;
    }

    @Override
    public void printServiceDetails() {
        System.out.println("Truck: " + brand + " " + model);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Service Cost: ₹" + calculateServiceCost());
        System.out.println("-----------------------------");
    }
}


public class VehicleManagementSystem {
    public static void main(String[] args) {
        ArrayList<Vehicle> garage = new ArrayList<>();

        garage.add(new Car("Toyota", "Corolla", "Petrol"));
        garage.add(new Bike("Yamaha", "FZ", "Petrol"));
        garage.add(new Truck("Tata", "407", "Diesel"));

        System.out.println("=== Vehicle Service Details ===");
        for (Vehicle v : garage) {
            v.printServiceDetails(); 
        }
    }
}
