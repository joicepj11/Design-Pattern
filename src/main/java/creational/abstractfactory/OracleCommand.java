package creational.abstractfactory;


public class OracleCommand extends Command {
    @Override
    public ResultSet Execute() {
        System.out.println("Executed result set");
        return new OracleResultSet();
    }
}