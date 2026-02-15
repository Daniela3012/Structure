package PAGE2.Level1;

import java.util.Random;

public class Temperatura {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] temperatures = new double[7];
        double prom = 0;
        int danger = 0;
        for (int i = 0; i <temperatures.length ; i++) {
            temperatures[i] = rand.nextDouble(45);
            temperatures[i] = Math.round(temperatures[i]*100.0)/100.0;
            prom += temperatures[i];
            if (temperatures[i]>40) {
                danger++;
            }
        }
        prom=prom/temperatures.length;
        prom=Math.round(prom*100.0)/100.0;
        System.out.println("El promedio es : "+prom);
        System.out.println("Cantidad de dias peligrosos : "+danger);
        for (double t: temperatures){
            System.out.print(t+" ");
        }
    }
}
