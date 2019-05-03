package structural.proxy;

import java.net.MalformedURLException;
import java.net.URL;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) throws MalformedURLException {
        Image image = new ProxyImage(new URL("http://simple/image.jpeg"));
        Image image1 = new ProxyImage(new URL("http://simple/image1.jpeg"));
        Image image2 = new ProxyImage(new URL("http://simple/image2.jpeg"));
        image.showImage();
    }
}