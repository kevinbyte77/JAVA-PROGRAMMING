import java.io.*;

public class ATM {
    public static void main(String[] args) {
        try {
            int balance = 5000;
            int withdrawal = 6000;

            if (withdrawal > balance) {
                throw new Exception("Invalid withdrawal amount");
            }

            System.out.println("Withdrawal successful.");
            System.out.println("Remaining Balance: " + (balance - withdrawal));
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}