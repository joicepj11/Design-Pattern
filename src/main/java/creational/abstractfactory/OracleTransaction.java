package creational.abstractfactory;

public class OracleTransaction extends Transaction {
    @Override
    public void transact() {
        System.out.println("Committing the oracle db transaction ");
    }
}