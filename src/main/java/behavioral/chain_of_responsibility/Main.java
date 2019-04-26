package behavioral.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Logger logger,logger2,logger3;
        logger = new StdoutLogger(Logger.DEBUG);
        logger2 = logger.nextLogger(new EmailLogger(Logger.NOTICE));
        logger2.nextLogger(new StderrLogger(Logger.ERR));
        logger.message(Logger.DEBUG,"Message to std out");
        logger.message(Logger.ERR,"Message to std out");
        logger.message(Logger.NOTICE,"Message to std out");
    }
}