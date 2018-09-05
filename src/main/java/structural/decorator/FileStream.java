package structural.decorator;

public class FileStream extends Stream {
    @Override
    public void read() {
        System.out.println("Reading ");
    }

    @Override
    public void write() {
        System.out.println("Writing  ");
    }
}
