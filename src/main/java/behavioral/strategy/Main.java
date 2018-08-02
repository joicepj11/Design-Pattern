package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        DataTransfer transfer = new DataTransfer();
        transfer.setProtocol(new Bluetooth());
        transfer.loadStream();
        transfer.sendStream();
        transfer.setProtocol(new NFC());
        transfer.sendStream();
    }
}
