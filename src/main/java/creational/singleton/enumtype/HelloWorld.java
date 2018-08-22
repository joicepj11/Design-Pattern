package creational.singleton.enumtype;

public enum HelloWorld {
    INSTANCE;
    public void sayHello(){
        System.out.println("Hello world from enum type");
    }
}
// drawback can have inheritance from enum type only