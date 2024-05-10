package src.g11.agenthub.gui;

import javax.swing.*;

import javafx.event.ActionEvent;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dashboard extends JFrame {
    private JPanel mainPanel;
    private JTextArea welcomeTextArea;
    private JLabel menuLabel;
    private JButton productsButton;
    private JButton agentsButton;
    private JButton customersButton;
    private JButton purchasesButton;
    private JButton usersButton;

    public Dashboard(String userType, String username) {
        initComponents();
        setTitle("Agent Hub: Admin Home Page");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        welcomeTextArea.setText("Welcome, Admin " + username + "\n to \n Order Management System for Agent");

        productsButton.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                showMenu("Products");            
            }
        });

        agentsButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showMenu("Agents");
            }
        });

        customersButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showMenu("Customers");
            }
        });

        purchasesButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showMenu("Purchases");
            }
        });

        usersButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showMenu("Users");
            }
        });

        setVisible(true);
    }

    private void initComponents() {
        mainPanel = new GradientPanel();
        mainPanel.setLayout(new BorderLayout());

        welcomeTextArea = new JTextArea();
        welcomeTextArea.setFont(new Font("Recoleta", Font.PLAIN, 54));
        welcomeTextArea.setBorder(BorderFactory.createEmptyBorder(0, 61, 0, 0));

        menuLabel = new JLabel("Please select your business:");
        menuLabel.setFont(new Font("Serif", Font.PLAIN, 14));

        productsButton = new JButton("Products");
        agentsButton = new JButton("Agents");
        customersButton = new JButton("Customers");
        purchasesButton = new JButton("Purchases");
        usersButton = new JButton("Users");

        mainPanel.add(welcomeTextArea, BorderLayout.NORTH);
        mainPanel.add(menuLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 3));
        buttonPanel.add(productsButton);
        buttonPanel.add(agentsButton);
        buttonPanel.add(customersButton);
        buttonPanel.add(purchasesButton);
        buttonPanel.add(usersButton);

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        add(mainPanel);
    }

    private void showMenu(String menu) {
        if (menu.equalsIgnoreCase("Products")) {
            new ProductPage();
        } else if (menu.equalsIgnoreCase("Agents")) {
            new AgentPage();
        } else if (menu.equalsIgnoreCase("Customers")) {
            new CustomerPage();
        } else if (menu.equalsIgnoreCase("Purchases")) {
            new PurchasePage();
        } else if (menu.equalsIgnoreCase("Users")) {
            new UserPage();
        } else {
            JOptionPane.showMessageDialog(this, "You selected " + menu, "Menu", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static class GradientPanel extends JPanel {
        public GradientPanel() {
            setPreferredSize(new Dimension(600, 400));
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            GradientPaint gradient = new GradientPaint(0, 0, new Color(64, 64, 64), 0, getHeight(),
                    new Color(128, 128, 128));
            g2d.setPaint(gradient);
            g2d.fillRect(0, 0, getWidth(), getHeight());
        }
    }



};
