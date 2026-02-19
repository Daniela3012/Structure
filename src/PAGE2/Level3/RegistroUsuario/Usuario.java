package PAGE2.Level3.RegistroUsuario;

public class Usuario {
    protected String names;
    protected String lastName;

    public Usuario(String names, String lastName) {
        this.names = names;
        this.lastName = lastName;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
