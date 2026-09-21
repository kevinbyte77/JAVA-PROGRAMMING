import java.io.*;

public class Login {

    static void checkPassword(String password) throws Exception {
        if (!password.equals("1234")) {
            throw new Exception("Invalid password");
        }

        System.out.println("Login successful.");
    }

    public static void main(String[] args) {

        try {
            checkPassword("123");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Login process completed.");
        }
    }
}