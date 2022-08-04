package lesson9;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Stream {
    public static void main(String[] args) {
        leerTodo();
    }
    public static void leerTodo() {
        try {
            InputStream fichero = new FileInputStream("/etc/passwd");

            try {
                byte []datos = fichero.readAllBytes();
                for (byte dato : datos) {
                    System.out.print((char)dato);
                }
                fichero.close();

            } catch (IOException e) {
                System.out.println("No puedo leerlo: " + e.getMessage());
            }


        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado: " + e.getMessage());
        }
    }
}
