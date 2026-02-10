package Level4;
import java.util.LinkedList;
import java.util.List;

public class HistorialNav {
    public static void main(String[] args) {
        List<String> historial = new LinkedList<>();
        historial.add("Google.com");
        historial.add(1,"x.com");
        System.out.println("---");
        for (String web: historial) {
            System.out.print(web+" ");
        }
        System.out.println("-----------");
        historial.add("Youtube.com");
        historial.add("yape.com.pe");
        for (String web: historial) {
            System.out.print(web+" ");
        }
        System.out.println();
        historial.add(3, "instagram.com");
        for (String web: historial) {
            System.out.print(web+" ");
        }
        System.out.println();
        historial.add(3, "java.com");
        for (String web: historial) {
            System.out.print(web+" ");
        }
        System.out.println();
        historial.add(0,"holaxd");
        for (String web: historial) {
            System.out.print(web+" ");
        }
        System.out.println();
        historial.remove(historial.size()-1);
        for (String web: historial) {
            System.out.print(web+" ");
        }
    }
}
