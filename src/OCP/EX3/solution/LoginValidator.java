package OCP.EX3.solution;

import OCP.EX3.solution.LoginRequest;

public interface LoginValidator {
    boolean validate(User user, LoginRequest loginRequest);
}
