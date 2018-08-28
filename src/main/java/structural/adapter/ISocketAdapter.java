package structural.adapter;

public interface ISocketAdapter {
    Volts get120Volts();
    Volts get12Volts();
    Volts get3Volts();
}