package creational.abstractfactory;

public class SqlCommand extends Command {
    @Override
    public ResultSet Execute() {
        System.out.println("Returning result set from sql command");
        return new SqlResultSet();
    }
}