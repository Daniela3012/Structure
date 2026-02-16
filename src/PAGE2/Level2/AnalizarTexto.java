package PAGE2.Level2;

public class AnalizarTexto {
    private String text;
    private char[] total;
    private String[] words;
    private int contadorVocal = 0;
    private int contadorLetraRepetida = 0;
    private int longitudTotal = 0;

    public AnalizarTexto(String texto) {
        this.total = texto.toCharArray();
        this.text = texto;
    }

    public int contarVocal() {
        int contador = 0;
        for (char c: total) {
            char x = Character.toLowerCase(c);
            if (x == 'a' || x =='e' || x == 'i' || x == 'o' || x== 'u') {
                contador++;
            }
        }
        return this.contadorVocal = contador;
    }

    public int contarPalabras() {
        words = text.split(" ");
        return words.length;
    }

    public void contarLetraRepetida () {
        int c = 0;
        char[] totalConvertido = text.toLowerCase().toCharArray();
        int indice = 0;
        int helper = 0;
        for (int i = 0; i < totalConvertido.length; i++) {
            helper = 0;
            for (int j = 0; j < totalConvertido.length; j++) {
                if (totalConvertido[j] !=' ') {
                    if (totalConvertido[j] == totalConvertido[i]) {
                        helper++;
                    }
                }
            }
            if (c<helper) {
                c = helper;
                indice = i;
            }
        }
        System.out.println("La letra mas repetida es : "+totalConvertido[indice]);
        System.out.println("La cantidad de repeticion que tiene es : "+c);
        System.out.println("imprimeee");
    }

    public static void main(String[] args) {
        AnalizarTexto myText = new AnalizarTexto("ddd ffff xx vvv xxxxxx");
       myText.contarLetraRepetida();
    }
}
