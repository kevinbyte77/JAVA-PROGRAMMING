public class RestaurantBilling {
    static int totalOrders = 0;
    static double totalRevenue = 0;

    double calculateBill(double amount) {
        double serviceCharge = amount * 0.10;
        double bill = amount + serviceCharge;
        totalOrders++;
        totalRevenue += bill;
        return bill;
    }

    double calculateBill(double amount, double packagingCharge) {
        double bill = amount + packagingCharge;
        totalOrders++;
        totalRevenue += bill;
        return bill;
    }

    double calculateBill(double amount, double deliveryCharge, int distanceKm) {
        double distanceCost = distanceKm * 5; // ₹5 per km
        double bill = amount + deliveryCharge + distanceCost;
        totalOrders++;
        totalRevenue += bill;
        return bill;
    }

    public static void main(String[] args) {
        RestaurantBilling billing = new RestaurantBilling();

        // Dine-in order
        double dineInBill = billing.calculateBill(500);

        // Takeaway order
        double takeawayBill = billing.calculateBill(300, 20);

        // Delivery order
        double deliveryBill = billing.calculateBill(400, 30, 8);

        System.out.println("Dine-in Bill: " + dineInBill);
        System.out.println("Takeaway Bill: " + takeawayBill);
        System.out.println("Delivery Bill: " + deliveryBill);

        System.out.println("\nTotal Orders: " + RestaurantBilling.totalOrders);
        System.out.println("Total Revenue: " + RestaurantBilling.totalRevenue);
    }
}