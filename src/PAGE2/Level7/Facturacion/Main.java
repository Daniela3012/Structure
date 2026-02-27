package PAGE2.Level7.Facturacion;

public class Main {
    public static void main(String[] args) {
        Factura myFactura = new Factura();
        myFactura.addProducts("papas", 1.34);
        myFactura.addProducts("fsgdsdfg", 23.2);
        myFactura.addProducts("fsd",13.0);
        System.out.println(myFactura.calculateTotal());
        System.out.println(myFactura.showExpensiveProduct());
    }
}
