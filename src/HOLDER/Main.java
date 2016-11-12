package HOLDER;

import static HOLDER.Frame.createGUI;

/**
 * Created by User on 12.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }
}
