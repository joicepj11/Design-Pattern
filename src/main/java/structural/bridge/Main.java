package structural.bridge;

public class Main {

    public static void main(String[] args) {
        Shape shape;
        shape = new Triangle(new RedColor());
        shape.applyColor();
        shape = new Pentagon(new BlueColor());
        shape.applyColor();
    }
}