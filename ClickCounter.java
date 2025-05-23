import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickCounter {
    static int count = 0;
    public static void main(String[] args) {

        JFrame frame = new JFrame("Click Counter");
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Clicks : 0" , SwingConstants.CENTER);
        JButton button = new JButton("Click me");
        frame.add(button);
        frame.setLayout(new BorderLayout());
        frame.add(button , BorderLayout.SOUTH);
        frame.add(label , BorderLayout.CENTER);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("Clicks: " + count);
            }
        });
    }
}