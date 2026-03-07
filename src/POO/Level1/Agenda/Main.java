package POO.Level1.Agenda;

public class Main {
    public static void main(String[] args) {
        Agenda miagenda = new Agenda();
        miagenda.addContact("Dylan", 94356787);
        miagenda.addContact("Daniel", 943049503);
        miagenda.addContact("Carlos", 948382299);
        miagenda.showContacts();
        miagenda.findNumberByName("Dylan");
        miagenda.removeContact("Carlos");
        miagenda.showContacts();


    }
}
