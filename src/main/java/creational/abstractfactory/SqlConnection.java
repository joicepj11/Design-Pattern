package creational.abstractfactory;

public class SqlConnection extends Connection {
    @Override
    public void connect() {
        System.out.println("opening new sql connection");
    }
}