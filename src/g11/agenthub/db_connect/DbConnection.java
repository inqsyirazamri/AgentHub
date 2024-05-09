package src.g11.agenthub.db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class DbConnection implements AutoCloseable {
    // variables

    private String dbUrl;
    private String dbUser;
    private String dbPass;
    private String dbDriver;
    private Connection conn;
    // private Statement stmt;
    // private ResultSet rs;

    // end of variables

    public DbConnection() {
        this.dbUrl = "jdbc:mysql://localhost:3306/agenthub";
        this.dbUser = "root";
        this.dbPass = "Pa$$w0rd";
        this.dbDriver = "com.mysql.cj.jdbc.Driver";
    }

    public Connection getConnection() throws SQLException {
        try {
            Class.forName(dbDriver);
            conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Error: Driver class not found: " + e.getMessage());
        }
        return conn;
    }

    public void close() throws SQLException {
        try {
            conn.close();
        } catch (SQLException e) {
            throw new SQLException("Error closing connection: " + e.getMessage());
        }
    }

    public boolean checkLogin(String username, String password) throws SQLException {
        String query = "SELECT * FROM users WHERE username = ? AND password = ? AND role='ADMINISTRATOR' LIMIT 1";
        try (Connection connection = getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        }
    }
}
