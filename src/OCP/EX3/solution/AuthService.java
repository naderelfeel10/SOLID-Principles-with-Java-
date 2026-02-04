package OCP.EX3.solution;

import OCP.EX3.solution.LoginRequest;

public class AuthService {

    AuthHandlerFactory authHandlerFactory = new AuthHandlerFactory();

    public boolean loginUser(User user, LoginRequest loginRequest){

        LoginValidator loginValidator = authHandlerFactory.getLoginValidator(loginRequest.getLoginType());
        boolean validation_result = loginValidator.validate(user,loginRequest);
        //System.out.println("validation result :"+validation_result);

        if(validation_result)
            return validation_result;

        throw new IllegalArgumentException("Unsupported login type");

    }
}
