package PAGE2.Level1;

public class ListaPrecios {
    public static void main(String[] args) {
        double[] prices = new double[20];
        double total = 0;
        int productosSuperanLimite = 0;
        for (int i = 0; i <prices.length ; i++) {
            double num = Math.random()*50;
            num = Math.round(num*100)/100;

            prices[i] = num;
            System.out.print(prices[i]+" ");
            total += prices[i];
        }
        System.out.println();
        System.out.println("El monto total a pagar es: "+total);
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]>20) {
                productosSuperanLimite++;
                System.out.println("El producto "+(i+1)+" supera el limite establecido de gasto");
            }
        }
        System.out.println("La cantidad de productos que superan el limite es : "+productosSuperanLimite);

    }
}
