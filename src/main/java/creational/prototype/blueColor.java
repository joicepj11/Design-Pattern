package creational.prototype;

class blueColor extends Color {
    blueColor() {
        this.colorName = "blue";
    }

    @Override
    void addColor() {
        System.out.println("Blue color added");
    }
}