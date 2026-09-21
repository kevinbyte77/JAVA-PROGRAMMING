import java.io.*;

public class ATMpinVerification {

    static void checkPin(int pin) throws Exception {
        if (pin != 1234) {
            throw new Exception("Invalid ATM PIN");
        }

        System.out.println("PIN verified successfully.");
    }

    public static void main(String[] args) {

        try {
            checkPin(1111);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("PIN verification process completed.");
        }
    }
}