package OCP.EX3.solution;

import java.util.HashMap;
import java.util.Map;

public class AuthHandlerFactory {
    final private Map<String, LoginValidator> validators;

    public AuthHandlerFactory(){
        this.validators = Map.of(
                "PASSWORD", new PasswordValidator(),
                "OAUTH", new OauthValidator(),
                "API_KEY", new API_KEYValidator()
        ) ;
    }
    public LoginValidator getLoginValidator(String loginType){

        LoginValidator loginValidator = validators.get(loginType);

        if(loginValidator == null){
             throw new RuntimeException("unknown login type");
        }

        return loginValidator;
    }
}
