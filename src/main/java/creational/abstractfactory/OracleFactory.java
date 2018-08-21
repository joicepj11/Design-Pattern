package creational.abstractfactory;

public class OracleFactory extends DbFactory {
    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }

    @Override
    public Command createCommand() {
        return new OracleCommand();
    }

    @Override
    public Transaction createTransaction() {
        return new OracleTransaction();
    }
}