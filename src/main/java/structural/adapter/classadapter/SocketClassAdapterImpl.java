package structural.adapter.classadapter;

import structural.adapter.ISocketAdapter;
import structural.adapter.Sockets;
import structural.adapter.Volts;

public class SocketClassAdapterImpl extends Sockets implements ISocketAdapter {

    @Override
    public Volts get120Volts() {
        return getVolts();
    }

    @Override
    public Volts get12Volts() {
        return convertVolts(getVolts() ,10);
    }

    @Override
    public Volts get3Volts() {
        return convertVolts(getVolts() ,40);
    }

    private Volts convertVolts(Volts volts,int i) {
        if(i==0 || volts.getVolts() <=0 )
            return null;
        return new Volts(volts.getVolts() / i);
    }
}