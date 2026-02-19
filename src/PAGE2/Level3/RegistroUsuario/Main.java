package PAGE2.Level3.RegistroUsuario;

public class Main {
    public static void main(String[] args) {
        Sistema mySis = new Sistema();
        mySis.agregarUsuario(new Usuario("dylan", "torta"));

        mySis.agregarUsuario(new Usuario("xxx", "xxxxx"));

        mySis.eliminarUsuarioName("dylan");


    }
}
