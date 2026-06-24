import javax.swing.*;

public class  Goal {
    public static void main(String[] args) {

        JFrame frame =
                new JFrame("Ansh's Coding Journey");

        frame.setSize(600, 300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label =
                new JLabel(
                    "Today: Core Java | Tomorrow: Flutter Developer 🚀"
                );

        frame.add(label);

        frame.setVisible(true);
    }
}
