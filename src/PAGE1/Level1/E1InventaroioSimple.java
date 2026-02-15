package PAGE1.Level1;

import java.util.Random;

public class E1InventaroioSimple {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] stock = new int[10];

        int productMayor=0;
        int prodyctMenor=0;

        for (int i = 0; i < stock.length; i++) {
            stock[i] = rand.nextInt(100);
        }
        int menorProductStock = stock[0];
        int mayorProductStock = stock[0];
        for (int i = 0; i < stock.length; i++) {
            System.out.print(stock[i] + " ");
            if (mayorProductStock<stock[i]) {
                mayorProductStock = stock[i];
                productMayor=i+1;
            }
            if (menorProductStock>stock[i]) {
                menorProductStock = stock[i];
                prodyctMenor=i+1;
            }
        }
        System.out.println();
        System.out.println("El producto con mayor cantidad es "+productMayor+" y tiene "+mayorProductStock+" en stock");
        System.out.println("El producto con menor cantidad es "+prodyctMenor+" tiene "+menorProductStock+" en stock");

    }

}
