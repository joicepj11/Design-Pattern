package structural.decorator;

public class Decorator extends Stream {

    private Stream stream;

    public Decorator(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void read() {
        stream.read();
    }

    @Override
    public void write() {
        stream.write();
    }
}
