package hijas;

import herencia.SmartDevice;

public class SmartPhone extends SmartDevice {
   public int inches;
 public boolean wifi ;
   public String name;
    public SmartPhone() {

    }
    public SmartPhone(int inches,boolean wifi, String name,String origin,String manufacturer){
        super( origin, manufacturer);
        this.inches = inches;
        this.wifi = wifi;
        this.name = name;
    }
}
