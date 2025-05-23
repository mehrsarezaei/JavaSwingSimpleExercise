import javax.swing.*;
import java.awt.*;

public class RegistrationFormApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 350);
        frame.setLocationRelativeTo(null);
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(new JLabel("Name: "), gbc);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField nameField = new JTextField(20);
        mainPanel.add(nameField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        mainPanel.add(new JLabel("Email: "), gbc);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField emailField = new JTextField(20);
        mainPanel.add(emailField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        mainPanel.add(new JLabel("Password: "), gbc);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JPasswordField passwordField = new JPasswordField(20);
        mainPanel.add(passwordField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        mainPanel.add(new JLabel("Gender: "), gbc);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        mainPanel.add(genderPanel, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.EAST;
        mainPanel.add(new JLabel("Interests: "), gbc);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JCheckBox javaBox = new JCheckBox("Java");
        JCheckBox pythonBox = new JCheckBox("Python");
        JCheckBox cppBox = new JCheckBox("C++");
        JPanel interestPanel = new JPanel();
        interestPanel.add(javaBox);
        interestPanel.add(pythonBox);
        interestPanel.add(cppBox);
        mainPanel.add(interestPanel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton submitButton = new JButton("Submit");
        mainPanel.add(submitButton, gbc);
        frame.add(mainPanel);
        frame.setVisible(true);
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String gender = maleButton.isSelected() ? "Male" : femaleButton.isSelected() ? "Female" : "Not selected";
            StringBuilder interests = new StringBuilder();
            if (javaBox.isSelected()) interests.append("Java ");
            if (pythonBox.isSelected()) interests.append("Python ");
            if (cppBox.isSelected()) interests.append("C++ ");

            String message = "<html><b>Name:</b> " + name +
                    "<br><b>Email:</b> " + email +
                    "<br><b>Gender:</b> " + gender +
                    "<br><b>Interests:</b> " + interests.toString() + "</html>";

            JOptionPane.showMessageDialog(frame, message, "Registration Details", JOptionPane.INFORMATION_MESSAGE);
        });
    }
}
