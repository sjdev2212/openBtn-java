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

        ArrayList<Integer> myList = new ArrayList<>();

        int counter = 1;
        while (counter <= 10) {
            myList.add(counter);
            counter++;
        }
        System.out.println(myList);


        for (int i = 0; i < myList.size() ;i++) {
            if (myList.get(i) % 2 == 0 ) {
                myList.remove(myList.get(i));
            }
    }
        System.out.println(myList);

    }
}
