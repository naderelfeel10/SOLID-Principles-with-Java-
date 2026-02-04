package SRP.EX2.solution;

import SRP.EX2.solution.User;
import SRP.EX2.solution.UserRepository;
import SRP.EX2.solution.UserValidator;

public class UserService {
    private UserRepository userRepository = new UserRepository();
    private UserValidator userValidator = new UserValidator();

    public void registerUser(User user){
        userValidator.validateUser(user.getUsername(),user.getPassword());
        userRepository.saveUser(user.getUsername(),user.getPassword());
    }
}
