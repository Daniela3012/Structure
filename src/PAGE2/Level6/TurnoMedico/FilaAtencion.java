package PAGE2.Level6.TurnoMedico;
import java.util.ArrayDeque;
import java.util.Queue;

public class FilaAtencion {
    private Queue<Paciente> fila;
    private static int totalDePaciente=0;

    public FilaAtencion () {
        fila = new ArrayDeque<>();
    }

    public void agregarPacienteAFila(Paciente p) {
        fila.offer(p);
        totalDePaciente += 1;
    }

    public Paciente atenderPacientePorOrden () {
        return fila.poll();
    }

    public void mostrarSiguientePaciente () {
        System.out.println("El paciente "+fila.peek().getName()+" está en el orden "+fila.peek().getOrderAssociete());
    }

    public int cantidadDePacientesAtendidos () {
        return totalDePaciente-fila.size();
    }

    public int quedanPorAtender () {
        return fila.size();
    }

    public int getTotalDePaciente() {
        return FilaAtencion.totalDePaciente;
    }

}
