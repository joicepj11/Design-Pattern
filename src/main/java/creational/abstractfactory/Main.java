package creational.abstractfactory;

public class Main {

    public static void main(String[] args) {
        transact(new SqlFactory());
        transact(new OracleFactory());
    }

    private static void transact(DbFactory dbFactory) {
        Connection connection = dbFactory.createConnection();
        connection.connect();
        Command command = dbFactory.createCommand();
        ResultSet resultSet =command.Execute();
        resultSet.hasNext();
        Transaction transaction = dbFactory.createTransaction();
        transaction.transact();
    }
}