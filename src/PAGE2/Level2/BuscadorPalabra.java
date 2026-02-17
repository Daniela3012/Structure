package PAGE2.Level2;

import java.sql.SQLOutput;

public class BuscadorPalabra {

    public static void main(String[] args) {
        String text = "dani,dani,dylan,jeff,cristhiam,alexis,dylan,dylan,dylan";
        String[] nombres = text.split(",");
        int repetido = 0;
        int helper = 0;
        String nombreRepetido;
        System.out.println("Mostrando los unicos");
        for (int i = 0; i < nombres.length ; i++) {
            repetido = 0;
            for (int j = 0; j < nombres.length; j++) {
                if (nombres[i].equals(nombres[j])) {
                    repetido++;
                }
            }
            if (repetido==1) {
                System.out.print(nombres[i]+" ");
            }

            if (repetido>1){
                if (helper == 1) {
                    System.out.println();
                    System.out.println("El nombre repetido es : "+nombres[i]);
                    helper = 0;
                }
            }
        }

    }
}
