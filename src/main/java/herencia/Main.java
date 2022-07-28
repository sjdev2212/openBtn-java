package herencia;

import hijas.SmartPhone;
import hijas.SmartTv;

public class Main {
    public static void main(String[] args) {

        SmartDevice movile = new SmartDevice("china","samsung");
        SmartPhone galaxy = new SmartPhone(33,true,"A30","China","Samsung");
        SmartTv giant = new SmartTv(false,"CHina","sonny");
        System.out.println(movile);
        System.out.println(movile.origin);
        System.out.println(movile.manufacturer);
        System.out.println(galaxy.manufacturer);
        System.out.println(galaxy.wifi);
        System.out.println(galaxy.name);
        System.out.println(galaxy.inches);
        System.out.println(giant.android);
        System.out.println(giant.manufacturer);
        System.out.println(giant.origin);

    }
}
