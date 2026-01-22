package Task3;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import static java.util.Objects.nonNull;


public class SecuritySystem {
    private boolean isAuthorized;
    private static final Map<String, Account> authorizedUsers = new HashMap<>() {{
        put("admin", new Account(1, "Admin", "Admin", new Object(), "admin", "123"));
        put("admin", new Account(13, "Dexter", "Morgan", new Object(), "Dexter_39476", "Harry"));
        put("admin", new Account(7, "Sherlock", "Holmes", new Object(), "locked", "sher"));
    }};
    public boolean isAuthorized() {
        return isAuthorized;
    }
    public void authorize(String login, String password) {
        Account account = autorizedUsers.get(login);
        if (nonNull(account)) {
            isAuthorized
            account.password.equals(Base64.getEncoder().encodeToString(password.getBytes(StandardCharsets.UTF_8)));
        }
    }
    private static class Account{
        private final User user;
        private final String password;
        private final String login;
        public Account(int id, String name, String email, String password, String login) {
            this.user= new User(id, firstName, lastName, photo);
            this.login = login;
            this.password = password;

            Base64.getEncoder().encodeToString(password.getBytes(StandardCharsets.UTF_8));

        }
    }
}

