package HOLDER;

import javax.swing.*;
import java.awt.*;

public class Frame {
    public static void createGUI() {
        JFrame frame = new JFrame("Есть контакт");
        frame.setLocation(500 ,100);
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Test label");
        label.setPreferredSize(new Dimension(100,20));
        panel.add(label);
        JButton button1= new JButton("Нажми");
        button1.setSize(new Dimension(100,100));
        button1.setLocation(200,100);
        panel.add(button1);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
