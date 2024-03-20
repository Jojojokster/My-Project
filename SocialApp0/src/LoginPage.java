import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage implements ActionListener{

    JFrame LoginFrame = new JFrame();
    JButton Login = new JButton("Login");
    JButton Signup = new JButton("Sign Up");
    JTextField UserId = new JTextField(20);
    JPasswordField UserPassword = new JPasswordField(20);
    JLabel Username = new JLabel("Username");
    JLabel Password = new JLabel("Password");
    JLabel Message = new JLabel("Welcome to Bubbles");
    JPanel backgroundPanel;


    public LoginPage() {
        backgroundPanel = new JPanel(new GridBagLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Load the image from file or resource
                ImageIcon backgroundImage = new ImageIcon("C:\\Users\\Josep\\IdeaProjects\\SocialApp\\Bubbles.jpg");
                // Draw the image on the panel
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);

        backgroundPanel.add(Message, gbc);
        gbc.gridy++;
        backgroundPanel.add(Username, gbc);
        gbc.gridy++;
        backgroundPanel.add(UserId, gbc);
        gbc.gridy++;
        backgroundPanel.add(Password, gbc);
        gbc.gridy++;
        backgroundPanel.add(UserPassword, gbc);
        gbc.gridy++;
        backgroundPanel.add(Login, gbc);
        gbc.gridy++;
        backgroundPanel.add(Signup, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;;

        Login.addActionListener(this);
        Signup.addActionListener(this);

        
        LoginFrame.setContentPane(backgroundPanel);
        LoginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        LoginFrame.setSize(420, 300);
        LoginFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Login) {
            // Handle Login button click
            String Username = UserId.getText();
            char[] password = UserPassword.getPassword();

            // Example: Display a message
            Message.setText("Login button clicked. Username: " + Username + ", Password: " + new String(password));
        } else if (e.getSource() == Signup) {
            Message.setText("Signup button clicked.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginPage());
    }
}
