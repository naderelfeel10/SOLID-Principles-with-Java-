package OCP.EX3.solution;

import java.util.Set;

public class User {

    private String username;
    private String password;     // already hashed in real systems
    private boolean locked;
    private Set<String> roles;

    public User(String username, String password, boolean locked, Set<String> roles) {
        this.username = username;
        this.password = password;
        this.locked = locked;
        this.roles = roles;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLocked() {
        return locked;
    }

    public boolean hasRole(String role) {
        return roles != null && roles.contains(role);
    }

    public String getUsername() {
        return username;
    }
}
