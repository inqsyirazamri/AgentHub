package src.g11.agenthub.gui;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import src.g11.agenthub.db_connect.DbConnection;


import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class LoginForm extends javax.swing.JDialog {
    // variables

    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField usernameField;
    private JPasswordField passwordField;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> userTypeBox;

    // end of variables

    public LoginForm() {
        initComponents();
    }

    private void initComponents() {

        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        userTypeBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        userTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Agent" }));

        // add login banner here (if sempat)

        usernameLabel.setText("Username");
        usernameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }

            private void usernameFieldActionPerformed(ActionEvent evt) {
                // swing have default action for this. Press "Enter" after typing username will
                // trigger this event
                // so, the pointer now will move to password field
                // code to validate username here (if sempat)
            }
        });

        passwordLabel.setText("Password");
        passwordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }

            private void passwordFieldKeyPressed(KeyEvent evt) {
                // swing have default action for this. Every character of your password will be
                // masking with "*"

                // code to trigger login button when Enter key is pressed (if sempat)
                // if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                // }
            }

        });

        loginButton.setText("Login");

        // insert image for login button here (if sempat)
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }

            String user;
            private void loginButtonMouseClicked(MouseEvent evt) {
                String username = usernameField.getText();
                // convert char[] to string for password
                // String p = passwordField.toString(); dia tkkasi convert cani
                String p = passwordField.getText(); // cer tanya chatgpt knpa cmni
                String password = encryptPassword(p);
                String userType = userTypeBox.getSelectedItem().toString();

                if(new DbConnection().checkLogin(username, password, userType)==true){
                    // open new window here 
                    dispose();
                    new Dashboard(user, username);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            private String encryptPassword(String password) {
                String encryptedPassword = "";
                // code to encrypt password here (Daniel part)
                // mybe can use MD5 or SHA-256
                return encryptedPassword;
            }

        });

        cancelButton.setText("Cancel");

    }

}
