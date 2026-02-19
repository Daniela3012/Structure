package PAGE2.Level3.Carrito;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> carrito = new ArrayList<>();
        carrito.add(new Producto("New Balannce", 100));
        carrito.add(new Producto("Amazon kinle", 500));
        carrito.add(new Producto("dylan", 399));
        carrito.add(new Producto("dylan", 399));
        carrito.add(new Producto("dylan", 399));

        //mostrar
        for (Producto p : carrito) {
            System.out.println(p.getNombre()+ "  ");
        }

        //eliminar
        carrito.removeIf(p -> p.getNombre().equals("dylan"));

        //calcular total
        double total = 0;
        for (Producto p: carrito) {
            total = total + p.getPrice();
        }
        System.out.println();
        System.out.println("El total es : "+total);
        System.out.println();
        for (Producto p : carrito) {
            System.out.println(p.getNombre()+ "  ");
        }

    }
}
