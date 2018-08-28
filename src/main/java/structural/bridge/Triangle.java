package structural.bridge;

public class Triangle extends Shape {

    Triangle(Color color) {
        super(color);
        this.color = color;
    }

    @Override
    public void applyColor() {
        System.out.println("Triangle applied with color");
        color.applyColor();
    }
}