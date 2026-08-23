class BankAccount {
    final String accountNumber; // final variable - cannot be changed once assigned
    String accountHolder;
    double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("AC1037456", "Kevin Parmar", 9000.0);
        acc.display();

        acc.deposit(1500.0);
        System.out.println("\nAfter Deposit:");
        acc.display();

        // acc.accountNumber = "AC9999999"; // compile-time error: cannot assign a value to final variable accountNumber
    }
}