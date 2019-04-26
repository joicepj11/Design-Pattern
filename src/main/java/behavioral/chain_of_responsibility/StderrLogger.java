package behavioral.chain_of_responsibility;

public class StderrLogger extends Logger {

    StderrLogger(int mask) {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Writing message to stderr: "+message);
    }
}
