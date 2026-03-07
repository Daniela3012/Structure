package POO.Level1.SistemaNotas;

public class Nota {
    private Estudiante student;
    private Curso course;
    private double value;

    public Nota(Estudiante student, Curso course, double value) {
        this.student = student;
        this.course = course;
        this.value = value;
    }

    public Estudiante getStudent() {
        return student;
    }

    public Curso getCourse() {
        return course;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
