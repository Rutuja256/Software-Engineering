import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {

    JTextField usernameField;
    JPasswordField passwordField;

    LoginPage() {
        setTitle("Login Page");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));
        panel.setBorder(
            BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        JLabel title = new JLabel("Login Page");
        title.setFont(new Font("Arial", Font.BOLD, 20));

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");

        panel.add(title);
        panel.add(new JLabel(""));
        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(new JLabel(""));
        panel.add(loginButton);

        add(panel);

        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password =
                new String(passwordField.getPassword());

            if (username.equals("admin")
                    && password.equals("1234")) {
                JOptionPane.showMessageDialog(
                    this, "Login Successful!"
                );
            } else {
                JOptionPane.showMessageDialog(
                    this, "Invalid Username or Password"
                );
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}