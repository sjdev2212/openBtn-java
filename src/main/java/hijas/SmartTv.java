package hijas;

import herencia.SmartDevice;

public class SmartTv extends SmartDevice {
    public boolean android;
public SmartTv () {

}

    public SmartTv(boolean android,String origin, String manufacturer) {
    super(origin, manufacturer);
    this.android = android;

    }
}
