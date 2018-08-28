package structural.adapter;

import structural.adapter.classadapter.SocketClassAdapterImpl;
import structural.adapter.objectadapter.SocketsObjectAdapterImpl;

public class Main {
    public static void main(String[] args) {
        ISocketAdapter adapter = new SocketClassAdapterImpl();
        System.out.println("Class adapter calling for 3 volts "+adapter.get3Volts().getVolts());
         adapter = new SocketsObjectAdapterImpl();
        System.out.println("Object adapter calling for 12 volts "+adapter.get12Volts().getVolts());
        System.out.println("Object adapter calling for 120 volts "+adapter.get120Volts().getVolts());
    }
}