package PAGE1.Level3;

import java.util.ArrayList;
import java.util.List;

public class CrudTasks {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        tasks.add("Meditar");
        tasks.add("Ejercicio");
        tasks.add("Ducha fria");
        tasks.add("Ver tiktoks");
        tasks.add("Hacer journaling");

        for (String task : tasks) {
            System.out.println(task);
        }

        tasks.remove(3);
        for (String task : tasks) {
            System.out.println(task);
        }

        tasks.set(2, "Mejor agua calientita");

        for (String task : tasks) {
            System.out.println(task);
        }

    }
}
