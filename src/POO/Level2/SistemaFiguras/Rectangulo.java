package POO.Level2.SistemaFiguras;

public class Rectangulo extends Figura {
    private double altura;
    private double largo;

    public Rectangulo(double altura, double largo) {
        this.altura = altura;
        this.largo = largo;
    }

    @Override
    double calcularArea() {
        return altura*largo;
    }

    @Override
    double calcularPerimetro() {
        return 2*(largo+altura);
    }
}
