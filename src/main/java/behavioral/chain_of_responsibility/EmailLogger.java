package behavioral.chain_of_responsibility;

public class EmailLogger extends Logger {

    EmailLogger(int mask) {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Writing message to email: "+message);
    }
}
