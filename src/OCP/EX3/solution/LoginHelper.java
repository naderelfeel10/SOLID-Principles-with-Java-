package OCP.EX3.solution;

public class LoginHelper {

     String hash(String password) {
        return "hashed-" + password;
    }

     void log(String message) {
        System.out.println(message);
    }
}
