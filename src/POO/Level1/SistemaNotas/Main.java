package POO.Level1.SistemaNotas;

public class Main {
    public static void main(String[] args) {
        Curso math = new Curso("Matematica");
        Curso physis = new Curso("Fisica");
        Curso comunication = new Curso("Comunicacion");
        Curso art = new Curso("Arte");

        Estudiante dylan = new Estudiante("Dylan");
        dylan.establecerNota(math, 20);
        dylan.establecerNota(physis, 10);

        Estudiante dani = new Estudiante("Daniela");
        dani.establecerNota(math, 20);
        dani.establecerNota(art,20);

        System.out.println("Promedio de "+dani.getName()+" es: "+dani.calularPromedio());
        System.out.println("Promedio de "+dylan.getName()+" es: "+dylan.calularPromedio());

        dani.mostrarCursosYNotas();
        dylan.mostrarCursosYNotas();

    }
}
