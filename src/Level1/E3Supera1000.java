package Level1;

public class E3Supera1000 {
    public static void main(String[] args) {
        double[] mountsShop = {1234.45, 123312.342, 100};
        double pasanDeMil;
        for (double m : mountsShop) {
            if (m>1000) {
                System.out.println("El producto "+m+" pasa los 1000 soles");
            }
        }
    }
}
