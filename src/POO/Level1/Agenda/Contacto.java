package POO.Level1.Agenda;

public class Contacto {
    private String fullName;
    private int numberPhone;

    public Contacto(String fullName, int numberPhone) {
        this.fullName = fullName;
        this.numberPhone = numberPhone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }
}
