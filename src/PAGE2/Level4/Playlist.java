package PAGE2.Level4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Playlist {
    private List<Cancion> myList;
    private ListIterator<Cancion> iterator;

    public Playlist() {
        myList = new LinkedList<>();
        iterator = myList.listIterator();
    }

    public void agregarCancion (Cancion song) {
        myList.add(song);
        iterator = myList.listIterator();
    }

    public Cancion cambiarSiguienteCancion () {
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return null;
    }

    public Cancion cambiarAnteriorCancion () {
        if (iterator.hasPrevious()) {
            return iterator.previous();
        }
        return null;
    }
}
