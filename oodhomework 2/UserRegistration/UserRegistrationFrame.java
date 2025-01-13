package UserRegistration;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserRegistrationFrame extends JFrame {
    // UI components
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField emailField;
    private JTextField phoneField;
    private JLabel messageLabel;

    // Constructor
    public UserRegistrationFrame() {
        setTitle("User Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridBagLayout());
        //grid set up
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(5, 5, 5, 5);
        //username label and field
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(15);
        //placing the username label in place
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        add(usernameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        add(usernameField, gbc);

        //password label and field
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(15);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        add(passwordLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(passwordField, gbc);

        //email label and field
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(15);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        add(emailLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        add(emailField, gbc);
        
        //phone label and field
        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneField = new JTextField(15);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        add(phoneLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        add(phoneField, gbc);

        //register button
        JButton registerButton = new JButton("Register");
        messageLabel = new JLabel();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(registerButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(messageLabel, gbc);
        //register button action listener
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //create new user resgistration to hold inputs
                UserRegistration user = new UserRegistration();
                user.setUsername(usernameField.getText());
                user.setPassword(new String(passwordField.getPassword()));
                user.setEmail(emailField.getText());
                user.setPhoneNumber(phoneField.getText());

                // Create validator objects for each validation step
                Validator usernameValidator = new UsernameValidator();
                Validator passwordValidator = new PasswordValidator();
                Validator emailValidator = new EmailValidator();
                Validator phoneValidator = new PhoneNumberValidator();

                //chaining the validators
                usernameValidator.setNextValidator(passwordValidator);
                passwordValidator.setNextValidator(emailValidator);
                emailValidator.setNextValidator(phoneValidator);

                try {
                    usernameValidator.validate(user);
                    messageLabel.setText("Registration successful!");
                } catch (Exception ex) {
                    messageLabel.setText(ex.getMessage());
                }
            }
        });
    }
}