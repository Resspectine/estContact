package HOLDER;

import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Frame {
    public static void createGUI() {
        JFrame frame = new JFrame("Есть контакт");
        frame.setLocation(500 ,100);
        frame.setPreferredSize(new Dimension(600, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JLabel label1= new JLabel("Чатик:");
        label1.setBounds(10,5,100,40);
        panel.add(label1);
        JFormattedTextField dialog = new JFormattedTextField();
        dialog.setBounds(10,35,500,500);
        panel.add(dialog);
        JButton button1= new JButton("Нажми");
        button1.setBounds(250,100,200,100);
        //panel.add(button1);
        JButton button2= new JButton("Нажми2");
        button2.setBounds(20,100,200,100);
       // panel.add(button2);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
