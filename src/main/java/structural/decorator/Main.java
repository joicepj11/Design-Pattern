package structural.decorator;

public class Main {
    public static void main(String[] args) {

        FileStream fileStream = new FileStream();
// ALL Streams can be decorated  with other streams
        CompressedStream compressedStream = new CompressedStream(fileStream);
        EncryptedStream encryptedStream = new EncryptedStream(compressedStream);
        encryptedStream.write();
        encryptedStream.read();
        // adding new behaviour dynamically
        // in these example encrypted stream was compressed
        // there is no additional implementation for compressing or de-compressing

    }
}
