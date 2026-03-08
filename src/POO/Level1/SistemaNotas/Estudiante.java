package POO.Level1.SistemaNotas;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String name;
    private List<Nota> notas;

    public Estudiante(String name) {
        this.name = name;
        notas = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void establecerNota ( Curso curso, double nota) {
        Nota notaNueva = new Nota(this, curso, nota);
        notas.add(notaNueva);
    }

    public double calularPromedio () {
        double prom = 0;
        if (notas.isEmpty()) {
            return -1;
        } else {
            for (Nota n : notas) {
                prom = prom+n.getValue();
            }
            prom = prom/notas.size();
        }
        return prom;
    }

    public void mostrarCursosYNotas () {
        System.out.println("Estdiante "+name+" tiene los siguientes cursos y notas");
        for (Nota n : notas) {
            System.out.println("Curso: "+n.getCourse().getName()+" - Nota: "+n.getValue());
        }
    }

}
