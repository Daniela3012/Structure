package Level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ranking {
    public static void main(String[] args) {
        List<Integer> ranking = new ArrayList<>();
        Random rand = new Random();
        Integer longi = 10;
        for (int i = 0; i < longi; i++) {
            ranking.add(rand.nextInt(20)+1);
        }
        for (int i = 0; i < longi; i++) {
            System.out.print(ranking.get(i)+" ");
        }
        Integer helper = 0;
        Integer helper2 = 0;
        for (int i = 0; i < longi; i++) {
            for (int j = i+1; j < longi; j++) {
                helper = ranking.get(i);
                if (ranking.get(i)<ranking.get(j)) {
                    ranking.set((i), ranking.get(j));
                    ranking.set(j,helper);
                }
            }
        }
        System.out.println();
        for (int i = 0; i < longi; i++) {
            System.out.print(ranking.get(i)+ " ");
        }
    }
}
