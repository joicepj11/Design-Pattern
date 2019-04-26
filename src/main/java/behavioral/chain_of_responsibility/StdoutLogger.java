package behavioral.chain_of_responsibility;

public class StdoutLogger extends Logger {

    StdoutLogger(int mask) {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Writing message to stdout: "+message);
    }
}
