package src.g11.agenthub.gui;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Connection;
//import java.sql.SQLException;

import src.g11.agenthub.db_connect.DbConnection;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class LoginForm extends javax.swing.JDialog {
    // constants
    private static final String USERNAME_LABEL = "Username";
    private static final String PASSWORD_LABEL = "Password";
    private static final String LOGIN_BUTTON_TEXT = "Login";

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

        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        userTypeBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        //getContentPane().setBackground(new java.awt.Color(0, 0, 255)); // bright blue bg

        createUserTypeBox();
        createUsernameComponent();
        createPasswordComponent();
        createLoginButton();
        createCancelButton();
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userTypeBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(usernameLabel)
                                                        .addComponent(passwordLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(usernameField)
                                                        .addComponent(passwordField,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                188, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                // .addGroup(layout
                                                //         .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                //         .addComponent(loginButton)
                                                //         .addComponent(cancelButton))
                                                // .addGap(22, 22, 22)
                                                ))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                // .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
                                //         javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(usernameLabel)
                                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(passwordLabel)
                                                .addGap(23, 23, 23))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                // .addGap(1, 1, 1)
                                // .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                //         .addGroup(layout.createSequentialGroup()
                                //                 .addComponent(loginButton)
                                //                 .addGap(9, 9, 9)
                                //                 .addComponent(cancelLabel))
                                //         .addGroup(layout.createSequentialGroup()
                                //                 .addComponent(loginButton)
                                //                 .addGap(1, 1, 1)
                                //                 .addComponent(loginLabel)))
                                // .addContainerGap(12, Short.MAX_VALUE)
                                ));

        pack();
    }

    private void createUsernameComponent() {
        usernameLabel = new javax.swing.JLabel(USERNAME_LABEL);
        usernameField = new javax.swing.JTextField();
        usernameField.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.BLACK));
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);            }
        });
    }

    private void createPasswordComponent() {
        passwordLabel = new javax.swing.JLabel(PASSWORD_LABEL);
        passwordField = new javax.swing.JPasswordField();
        passwordField.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.BLACK));
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });
    }

    private void createLoginButton() {
        loginButton = new javax.swing.JButton(LOGIN_BUTTON_TEXT);
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
    }

    private void createCancelButton() {
        cancelButton = new javax.swing.JButton("Cancel");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
    }

    private void createUserTypeBox() {
        userTypeBox = new javax.swing.JComboBox<>();
        userTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Agent" }));
    }

    private void usernameFieldActionPerformed(ActionEvent evt) {
        // swing have default action for this. Press "Enter" after typing username will
        // trigger this event
        // so, the pointer now will move to password field
        // code to validate username here (if sempat)
    }

    private void passwordFieldKeyPressed(KeyEvent evt) {
        // swing have default action for this. Every character of your password will be masking with "*"
        // code to trigger login button when Enter key is pressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            loginButtonMouseClicked(null);
        }
    }

    private void loginButtonMouseClicked(MouseEvent evt) {
    String username = usernameField.getText();
    String password = encryptPassword(passwordField.getText());
    String userType = (String) userTypeBox.getSelectedItem();

    try (DbConnection dbConnection = new DbConnection()) {
        Connection conn = dbConnection.getConnection();
        if (conn!= null) {
            if (dbConnection.checkLogin(username, password)) {
                dispose();
                // new Dashboard(userType, username);
                new Dashboard(); //temporary while waiting for the Dashboard class completion
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Failed to connect to the database", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private String encryptPassword(String input) {
        String encryptedPassword = null;
        if (input == null)
            return null;
        try{
            MessageDigest digest=MessageDigest.getInstance("MD5");
            digest.update(input.getBytes(),0,input.length());
            encryptedPassword=new BigInteger(1,digest.digest()).toString(16);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return encryptedPassword;
    }

    private void cancelButtonMouseClicked(MouseEvent evt) {
        dispose();
    }
}
