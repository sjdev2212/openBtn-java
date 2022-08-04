package lesson9;
import java.util.*;

public class Array {
    public static void main(String[] args) {
      demoArrays();
    }

    @SuppressWarnings("ManualArrayCopy")
    public static void demoArrays() {
      int [][]arrayBidiUno = new int[2][4];


        arrayBidiUno[0][0] = 100;
        arrayBidiUno[0][1] = 200;
        arrayBidiUno[0][2] = 300;
        arrayBidiUno[0][3] = 400;

        arrayBidiUno[1][0] = 500;
        arrayBidiUno[1][1] = 600;
        arrayBidiUno[1][2] = 700;
        arrayBidiUno[1][3] = 800;

        // Recorrer un array bidimensional:
        for (int i = 0; i < arrayBidiUno.length; i++) {
            for (int j = 0; j < arrayBidiUno[i].length; j++) {
                System.out.println("Posición: [" + i + "][" + j + "] y contiene el valor " + arrayBidiUno[i][j]);
            }
        }




}

     }

