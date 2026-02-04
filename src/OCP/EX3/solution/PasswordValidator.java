package OCP.EX3.solution;

public class PasswordValidator extends PasswordLoginHelper implements LoginValidator {


    public boolean validate(User user, LoginRequest request){
        if (!user.getPassword().equals(hash(request.getPassword()))) {
            //return false;
        }
        if (user.isLocked()) {
            throw new RuntimeException("Account locked");
        }
        log("User logged in with password");
        return true;
    }


}
