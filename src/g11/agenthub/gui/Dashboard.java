package src.g11.agenthub.gui;

import javax.swing.JFrame;
// import javax.swing.JPanel;

//import src.g11.agenthub.gui.images.DashboardController;

// import javax.swing.JFrame;
// import javax.swing.JPanel;
// import javax.swing.JMenuBar;
// import javax.swing.BorderFactory;
// import java.awt.CardLayout;
// import java.awt.Dimension;
// import java.awt.Toolkit;

// public class Dashboard extends JFrame {
//     // private JPanel mainPanel;
//     // private JPanel navPanel;
//     private DashboardController controller;

//     public Dashboard(String user, String username) {
//         controller = new DashboardController(this, user, username);
//         initComponents();
//         setUpUI();
//     }

//     private void initComponents() {
//         // Initialize components (mainPanel, navPanel, etc.)
//     }

//     private void setUpUI() {
//         // Set up UI layout and event listeners
//         // Add components to mainPanel and navPanel
//     }

//     public void navigateTo(String page) {
//         // Switch between different pages using CardLayout
//     }

//     public void NotForNormalUser() {
//         // Hide certain UI elements for normal users
//     }
// }
/******************************************************************************
 *  Compilation:  javac GUI.java
 *  Execution:    java GUI
 *
 *  A minimal Java program with a graphical user interface. The
 *  GUI prints out the number of times the user clicks a button.
 *
 *  % java GUI
 *
 ******************************************************************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard implements ActionListener {
    private int clicks = 0;
    private JLabel label = new JLabel("Number of clicks:  0     ");
    private JFrame frame = new JFrame();

    public Dashboard() {

        // the clickable button
        JButton button = new JButton("Click Me");
        button.addActionListener(this);

        // the panel with the button and text
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        // set up the frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Ini hanya cobaan untuk nak confirm successfull login.");
        frame.pack();
        frame.setVisible(true);
    }

    // process the button clicks
    public void actionPerformed(ActionEvent e) {
        clicks++;
        label.setText("Number of clicks:  " + clicks);
    }

    // create one Frame
    public static void main(String[] args) {
        new Dashboard();
    }
}