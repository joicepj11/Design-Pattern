package creational.singleton;

import creational.singleton.classtype.SingleTon;
import creational.singleton.enumtype.HelloWorld;

public class Driver {
    public static void main(String[] args) {
        HelloWorld.INSTANCE.sayHello();
        SingleTon.getInstance().sayHello();
    }
}