package ejercicio3;

public class Concat {
    public static void main(String[] args) {
        String[] palabras = {"gracias","open","bootcamp","por","enseñarme","Java"};
        String concato = "";
        for (String word : palabras) {
            concato  += word;
        }
        System.out.println(concato);
    }
}
