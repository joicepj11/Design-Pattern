package behavioral.strategy;

public class Bluetooth extends Protocol {
    @Override
    void transfer() {
        System.out.println("[BLUETOOTH] transfer");
    }
}
