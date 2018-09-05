package structural.decorator;

public class EncryptedStream extends Decorator {
    public EncryptedStream(Stream stream) {
        super(stream);
    }

    @Override
    public void read() {
        super.read();
        System.out.println("Decrypting ");
    }

    @Override
    public void write() {
        super.write();
        System.out.println("Encrypting ");
    }
}
