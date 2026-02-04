package SRP.EX2.solution;

public class UserValidator {

    public void validateUser(String username, String password) {

        if (username == null || username.length() < 5) {
            throw new IllegalArgumentException("Username too short");
        }

        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Password too weak");
        }

    }
}
