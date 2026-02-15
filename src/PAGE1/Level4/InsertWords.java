package PAGE1.Level4;

import java.util.LinkedList;
import java.util.Queue;

public class InsertWords {
    public static void main(String[] args) {
        Queue<String> words = new LinkedList<>();
        words.offer("xd");
        words.offer("xxx");
        words.offer("ddd");
        words.offer("###");

        System.out.println(words.peek());
        System.out.println();
        for (String word: words) {
            System.out.print(word+"  ");
        }
    }
}
