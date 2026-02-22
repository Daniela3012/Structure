package PAGE2.Level6.TurnoMedico;

public class Main {
    public static void main(String[] args) {
        FilaAtencion llegadaACita = new FilaAtencion();
        llegadaACita.agregarPacienteAFila(new Paciente("Danie"));
        llegadaACita.agregarPacienteAFila(new Paciente("Roman"));
        llegadaACita.agregarPacienteAFila(new Paciente("Ale"));
        llegadaACita.agregarPacienteAFila(new Paciente("Yolu"));
        llegadaACita.agregarPacienteAFila(new Paciente("Karen"));
        llegadaACita.agregarPacienteAFila(new Paciente("Cesar"));
        llegadaACita.agregarPacienteAFila(new Paciente("Jair"));


        llegadaACita.mostrarSiguientePaciente();
        llegadaACita.atenderPacientePorOrden();
        llegadaACita.mostrarSiguientePaciente();
        llegadaACita.atenderPacientePorOrden();
        llegadaACita.atenderPacientePorOrden();
        llegadaACita.mostrarSiguientePaciente();
        System.out.println("Se atendieron en total "+llegadaACita.cantidadDePacientesAtendidos());
        System.out.println("Restan por atender "+llegadaACita.quedanPorAtender());
        System.out.println("En total vinieron "+llegadaACita.getTotalDePaciente());
    }
}
