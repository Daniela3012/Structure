package PAGE2.Level7.Login;

import java.util.HashMap;
import java.util.Map;

public class Login {
    private Map<String,String> users;

    public Login () {
        users = new HashMap<>();
    }

    public Usuario registrarUsuario(String user, String password) {
        Usuario newUser = new Usuario(user, password);
        if (!users.containsKey(newUser.getUser())) {
            users.put(newUser.getUser(), newUser.getPassword());
            return newUser;
        }
        return null;
    }

    public boolean validarAcceso (String user, String password) {
        if (users.containsKey(user)) {
            if (users.get(user).equals(password)) {
                return true;
            }
        }
        return false;
    }
}
