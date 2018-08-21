package creational.abstractfactory;

public class OracleResultSet extends ResultSet {
    @Override
    public void hasNext() {
        System.out.println("Returning result from oracle db ");
    }
}