package structural.adapter;

public class Sockets {
    public Volts getVolts() {
        return new Volts(120);
    }
}