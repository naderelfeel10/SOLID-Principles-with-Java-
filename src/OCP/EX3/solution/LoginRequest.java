package OCP.EX3.solution;

public class LoginRequest {

    private String loginType;  // PASSWORD, OAUTH, API_KEY

    // Password login
    private String password;

    // OAuth login
    private String token;

    // API key login
    private String apiKey;

    public LoginRequest(String loginType) {
        this.loginType = loginType;
    }

    public String getLoginType() {
        return loginType;
    }

    public String getPassword() {
        return password;
    }

    public String getToken() {
        return token;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
