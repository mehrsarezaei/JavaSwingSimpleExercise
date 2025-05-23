import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSelector {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ColorSelector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel mainPanel = new JPanel();
        JButton button = new JButton("Red");
        JButton button1 = new JButton("Green");
        JButton button2 = new JButton("Blue");
        button.setActionCommand("Red");
        button1.setActionCommand("Green");
        button2.setActionCommand("Blue");
        panel.add(button);
        panel.add(button1);
        panel.add(button2);
        frame.add(panel , BorderLayout.NORTH);
        frame.add(mainPanel, BorderLayout.CENTER);
        ActionListener actionListener = e -> {
            switch (e.getActionCommand()) {
                case "Red": mainPanel.setBackground(Color.RED); break;
                case "Green": mainPanel.setBackground(Color.GREEN); break;
                case "Blue": mainPanel.setBackground(Color.BLUE); break;
            }
        };
        button.addActionListener(actionListener);
        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);
    }
}
