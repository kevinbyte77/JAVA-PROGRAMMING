import java.util.ArrayList;

public class MobilePhone {
    // Instance variables
    String brand;
    String model;
    double price;
    int quantity;

    // 1. Default constructor
    public MobilePhone() {
        brand = "Unknown";
        model = "Unknown";
        price = 0.0;
        quantity = 0;
    }

    // 2. Parameterized constructor (partial - only brand and model)
    public MobilePhone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.price = 0.0;
        this.quantity = 1;
    }

    // 3. Fully parameterized constructor
    public MobilePhone(String brand, String model, double price, int quantity) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    // 4. Copy constructor - creates a duplicate record from an existing object
    public MobilePhone(MobilePhone other) {
        this.brand = other.brand;
        this.model = other.model;
        this.price = other.price;
        this.quantity = other.quantity;
    }

    // Display method
    void display() {
        System.out.printf("Brand: %-10s Model: %-10s Price: %-10.2f Qty: %d%n",
                brand, model, price, quantity);
    }

    public static void main(String[] args) {
        ArrayList<MobilePhone> inventory = new ArrayList<>();

        // Using default constructor
        MobilePhone p1 = new MobilePhone();

        // Using partial parameterized constructor
        MobilePhone p2 = new MobilePhone("Samsung", "Galaxy S23");

        // Using fully parameterized constructor
        MobilePhone p3 = new MobilePhone("Apple", "iPhone 15", 79999.00, 10);

        // Using copy constructor to duplicate an existing record
        MobilePhone p4 = new MobilePhone(p3); // duplicate of p3
        p4.quantity = 5; // modify quantity for the duplicate stock entry

        inventory.add(p1);
        inventory.add(p2);
        inventory.add(p3);
        inventory.add(p4);

        System.out.println("---- Mobile Phone Inventory ----");
        for (MobilePhone phone : inventory) {
            phone.display();
        }
    }
}