package OCP.EX3.solution;

public class OauthLoginHelper extends LoginHelper{

     boolean validateOAuthToken(String token) {
        //return token.startsWith("oauth-");
        return true;
     }

}
