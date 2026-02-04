package OCP.EX3.Main;


import OCP.EX3.solution.AuthService;
import OCP.EX3.solution.LoginRequest;
import OCP.EX3.solution.User;

import java.util.Set;

public class Main {
    static AuthService authService = new AuthService();
    public static void main(String[] args) {

        User user = new User("nader","12345678",false, Set.of("admin"));
        LoginRequest passLoginRequest = new LoginRequest("PASSWORD");
        LoginRequest OauthLoginRequest = new LoginRequest("OAUTH");
        LoginRequest apiLoginRequest = new LoginRequest("API_KEY");

        authService.loginUser(user, passLoginRequest);
        authService.loginUser(user, OauthLoginRequest);
        authService.loginUser(user, apiLoginRequest);
    }
}