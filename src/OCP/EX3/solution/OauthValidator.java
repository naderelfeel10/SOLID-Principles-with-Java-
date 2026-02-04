package OCP.EX3.solution;

public class OauthValidator extends OauthLoginHelper implements LoginValidator  {

    public boolean validate(User user, LoginRequest request) {
        if (!validateOAuthToken(request.getToken())) {
            return false;
        }

        log("User logged in with OAuth");
        return true;
    }
}
