package creational.abstractfactory;

public class SqlTransaction extends Transaction {
    @Override
    public void transact() {
        System.out.println("committing the sql db transaction");
    }
}