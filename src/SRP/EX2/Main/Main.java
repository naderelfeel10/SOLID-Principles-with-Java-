package SRP.EX2.Main;

import SRP.EX2.solution.UserService;
import SRP.EX2.solution.User;

public class Main {
    static  UserService userService = new UserService();
    public static void main(String[] args) {

        User user1 = new User("naderElfeel","12345678");
        userService.registerUser(user1);

    }
}