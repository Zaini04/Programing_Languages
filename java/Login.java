import javax.swing.*;

class MyFrame extends JFrame {
    public MyFrame() {
        super("Login"); // Set the frame title
        setLayout(null);
        setBounds(200, 150, 400, 300); // Set the size of the frame (e.g., 400x300)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the frame is closed
        setVisible(true);
    }
}

public class Login {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MyFrame();
        });
    }
}