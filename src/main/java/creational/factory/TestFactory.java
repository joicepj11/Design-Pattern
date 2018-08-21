package creational.factory;

public class TestFactory {

    public static void main(String[] args) throws Exception {
        Computer pc = ComputerFactory.getComputer("2gb","1tb","4","pc");
        System.out.println(pc.toString());
        Computer server = ComputerFactory.getComputer("16gb","10tb","16","server");
        System.out.println(server.toString());
    }
}
