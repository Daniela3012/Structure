package PAGE2.Level1;

import java.util.Random;
import java.util.Scanner;

public class AsientosCine {
    public static void main(String[] args) {
        Random rand = new Random();
        AsientosCine chair = new AsientosCine();
        int[] asientos = new int[20];
        for (int i = 0; i <asientos.length ; i++) {
            asientos[i] = rand.nextInt(2);
        }

        System.out.println("Mostrando todo");
        chair.conteoAsientosConsola(asientos);
        chair.mostrarAsientos(asientos);
        chair.reservarAsiento(asientos,7);
        chair.conteoAsientosConsola(asientos);
        chair.liberarAsiento(asientos,3);
        chair.mostrarAsientos(asientos);
        chair.conteoAsientosConsola(asientos);

    }

    public int[] conteoAsientos(int[] asientos){
        int[] conteo = new int[2];
        int vacios = 0;
        int ocupados = 0;
        for (int i = 0; i <asientos.length ; i++) {
            if (asientos[i] == 0) {
                vacios++;
            }
            if (asientos[i] == 1) {
                ocupados++;
            }
        }
        conteo[0]=vacios;
        conteo[1]=ocupados;
        return conteo;
    }

    public void conteoAsientosConsola(int[] asientos) {
        int[] conteo = new int[2];
        int vacios = 0;
        int ocupados = 0;
        for (int i = 0; i <asientos.length ; i++) {
            if (asientos[i] == 0) {
                vacios++;
            }
            if (asientos[i] == 1) {
                ocupados++;
            }
        }
        conteo[0]=vacios;
        conteo[1]=ocupados;
        System.out.println();
        System.out.println("Total de asientos vacios "+vacios);
        System.out.println("Total de asientos ocupados "+ocupados);
        System.out.println();
    }

    public boolean reservarAsiento(int[] asientos, int asientoDeseado) {
        int buscarEnAsientos = asientoDeseado-1;
        if (asientos[buscarEnAsientos] == 1) {
            return false;
        } else {
            asientos[buscarEnAsientos]=1;
            return true;
        }
    }

    public void mostrarAsientos (int[] asientos) {
        for (int a: asientos) {
            System.out.print(a+" ");
        }
    }

    public void liberarAsiento(int[] asientos, int asientoALiberar) {
        int buscarAsientoALiberar = asientoALiberar-1;
        if (asientos[buscarAsientoALiberar] == 1) {
            asientos[buscarAsientoALiberar] = 0;
        }
    }
}
