import javax.swing.*;
import java.awt.*;

public class BankBalanceCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bank Balance Calculator");
        JTextField balanceField = new JTextField();
        JTextField amountField = new JTextField();
        JButton deposit = new JButton("Deposit");
        JButton withdraw = new JButton("Withdraw");
        JLabel result = new JLabel("Updated Balance: ");

        deposit.addActionListener(e -> {
            double balance = Double.parseDouble(balanceField.getText());
            double amount = Double.parseDouble(amountField.getText());
            balance = balance + amount;
            balanceField.setText(String.valueOf(balance));
            result.setText("Updated Balance: " + balance);
        });

        withdraw.addActionListener(e -> {
            double balance = Double.parseDouble(balanceField.getText());
            double amount = Double.parseDouble(amountField.getText());
            balance = balance - amount;
            balanceField.setText(String.valueOf(balance));
            result.setText("Updated Balance: " + balance);
        });

        frame.setLayout(new GridLayout(4, 2, 5, 5));
        frame.add(new JLabel("Initial Balance:"));
        frame.add(balanceField);
        frame.add(new JLabel("Transaction Amount:"));
        frame.add(amountField);
        frame.add(deposit);
        frame.add(withdraw);
        frame.add(result);

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}