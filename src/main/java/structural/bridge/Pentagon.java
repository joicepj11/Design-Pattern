package structural.bridge;

public class Pentagon extends Shape {

    Pentagon(Color color) {
        super(color);
        this.color = color;
    }

    @Override
    public void applyColor() {
        System.out.println("Pentagon Applied with color");
        color.applyColor();
    }
}