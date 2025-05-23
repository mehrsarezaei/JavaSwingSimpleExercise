import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGreetingForm {
     public static void main(String[] args) {
          JFrame frame = new JFrame("Greeting Form");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(400, 150);
          frame.setLocationRelativeTo(null);
          JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
          JLabel nameLabel = new JLabel("Name:");
          JTextField nameField = new JTextField(15);
          JButton greetButton = new JButton("Greet");
          inputPanel.add(nameLabel);
          inputPanel.add(nameField);
          inputPanel.add(greetButton);
          JLabel messageLabel = new JLabel("Enter your name and press Greet.", SwingConstants.CENTER);
          frame.setLayout(new BorderLayout());
          frame.add(inputPanel, BorderLayout.NORTH);
          frame.add(messageLabel, BorderLayout.CENTER);
          greetButton.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                    String name = nameField.getText().trim();
                    if (!name.isEmpty()) {
                         messageLabel.setText("Hello, " + name + "!");
                    } else {
                         messageLabel.setText("Enter your name and press Greet.");
                    }
               }
          });

          frame.setVisible(true);
     }
}
