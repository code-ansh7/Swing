import javax.swing.*;

public class FirstSwingProgram {
    public static void main(String[] args) {

        // Create Window
        JFrame frame = new JFrame("My First Swing Program");

        // Set window size
        frame.setSize(500, 300);

        // Close button properly closes application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make window visible
        frame.setVisible(true);
    }
}
