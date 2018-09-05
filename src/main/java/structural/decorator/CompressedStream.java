package structural.decorator;

public class CompressedStream extends Decorator {
    public CompressedStream(Stream stream) {
        super(stream);
    }

    @Override
    public void read() {
        super.read();
        System.out.println("Decompressing ");
    }

    @Override
    public void write() {
        super.write();
        System.out.println("Compressing ");
    }
}
