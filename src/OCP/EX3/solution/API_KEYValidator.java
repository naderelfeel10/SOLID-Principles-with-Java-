package OCP.EX3.solution;

public class API_KEYValidator extends API_KEYLoginHelper implements LoginValidator {

    public boolean validate(User user, LoginRequest request) {

        if (!validateApiKey(request.getApiKey())) {
            return false;
        }
        if (!user.hasRole("SERVICE")) {
            //throw new RuntimeException("Invalid API access");
        }

        log("Service logged in using API key");
        return true;

    }
}
