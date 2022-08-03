package lesson9;

import java.util.Arrays;

public class DatosAvanzado {
    public static void main(String[] args) {
        System.out.println( reverse("lesson9"));


    }

    public static String reverse(String text) {
        String[] ary = text.split("");
        int n = ary.length;
        String[] b = new String[n];
        int j = n;
        for (String s : ary) {
            b[j - 1] = s;
            j = j - 1;

        }
       return Arrays.toString(b).join("",b);
    }
}