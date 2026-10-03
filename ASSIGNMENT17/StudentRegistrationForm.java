import javax.swing.*;
import java.awt.*;

public class StudentRegistrationForm {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Student Registration");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JTextField nameField = new JTextField(15);
            JTextField rollField = new JTextField(15);
            JTextField emailField = new JTextField(15);
            JRadioButton male = new JRadioButton("Male", true);
            JRadioButton female = new JRadioButton("Female");
            ButtonGroup group = new ButtonGroup();
            group.add(male);
            group.add(female);
            JComboBox<String> courseBox = new JComboBox<>(new String[]{"BTech CSE", "BTech IT", "BTech ECE", "BTech Mechanical"});
            JButton submit = new JButton("Register");

            JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
            genderPanel.add(male);
            genderPanel.add(female);

            JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
            panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
            panel.add(new JLabel("Name:"));
            panel.add(nameField);
            panel.add(new JLabel("Roll No:"));
            panel.add(rollField);
            panel.add(new JLabel("Email:"));
            panel.add(emailField);
            panel.add(new JLabel("Gender:"));
            panel.add(genderPanel);
            panel.add(new JLabel("Course:"));
            panel.add(courseBox);
            panel.add(new JLabel());
            panel.add(submit);

            submit.addActionListener(e -> {
                String name = nameField.getText().trim();
                String roll = rollField.getText().trim();
                String email = emailField.getText().trim();
                if (name.isEmpty() || roll.isEmpty() || email.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String gender = male.isSelected() ? "Male" : "Female";
                JOptionPane.showMessageDialog(frame,
                        "Name: " + name + "\nRoll No: " + roll + "\nEmail: " + email +
                        "\nGender: " + gender + "\nCourse: " + courseBox.getSelectedItem(),
                        "Student Details", JOptionPane.INFORMATION_MESSAGE);
            });

            frame.add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}