package src.g11.agenthub.db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnection {
    // variables

    private String dbUrl;
    private String dbUser;
    private String dbPass;
    private String dbDriver;
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;

    // end of variables

    public DbConnection() {
        this.dbUrl = "jdbc:mysql://localhost:3306/agenthub";
        this.dbUser = "root";
        this.dbPass = "Pa$$w0rd";
        this.dbDriver = "com.mysql.cj.jdbc.Driver";
    }

    public Connection connect() {
        try {
            Class.forName(dbDriver);
            conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return conn;
    }

    public void close() {
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public boolean checkLogin(String username, String password, String user) {
        String query = "SELECT * FROM users WHERE username='" + username + "' AND password='" + password
                + "' AND category='ADMINISTRATOR' LIMIT 1";
        try {
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
