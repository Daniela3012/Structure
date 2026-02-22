package PAGE2.Level6.TurnoMedico;
import java.util.ArrayDeque;
import java.util.Queue;

public class FilaAtencion {
    private Queue<Paciente> fila;
    private int totalDePaciente=0;

    public FilaAtencion () {
        fila = new ArrayDeque<>();
    }

    public void agregarPacienteAFila(Paciente p) {
        fila.offer(p);
        totalDePaciente += 1;
        p.setorderAssociete(totalDePaciente);
    }

    public Paciente atenderPacientePorOrden () {
        return fila.poll();
    }

    public void mostrarSiguientePaciente () {
        Paciente siguiente = fila.peek();
        if (siguiente == null) {
            System.out.println("No hay mas clientes en espera");
        } else {
            System.out.println("El paciente "+siguiente.getName()+" está en el orden "+siguiente.getOrderAssociete());
        }
    }

    public int cantidadDePacientesAtendidos () {
        return totalDePaciente-fila.size();
    }

    public int quedanPorAtender () {
        return fila.size();
    }

    public int getTotalDePaciente() {
        return totalDePaciente;
    }

}
