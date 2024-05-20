package src.g11.agenthub.gui;

import src.g11.agenthub.data_access.AgentDao;
import src.g11.agenthub.data_transfer.AgentDto;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AgentProfilePage extends JFrame {
    private JPanel mainPanel;
    private JLabel usernameLabel;
    private JLabel emailLabel;
    private JLabel phoneLabel;
    private JTextField usernameField;
    private JTextField emailField;
    private JTextField phoneField;
    private JButton backButton;

    public AgentProfilePage(String agentCode) {
        initComponents(agentCode);
        setTitle("Agent Profile");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void initComponents(String agentCode) {
        mainPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        usernameLabel = new JLabel("Username:");
        emailLabel = new JLabel("Email:");
        phoneLabel = new JLabel("Phone:");

        usernameField = new JTextField();
        usernameField.setEditable(false);
        emailField = new JTextField();
        emailField.setEditable(false);
        phoneField = new JTextField();
        phoneField.setEditable(false);

        backButton = new JButton("Back");
        backButton.addActionListener(e -> dispose());

        loadAgentDetails(agentCode);

        mainPanel.add(usernameLabel);
        mainPanel.add(usernameField);
        mainPanel.add(emailLabel);
        mainPanel.add(emailField);
        mainPanel.add(phoneLabel);
        mainPanel.add(phoneField);
        mainPanel.add(new JLabel()); // empty placeholder
        mainPanel.add(backButton);

        add(mainPanel, BorderLayout.CENTER);
    }

    private void loadAgentDetails(String agentCode) {
        AgentDao agentDao = new AgentDao();
        try (ResultSet rs = agentDao.getAgentByCode(agentCode)) {
            if (rs.next()) {
                usernameField.setText(rs.getString("fullname"));
                emailField.setText(rs.getString("Email"));
                phoneField.setText(rs.getString("phone"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading agent details: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // For testing purposes, replace "agentCode123" with a valid agent code
        new AgentProfilePage("agentCode123");
    }
}
