package PAGE1.Level4;

import java.util.LinkedList;
import java.util.Queue;

public class FilaAtencion {
    public static void main(String[] args) {
        Queue<String> people = new LinkedList<>();
        //Llegada de personas
        people.add("Persona1");
        people.add("Persona2");
        people.add("Persona3");

        for (String p: people) {
            System.out.print(p+" ");
        }
        people.add("Persona4");
        System.out.println();
        for (String p: people) {
            System.out.print(p+" ");
        }
        people.offer("Persona5");
        System.out.println();
        System.out.println(people.peek());;

        people.poll();
        System.out.println(people.peek());

        System.out.println();
        for (String p: people) {
            System.out.print(p+" ");
        }

        people.poll();
        people.poll();

        System.out.println();
        for (String p: people) {
            System.out.print(p+" ");
        }



    }
}
