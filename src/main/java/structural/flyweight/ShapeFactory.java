package structural.flyweight;



import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String,MyShape> shapes = new HashMap<>();

    public static MyShape getShape(String label) throws Exception {
        MyShape concerteShape = (MyShape) shapes.get(label);
        if(concerteShape == null){
            if(label.equalsIgnoreCase("R")){
                concerteShape = new MyRectangle(label);
            }else if (label.equalsIgnoreCase("O")){
                concerteShape = new MyOval(label);

            }else {
                throw new Exception("Invalid shape label");
            }
            shapes.put(label,concerteShape);
        }
        return concerteShape;
    }
}