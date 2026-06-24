import javax.swing.*;
import java.awt.*;

public class DarkThemeDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Dark Theme");

        frame.setSize(600,400);

        frame.getContentPane().setBackground(Color.BLACK);

        JLabel label =
                new JLabel("Welcome Ansh");

        label.setForeground(Color.WHITE);

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
