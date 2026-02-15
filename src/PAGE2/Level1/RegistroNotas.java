package PAGE2.Level1;

import java.util.Random;

public class RegistroNotas {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] notas = new int[10];
        double prom = 0;
        for (int i = 0; i <notas.length ; i++) {
            notas[i]=rand.nextInt(21);
            prom += notas[i];
            System.out.print(notas[i]+" ");
        }
        prom = prom/notas.length;
        double promRedondeado = Math.round(prom*100.0)/100.0;
        System.out.println();
        int notaMayor = notas[0];
        int notaMenor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i]>notaMayor) {
                notaMayor = notas[i];
            }
            if (notas[i]<notaMenor) {
                notaMenor = notas[i];
            }
        }
        System.out.println("El promedio de notas es: "+promRedondeado);
        System.out.println("La nota mayor es: "+notaMayor);
        System.out.println("La nota menor es: "+notaMenor);

    }
}
