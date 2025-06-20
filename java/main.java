import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CabBookingSystemGUI {
    private JFrame frame;
    private JTextField destinationField;
    private JButton bookRideButton;
    private JTextArea rideStatusArea;

    public CabBookingSystemGUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel destinationLabel = new JLabel("Enter Destination:");
        destinationLabel.setBounds(20, 30, 120, 20);
        frame.getContentPane().add(destinationLabel);

        destinationField = new JTextField();
        destinationField.setBounds(150, 30, 200, 20);
        frame.getContentPane().add(destinationField);

        bookRideButton = new JButton("Book Ride");
        bookRideButton.setBounds(150, 60, 120, 30);
        bookRideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bookRideButtonClicked();
            }
        });
        frame.getContentPane().add(bookRideButton);

        rideStatusArea = new JTextArea();
        rideStatusArea.setBounds(20, 100, 400, 150);
        frame.getContentPane().add(rideStatusArea);
    }

    private void bookRideButtonClicked() {
        String destination = destinationField.getText();
        // Here, you would implement the logic to book a ride based on the entered destination.
        // For simplicity, let's assume a message for demonstration purposes.
        rideStatusArea.setText("Ride booked to " + destination + ". Cab is on its way!");
    }

    public void display() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        CabBookingSystemGUI cabGUI = new CabBookingSystemGUI();
        cabGUI.display();
    }
}
