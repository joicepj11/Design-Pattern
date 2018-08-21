package creational.abstractfactory;

public class SqlResultSet extends ResultSet {
    @Override
    public void hasNext() {
        System.out.println("reading result set values from sql ");
    }
}