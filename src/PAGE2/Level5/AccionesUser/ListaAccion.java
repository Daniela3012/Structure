package PAGE2.Level5.AccionesUser;

import java.util.ArrayDeque;
import java.util.Deque;


public class ListaAccion {
    private Deque<Accion> accionesHechas;
    private Deque<Accion> accionesDehechas;

    public ListaAccion(Accion a) {
        accionesHechas = new ArrayDeque<>();
        accionesDehechas = new ArrayDeque<>();
    }

    public void agregarAccion (Accion a) {
        accionesHechas.push(a);
        accionesDehechas.clear();
    }
    public void deshacerAccion () {
        if (!accionesHechas.isEmpty()) {
            Accion ultima = accionesHechas.pop();
            accionesDehechas.push(ultima);
        }
    }

    public void rehacerAccion () {
        if (!accionesDehechas.isEmpty()) {
            Accion accion = accionesDehechas.pop();
            accionesHechas.push(accion);
        }
    }
}
