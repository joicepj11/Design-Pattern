package behavioral.strategy;

public class NFC extends Protocol {
    @Override
    void transfer() {
        System.out.println("NFC sharing");
    }
}
