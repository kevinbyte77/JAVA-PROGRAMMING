import javax.swing.*;
import java.awt.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JButton add = new JButton("Add");
        JButton sub = new JButton("Subtract");
        JLabel result = new JLabel("Result: ");

        add.addActionListener(e -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            result.setText("Result: " + (a + b));
        });

        sub.addActionListener(e -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            result.setText("Result: " + (a - b));
        });

        frame.setLayout(new GridLayout(4, 2, 5, 5));
        frame.add(new JLabel("First Number:"));
        frame.add(num1);
        frame.add(new JLabel("Second Number:"));
        frame.add(num2);
        frame.add(add);
        frame.add(sub);
        frame.add(result);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}