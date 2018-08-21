package creational.abstractfactory;

public  abstract class DbFactory {
    public abstract Connection createConnection();
    public abstract Command createCommand();
    public abstract Transaction createTransaction();
}