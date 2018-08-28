package structural.adapter.objectadapter;

import structural.adapter.ISocketAdapter;
import structural.adapter.Sockets;
import structural.adapter.Volts;

public class SocketsObjectAdapterImpl implements ISocketAdapter {
    //using composition
    private Sockets sockets = new Sockets();
    @Override
    public Volts get120Volts() {
        return sockets.getVolts();
    }

    @Override
    public Volts get12Volts() {
        return convertVolts(sockets.getVolts(),10);
    }

    @Override
    public Volts get3Volts() {
        return convertVolts(sockets.getVolts(),40);
    }

    private Volts convertVolts(Volts volts,int i) {
        if(i==0 || volts.getVolts() <=0 )
            return null;
        return new Volts(volts.getVolts() / i);
    }
}