package structural.proxy;

import java.net.URL;

public class RealImage implements Image {


    RealImage(URL url) {
        loadImage(url);
    }

    private void loadImage(URL url) {
        System.out.println("Loading image "+url.getFile());
    }

    @Override
    public void showImage() {
        System.out.println("Showing image ");
    }
}
