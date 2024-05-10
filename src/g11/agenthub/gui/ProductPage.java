package src.g11.agenthub.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductPage extends JFrame {
    private JPanel productPage;
    private JLabel productImage;
    private JPanel productDetails;
    private JLabel productName;
    private JLabel productDescription;
    private JLabel productPrice;
    private JButton addToCartButton;

    public ProductPage() {
        initComponents();
        // Create the frame
        setTitle("Agent Hub: Product Page");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        // super("Product Page");
        // setDefaultCloseOperation(EXIT_ON_CLOSE);
        // setSize(800, 600);
    }

    private void initComponents() {
    }    
}