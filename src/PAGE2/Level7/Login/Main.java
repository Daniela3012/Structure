package PAGE2.Level7.Login;

public class Main {
    public static void main(String[] args) {
        Login myLogin = new Login();
        myLogin.registrarUsuario("Daniela", "1234");

        System.out.println(myLogin.validarAcceso("Daniela", "sdfa"));
    }
}
