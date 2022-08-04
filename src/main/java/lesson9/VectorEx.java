package lesson9;
import java.util.*;
public class VectorEx {
    public static void main(String[] args) {
    Vector <Integer> myVector = new Vector<>();
    myVector.add(1000);
    myVector.add(2000);
    myVector.add(3000);
    myVector.add(4000);
    myVector.add(5000);
    System.out.println(myVector);
    myVector.remove(1);
        myVector.remove(2);
        System.out.println(myVector);

    }
}
