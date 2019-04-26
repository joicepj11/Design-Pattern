package behavioral.chain_of_responsibility;

public abstract class Logger {
    static int ERR = 7;
    static int NOTICE =5;
    static int DEBUG = 3;
    int mask ;

    private Logger next;

    Logger nextLogger(Logger logger) {
        next = logger;
        return logger;
    }

    void message(int priority,String message){
        if(priority <= mask){
            writeMessage(message);
            return;
        }
        if(next != null){
            next.message(priority,message);
        }
    }

    protected abstract void writeMessage(String message);
}