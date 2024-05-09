package src.main;

import com.jtattoo.plaf.hifi.HiFiLookAndFeel;

import src.g11.agenthub.gui.LoginForm;

import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AgentHub {
    //parameterized constructor - choose theme
    public AgentHub(int a){
        //code for theme selection (if sempat)
    }

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("logoString", "g11");
        HiFiLookAndFeel.setCurrentTheme(props);
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // Create instance for login form
        LoginForm id = new LoginForm();
        id.setLocationRelativeTo(null);
        id.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        id.setVisible(true);
}
}