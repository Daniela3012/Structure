package PAGE1.Level1;

import java.util.Random;

public class E2PromedioVentas {
        public static void main(String[] args) {
            Random rand = new Random();
            int[] ventas = new int[30];

            int productMayor=0;
            int promedio=0;

            for (int i = 0; i < ventas.length; i++) {
                ventas[i] = rand.nextInt(100);
            }
            int mayorProductVentas = ventas[0];
            for (int i = 0; i < ventas.length; i++) {
                System.out.print(ventas[i] + " ");
                if (mayorProductVentas<ventas[i]) {
                    mayorProductVentas = ventas[i];
                    productMayor=i+1;
                }
                promedio=promedio+ventas[i];
            }
            double promedioReal = (double) promedio /(ventas.length);
            System.out.println();
            System.out.println("El producto con mayor cantidad de ventas es "+productMayor+" y tiene "+mayorProductVentas+" unidades vendidas");
            System.out.println("El promedio de ventas es "+ promedioReal);
    }
}
