package structural.proxy;

import java.net.URL;

public class ProxyImage implements Image {
    private URL url;

    ProxyImage(URL url) {
        this.url = url;
    }

    @Override
    public void showImage() {
        RealImage realImage = new RealImage(url);
        realImage.showImage();
    }
}
