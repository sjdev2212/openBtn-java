package lesson9;
import java.util.*;

public class ArrListEx {
    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<>();
        myArrList.add("Joaquin");
        myArrList.add("Sofia");
        myArrList.add("Jesica");
        myArrList.add("Bruno");
        for (String elemento :myArrList) {
            System.out.println("Elemento actual en la lista enlazada: " + elemento);
        }

        LinkedList<String> listaEnlazadaDos = new LinkedList<>(myArrList);
        for (String elemento :listaEnlazadaDos) {
            System.out.println("Elemento actual en la lista enlazada: " + elemento);
        }
    }
}
