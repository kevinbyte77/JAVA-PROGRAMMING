import javax.swing.*;
import java.awt.*;

public class EmployeeRegistrationForm {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Employee Registration");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JTextField idField = new JTextField(15);
            JTextField nameField = new JTextField(15);
            JComboBox<String> deptBox = new JComboBox<>(new String[]{"HR", "Finance", "IT", "Marketing", "Operations"});
            JTextField salaryField = new JTextField(15);
            JButton submit = new JButton("Submit");

            JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
            panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
            panel.add(new JLabel("Employee ID:"));
            panel.add(idField);
            panel.add(new JLabel("Name:"));
            panel.add(nameField);
            panel.add(new JLabel("Department:"));
            panel.add(deptBox);
            panel.add(new JLabel("Salary:"));
            panel.add(salaryField);
            panel.add(new JLabel());
            panel.add(submit);

            submit.addActionListener(e -> {
                String id = idField.getText().trim();
                String name = nameField.getText().trim();
                String salaryText = salaryField.getText().trim();
                if (id.isEmpty() || name.isEmpty() || salaryText.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                try {
                    double salary = Double.parseDouble(salaryText);
                    JOptionPane.showMessageDialog(frame,
                            "Employee ID: " + id + "\nName: " + name +
                            "\nDepartment: " + deptBox.getSelectedItem() +
                            "\nSalary: " + salary,
                            "Employee Details", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Salary must be a number.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            });

            frame.add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}