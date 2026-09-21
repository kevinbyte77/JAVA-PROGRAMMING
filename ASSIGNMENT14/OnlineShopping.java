import java.io.*;

public class OnlineShopping {
    public static void main(String[] args) {
        try {
            int quantity = 0;

            if (quantity <= 0) {
                throw new Exception("Invalid product quantity");
            }

            System.out.println("Product quantity: " + quantity);
            System.out.println("Order placed successfully.");
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}