package PAGE2.Level1;

import java.util.Random;

public class Inventario {
    private int cantidadProductos = 8;
    private int minimoStock = 3;
    private int maximiStock = 30;

    public boolean restarVentas(int[] productos, int producto, int cantidadProducto) {
        int buscarIndiceProducto = producto-1;
        if (productos[buscarIndiceProducto] >= 0 && productos[buscarIndiceProducto]>=cantidadProducto) {
            productos[buscarIndiceProducto] -= cantidadProducto;
            return true;
        } else {
            return false;
        }
    }

    public int[] detectarSinStock(int[] productos) {
        for (int i = 0; i <productos.length ; i++) {
            if (productos[i]==0) {
                productos[i]=maximiStock;
            }
        }
        return productos;
    }

    public int[] reponerProductosBajos(int[] productos) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] <= minimoStock && productos[i]>0) {
                productos[i] = 15;
            }
        }
        return productos;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void mostrarProductosConsola(int[] productos) {
        for (int i = 0; i < productos.length; i++) {
            System.out.print(productos[i]+"  ");
        }
    }

    public static void main(String[] args) {
        Inventario myInventary = new Inventario();
        Random rand = new Random();
        int[] myProducts = new int[myInventary.getCantidadProductos()];
        for (int i = 0; i <myProducts.length ; i++) {
            myProducts[i] = rand.nextInt(myInventary.getCantidadProductos()+1);
        }
        myInventary.mostrarProductosConsola(myProducts);
        System.out.println();
        myInventary.restarVentas(myProducts,4,3);
        myInventary.mostrarProductosConsola(myProducts);
        System.out.println();
        myInventary.detectarSinStock(myProducts);

        myInventary.mostrarProductosConsola(myProducts);
        myInventary.reponerProductosBajos(myProducts);
        System.out.println();
        myInventary.mostrarProductosConsola(myProducts);
    }
}
