package POO.Level1.TiendaOnline;

public class Main {
    public static void main(String[] args) {
        Producto kindle = new Producto("Kindle 6", 500);
        Cliente dani = new Cliente("Daniela");
        Carrito carr = new Carrito(dani);
        carr.addProduct(kindle);
        carr.showProducts();
    }
}
