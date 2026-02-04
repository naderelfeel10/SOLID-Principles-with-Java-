package OCP.EX3.problem;

public class AuthService {
    public boolean login(User user, LoginRequest request) {

        if (request.getLoginType().equals("PASSWORD")) {

            if (!user.getPassword().equals(hash(request.getPassword()))) {
                return false;
            }

            if (user.isLocked()) {
                throw new RuntimeException("Account locked");
            }

            log("User logged in with password");
            return true;

        } else if (request.getLoginType().equals("OAUTH")) {

            if (!validateOAuthToken(request.getToken())) {
                return false;
            }

            log("User logged in with OAuth");
            return true;

        } else if (request.getLoginType().equals("API_KEY")) {

            if (!validateApiKey(request.getApiKey())) {
                return false;
            }

            if (!user.hasRole("SERVICE")) {
                throw new RuntimeException("Invalid API access");
            }

            log("Service logged in using API key");
            return true;
        }

        throw new IllegalArgumentException("Unsupported login type");
    }

    private String hash(String password) {
        return "hashed-" + password;
    }

    private boolean validateOAuthToken(String token) {
        return token.startsWith("oauth-");
    }

    private boolean validateApiKey(String key) {
        return key.length() > 10;
    }

    private void log(String message) {
        System.out.println(message);
    }

}
