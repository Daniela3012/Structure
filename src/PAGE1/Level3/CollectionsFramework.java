package PAGE1.Level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsFramework {
    public static void main(String[] args) {
        List<Integer> ranking = new ArrayList<>();
        Random rand = new Random();
        Integer longi = 10;
        for (int i = 0; i < longi; i++) {
            ranking.add(rand.nextInt(20)+1);
        }

        for (int i = 0; i < longi ; i++) {
            System.out.print(ranking.get(i) + " ");
        }
        System.out.println();
        ranking.add(ranking.size(),30);
        for (int i = 0; i < ranking.size() ; i++) {
            System.out.print(ranking.get(i) + " ");
        }
        //lo ordena solo ya que no devuelve nada pero esto quiere decir que lo ordena internamente y modifica la lista, pero ...
        // no crea uno nuevo
        Collections.sort(ranking, Collections.reverseOrder());

        System.out.println();
        for (int i = 0; i < longi; i++) {
            System.out.print(ranking.get(i)+" ");
        }
    }
}
