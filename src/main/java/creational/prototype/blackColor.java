package creational.prototype;

class blackColor extends Color {

    blackColor() {
        this.colorName = "black";
    }

    @Override
    void addColor() {
        System.out.println("Black color added");
    }
}