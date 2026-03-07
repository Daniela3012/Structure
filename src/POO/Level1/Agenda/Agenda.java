package POO.Level1.Agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> myList;

    public Agenda () {
        myList = new ArrayList<>();
    }

    public Contacto addContact (String fullName, int numberPhone) {
        Contacto contact = new Contacto(fullName, numberPhone);
        myList.add(contact);
        return contact;
    }

    public int quantityContact () {
        return myList.size();
    }

    public Contacto removeContact (String fullName) {
        for (Contacto finder : myList) {
            if (finder.getFullName().equals(fullName)) {
                myList.remove(finder);
                return finder;
            }
        }
        return null;
    }

    public Contacto removeContact (int numberPhone) {
        for (Contacto finder : myList) {
            if (finder.getNumberPhone() == (numberPhone)) {
                myList.remove(finder);
                return finder;
            }
        }
        return null;
    }

    public void editContact (String fullName, String newName, int newNumber) {
        for (Contacto finder : myList) {
            if (finder.getFullName().equals(fullName)) {
                finder.setFullName(newName);
                finder.setNumberPhone(newNumber);
                break;
            }
        }
    }

    public void showContacts () {
        for (Contacto c : myList ) {
            System.out.println("Contacto : "+c.getFullName()+" , "+c.getNumberPhone());
        }
    }

    public int findNumberByName (String fullName) {
        for (Contacto c: myList) {
            if (c.getFullName().equals(fullName)) {
                return c.getNumberPhone();
            }
        }
        return -1;
    }

}
