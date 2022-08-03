package lesson9;

import java.util.Arrays;

public class DatosAvanzado {
    public static void main(String[] args) {
        System.out.println( reverse("lesson9"));
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        recorrerArr(intArray);


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

public static void recorrerArr (int[] arr){

    for (int j : arr) {
        System.out.println(j);
    }
}
}