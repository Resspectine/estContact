package HOLDER;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        dialog.setBounds(10,35,200,200);
        ActionListener action1= new ButtonListner();
        panel.add(dialog);

        JButton button= new JButton("Нажми");
        button.setBounds(220,215,100,20);
        button.addActionListener(action1);
        panel.add(button);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
class ButtonListner implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
            System.out.println("Работает");
    }
}