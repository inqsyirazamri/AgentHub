package src.g11.agenthub.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame {
    private CardLayout layout;
    private JPanel mainPanel;
    // private String userSelect;
    // private String username;

    public Dashboard(String userSelect, String username) {
        // this.userSelect = userSelect;
        // this.username = username;

        initComponents();

        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("G11-logo.png")));
        setTitle("Order Management System For Agent - " + userSelect + " : " + username);
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        // Create main panel with CardLayout
        layout = new CardLayout();
        mainPanel = new JPanel(layout);

        // Create and add components to main panel
        // mainPanel.add(new Home(), "Home");
        // mainPanel.add(new Products(username), "Products");
        // mainPanel.add(new Customers(), "Customers");
        // mainPanel.add(new Agents(), "Agents");
        // mainPanel.add(new Users(), "Users");
        mainPanel.add(new Logs(), "Logs");
        // // mainPanel.add(new ChangeDetails(username), "ChangeDetails");
        // mainPanel.add(new Purchase(), "Purchase");
        // // mainPanel.add(new About(), "About");

        // Create navigation panel
        JPanel navPanel = createNavPanel();

        // Add components to content pane
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(navPanel, BorderLayout.WEST);
        getContentPane().add(mainPanel, BorderLayout.CENTER);
    }

    private JPanel createNavPanel() {
        JPanel navPanel = new JPanel(new GridLayout(0, 1));
        navPanel.setBackground(Color.WHITE);
        navPanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

        // Add navigation buttons
        // addButton(navPanel, "Home", "/src/g11/agenthub/gui/images/temp.jpg", evt -> showPanel("Home"));
        // addButton(navPanel, "Products", "/src/g11/agenthub/gui/images/temp.jpg", evt -> showPanel("Products"));
        // addButton(navPanel, "Customers", "/src/g11/agenthub/gui/images/temp.jpg", evt -> showPanel("Customers"));
        // addButton(navPanel, "Suppliers", "/src/g11/agenthub/gui/images/temp.jpg", evt -> showPanel("Suppliers"));
        // addButton(navPanel, "Users", "/src/g11/agenthub/gui/images/temp.jpg", evt -> showPanel("Users"));
        // addButton(navPanel, "Logs", "/src/g11/agenthub/gui/images/temp.jpg", evt -> showPanel("Logs"));
        // addButton(navPanel, "Change Details", "/src/g11/agenthub/gui/images/temp.jpg",
        //         evt -> showPanel("ChangeDetails"));
        // addButton(navPanel, "Current Stocks", "/src/g11/agenthub/gui/images/temp.jpg",
        //         evt -> showPanel("CurrentStocks"));
        // addButton(navPanel, "Sales Report", "/src/g11/agenthub/gui/images/temp.jpg", evt -> showPanel("SalesReport"));
        // addButton(navPanel, "Purchase", "/src/g11/agenthub/gui/images/temp.jpg", evt -> showPanel("Purchase"));
        // addButton(navPanel, "About", "/src/g11/agenthub/gui/images/temp.jpg", evt -> showPanel("About"));

        return navPanel;
    }

    private void addButton(JPanel panel, String text, String iconPath, ActionListener listener) {
        JButton button = new JButton(text);
        button.setIcon(new ImageIcon(getClass().getResource(iconPath)));
        button.addActionListener(listener);
        panel.add(button);
    }

    private void showPanel(String panelName) {
        layout.show(mainPanel, panelName);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Dashboard("NORMAL USER", "Username");
        });
    }
}
