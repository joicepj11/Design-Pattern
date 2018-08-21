package creational.abstractfactory;

public class SqlFactory extends DbFactory {
    @Override
    public Connection createConnection() {
        return new SqlConnection();
    }

    @Override
    public Command createCommand() {
        return new SqlCommand();
    }

    @Override
    public Transaction createTransaction() {
        return new SqlTransaction();
    }
}