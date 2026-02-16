package PAGE2.Level2;

public class ValidadorPassword {
    private char[] passwordChar;
    private boolean longitud;

    public ValidadorPassword(String password) {
        this.passwordChar = password.toCharArray();
    }

    public boolean validacionLongitud() {
        return passwordChar.length >= 8;
    }

    public boolean validacionNumbers () {
        for (char c : passwordChar) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean validacionUpperCase () {
        for (char c : passwordChar) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean validacionCompleta () {
        return validacionNumbers() && validacionUpperCase() && validacionLongitud();

    }

    public static void main(String[] args) {
        ValidadorPassword myPass = new ValidadorPassword("1DDDD");
        System.out.println(myPass.validacionCompleta());
    }
}
