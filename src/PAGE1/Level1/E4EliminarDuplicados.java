package PAGE1.Level1;

import java.util.Random;

public class E4EliminarDuplicados {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] ids = new int[100];
        int[] repetidos = new int[100];
        int helper;
        int counter;
        int cantidadDeRepetidos = 0;
        for (int i = 0; i < ids.length; i++) {
            ids[i] = rand.nextInt(30)+1;
        }
        for (int i = 0; i < ids.length; i++) {
            helper = ids[i];
            counter = 0;
            for (int j = 0; j < ids.length; j++) {
                if (i != j ) {
                   if ( helper == ids[j]) {
                       counter++;
                   }
                }
            }
            if (counter>1) {
                repetidos[i] = helper;
            } else {
                repetidos[i] = 0;
            }
        }
        for (int i = 0; i < repetidos.length; i++) {
            if (repetidos[i]>0) {
                cantidadDeRepetidos++;
            }
        }
        int[] newIDs = new int[cantidadDeRepetidos];
        for (int i = 0; i < newIDs.length; i++) {
            System.out.print(newIDs[i]+" ");
        }
    }
}
