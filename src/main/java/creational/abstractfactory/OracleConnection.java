package creational.abstractfactory;

public class OracleConnection extends Connection {
    @Override
    public void connect() {
        System.out.println("Opening new connection from oracle db");
    }
}