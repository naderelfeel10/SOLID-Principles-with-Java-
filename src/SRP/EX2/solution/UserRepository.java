package SRP.EX2.solution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UserRepository {

    public void saveUser(String username, String password) {
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
