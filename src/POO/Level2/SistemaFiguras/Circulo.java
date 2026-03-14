package POO.Level2.SistemaFiguras;

public class Circulo extends Figura{
    private double radio;

    public Circulo (double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return 3.14*radio*radio;
    }

    @Override
    double calcularPerimetro() {
        return 2*3.14*radio;
    }
}
