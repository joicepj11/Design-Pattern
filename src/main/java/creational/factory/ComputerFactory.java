package creational.factory;

public class ComputerFactory {
    public static Computer getComputer(String ram,String hdd,String cpu,String type) throws Exception {
        if(type.equalsIgnoreCase("PC"))
            return new PC(ram,hdd,cpu);
        else if(type.equalsIgnoreCase("SERVER"))
            return new Server( ram,  hdd,  cpu);
        throw new ClassNotFoundException("Specified type not found ");
    }
}
