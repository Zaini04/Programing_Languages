// import javax.swing.*;

// import java.awt.EventQueue;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.util.HashMap;
// import java.util.Map;

// class CabBookingSystem {
//     private JFrame frame;
//     private JPanel loginPanel, registrationPanel, bookingPanel;
//     private JTextField usernameField, passwordField;
//     private JButton loginButton, registerButton, bookRideButton;
//     private JTextArea statusArea;
//     private Map<String, String> passengerDatabase;
//     private Map<String, String> driverDatabase;

//     public CabBookingSystem() {
//         initialize();
//     }

//     private void initialize() {
//         frame = new JFrame();
//         frame.setBounds(100, 100, 450, 300);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.getContentPane().setLayout(null);

//         // Initialize databases
//         passengerDatabase = new HashMap<>();
//         driverDatabase = new HashMap<>();

//         // Initialize login panel
//         loginPanel = new JPanel();
//         loginPanel.setBounds(0, 0, 434, 261);
//         frame.getContentPane().add(loginPanel);
//         loginPanel.setLayout(null);

//         JLabel lblUsername = new JLabel("Username:");
//         lblUsername.setBounds(50, 50, 80, 20);
//         loginPanel.add(lblUsername);

//         JLabel lblPassword = new JLabel("Password:");
//         lblPassword.setBounds(50, 90, 80, 20);
//         loginPanel.add(lblPassword);

//         usernameField = new JTextField();
//         usernameField.setBounds(140, 50, 200, 20);
//         loginPanel.add(usernameField);

//         passwordField = new JPasswordField();
//         passwordField.setBounds(140, 90, 200, 20);
//         loginPanel.add(passwordField);

//         loginButton = new JButton("Login");
//         loginButton.setBounds(140, 130, 80, 30);
//         loginButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 loginButtonClicked();
//             }
//         });
//         loginPanel.add(loginButton);

//         registerButton = new JButton("Register");
//         registerButton.setBounds(240, 130, 100, 30);
//         registerButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 showRegistrationPanel();
//             }
//         });
//         loginPanel.add(registerButton);

//         // Initialize registration panel
//         registrationPanel = new JPanel();
//         registrationPanel.setBounds(0, 0, 434, 261);
//         frame.getContentPane().add(registrationPanel);
//         registrationPanel.setLayout(null);
//         registrationPanel.setVisible(false);

//         JLabel lblRegisterUsername = new JLabel("Username:");
//         lblRegisterUsername.setBounds(50, 50, 80, 20);
//         registrationPanel.add(lblRegisterUsername);

//         JLabel lblRegisterPassword = new JLabel("Password:");
//         lblRegisterPassword.setBounds(50, 90, 80, 20);
//         registrationPanel.add(lblRegisterPassword);

//         JTextField registerUsernameField = new JTextField();
//         registerUsernameField.setBounds(140, 50, 200, 20);
//         registrationPanel.add(registerUsernameField);

//         JTextField registerPasswordField = new JPasswordField();
//         registerPasswordField.setBounds(140, 90, 200, 20);
//         registrationPanel.add(registerPasswordField);

//         JButton registerUserButton = new JButton("Register");
//         registerUserButton.setBounds(140, 130, 100, 30);
//         registerUserButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 registerUserButtonClicked(registerUsernameField.getText(), registerPasswordField.getText());
//             }
//         });
//         registrationPanel.add(registerUserButton);

//         JButton goBackButton = new JButton("Go Back");
//         goBackButton.setBounds(250, 130, 100, 30);
//         goBackButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 showLoginPanel();
//             }
//         });
//         registrationPanel.add(goBackButton);

//         // Initialize booking panel
//         bookingPanel = new JPanel();
//         bookingPanel.setBounds(0, 0, 434, 261);
//         frame.getContentPane().add(bookingPanel);
//         bookingPanel.setLayout(null);
//         bookingPanel.setVisible(false);

//         JLabel lblSource = new JLabel("Source:");
//         lblSource.setBounds(50, 50, 80, 20);
//         bookingPanel.add(lblSource);

//         JLabel lblDestination = new JLabel("Destination:");
//         lblDestination.setBounds(50, 90, 80, 20);
//         bookingPanel.add(lblDestination);

//         JTextField sourceField = new JTextField();
//         sourceField.setBounds(140, 50, 200, 20);
//         bookingPanel.add(sourceField);

//         JTextField destinationField = new JPasswordField();
//         destinationField.setBounds(140, 90, 200, 20);
//         bookingPanel.add(destinationField);

//         bookRideButton = new JButton("Book Ride");
//         bookRideButton.setBounds(140, 130, 120, 30);
//         bookRideButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 bookRideButtonClicked(sourceField.getText(), destinationField.getText());
//             }
//         });
//         bookingPanel.add(bookRideButton);

//         statusArea = new JTextArea();
//         statusArea.setBounds(50, 180, 350, 60);
//         bookingPanel.add(statusArea);

//         showLoginPanel();
//     }

//     private void showLoginPanel() {
//         loginPanel.setVisible(true);
//         registrationPanel.setVisible(false);
//         bookingPanel.setVisible(false);
//     }

//     private void showRegistrationPanel() {
//         loginPanel.setVisible(false);
//         registrationPanel.setVisible(true);
//         bookingPanel.setVisible(false);
//     }

//     private void showBookingPanel() {
//         loginPanel.setVisible(false);
//         registrationPanel.setVisible(false);
//         bookingPanel.setVisible(true);
//     }

//     private void loginButtonClicked() {
//         String username = usernameField.getText();
//         String password = passwordField.getText();

//         if (passengerDatabase.containsKey(username) && passengerDatabase.get(username).equals(password)) {
//             showBookingPanel();
//         } else if (driverDatabase.containsKey(username) && driverDatabase.get(username).equals(password)) {
//             showBookingPanel();
//         } else {
//             JOptionPane.showMessageDialog(frame, "Invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
//         }
//     }

//     private void registerUserButtonClicked(String username, String password) {
//         if (username.isEmpty() || password.isEmpty()) {
//             JOptionPane.showMessageDialog(frame, "Please enter both username and password.", "Registration Failed", JOptionPane.ERROR_MESSAGE);
//             return;
//         }

//         if (passengerDatabase.containsKey(username) || driverDatabase.containsKey(username)) {
//             JOptionPane.showMessageDialog(frame, "Username already exists. Please choose another.", "Registration Failed", JOptionPane.ERROR_MESSAGE);
//         } else {
//             // For simplicity, assuming all registrations are passengers. In a real-world app, you'd differentiate passengers and drivers.
//             passengerDatabase.put(username, password);
//             JOptionPane.showMessageDialog(frame, "Registration successful. You can now log in.", "Registration Success", JOptionPane.INFORMATION_MESSAGE);
//             showLoginPanel();
//         }
//     }

//     private void bookRideButtonClicked(String source, String destination) {
//         if (source.isEmpty() || destination.isEmpty()) {
//             JOptionPane.showMessageDialog(frame, "Please enter both source and destination.", "Booking Failed", JOptionPane.ERROR_MESSAGE);
//             return;
//         }

//         // For simplicity, just displaying a message. In a real-world app, you'd handle the booking logic here.
//         statusArea.setText("Ride booked from " + source + " to " + destination + ". Cab is on its way!");
//     }

//     public void display() {
//         EventQueue.invokeLater(new Runnable() {
//             public void run() {
//                 try {
//                     frame.setVisible(true);
//                 } catch (Exception e) {
//                     e.printStackTrace();
//                 }
//             }
//         });
//     }

//     public static void main(String[] args) {
//         CabBookingSystem cabGUI = new CabBookingSystem();
//         cabGUI.display();
//     }
// }
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

class CabBookingSystem {
     JFrame frame;
     JPanel loginPanel, registrationPanel, bookingPanel, adminPanel;
     JTextField usernameField, passwordField;
     JButton loginButton, registerButton, bookRideButton, adminModeButton;
     JTextArea statusArea;
     Map<String, String> passengerDatabase;
     Map<String, String> driverDatabase;
     Map<String, String> adminDatabase;

     String currentUser;
     String currentMode;  // "passenger", "driver", or "admin"

    public CabBookingSystem() {
        initialize();
    }

    void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Initialize databases
        passengerDatabase = new HashMap<>();
        driverDatabase = new HashMap<>();
        adminDatabase = new HashMap<>();

        // Initialize login panel
        loginPanel = new JPanel();
        loginPanel.setBounds(0, 0, 434, 261);
        frame.getContentPane().add(loginPanel);
        loginPanel.setLayout(null);

        // ... (same as before)

        // Initialize admin panel
        adminPanel = new JPanel();
        adminPanel.setBounds(0, 0, 434, 261);
        frame.getContentPane().add(adminPanel);
        adminPanel.setLayout(null);
        adminPanel.setVisible(false);

        JButton viewPassengerButton = new JButton("View Passenger Database");
        viewPassengerButton.setBounds(50, 50, 200, 30);
        viewPassengerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement logic to view passenger database
                statusArea.setText("Passenger Database:\n" + passengerDatabase.toString());
            }
        });
        adminPanel.add(viewPassengerButton);

        JButton viewDriverButton = new JButton("View Driver Database");
        viewDriverButton.setBounds(50, 90, 200, 30);
        viewDriverButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement logic to view driver database
                statusArea.setText("Driver Database:\n" + driverDatabase.toString());
            }
        });
        adminPanel.add(viewDriverButton);

        // ... (other admin functionalities)

        showLoginPanel();
    }

    void showLoginPanel() {
        loginPanel.setVisible(true);
        registrationPanel.setVisible(false);
        bookingPanel.setVisible(false);
        adminPanel.setVisible(false);
    }

     void showRegistrationPanel() {
        loginPanel.setVisible(false);
        registrationPanel.setVisible(true);
        bookingPanel.setVisible(false);
        adminPanel.setVisible(false);
    }

     void showBookingPanel() {
        loginPanel.setVisible(false);
        registrationPanel.setVisible(false);
        bookingPanel.setVisible(true);
        adminPanel.setVisible(false);
    }

     void showAdminPanel() {
        loginPanel.setVisible(false);
        registrationPanel.setVisible(false);
        bookingPanel.setVisible(false);
        adminPanel.setVisible(true);
    }

    void loginButtonClicked() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (passengerDatabase.containsKey(username) && passengerDatabase.get(username).equals(password)) {
            currentUser = username;
            currentMode = "passenger";
            showBookingPanel();
        } else if (driverDatabase.containsKey(username) && driverDatabase.get(username).equals(password)) {
            currentUser = username;
            currentMode = "driver";
            showBookingPanel();
        } else if (adminDatabase.containsKey(username) && adminDatabase.get(username).equals(password)) {
            currentUser = username;
            currentMode = "admin";
            showAdminPanel();
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }

    // ... (other methods)

    public static void main(String[] args) {
        CabBookingSystem cabSystem = new CabBookingSystem();
        cabSystem.display();
    }
}

