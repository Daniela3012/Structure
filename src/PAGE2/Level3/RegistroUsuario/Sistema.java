package PAGE2.Level3.RegistroUsuario;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    protected List<Usuario> users;

    public Sistema() {
        users = new ArrayList<>();
    }

    public void agregarUsuario(Usuario u) {
        users.add(u);
    }

    public void eliminarUsuarioName (String name) {
        users.removeIf(p -> p.getNames() == name);
    }

    public void eliminarUsuarioLastName (String lastName) {
        users.removeIf(p -> p.getLastName() == lastName);
    }

}
