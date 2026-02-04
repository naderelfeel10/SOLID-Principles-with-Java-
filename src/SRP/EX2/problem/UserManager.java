package SRP.EX2.problem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UserManager {

    public void registerUser(String username, String password) {
        if (username == null || username.length() < 5) {
            throw new IllegalArgumentException("Username too short");
        }

        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Password too weak");
        }

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "pass");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO users VALUES ('" + username + "', '" + password + "')");
            System.out.println("User log: " + username + " registered at " + java.time.LocalDateTime.now());
        } catch (Exception e) {
            System.err.println("Database error");
        }
    }
}