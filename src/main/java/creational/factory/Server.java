package creational.factory;

public class Server extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRam() {
        if(ram != null)
        return ram;
        return "Ram is data not found";
    }

    @Override
    public String getHdd() {
        if(hdd != null)
        return hdd;
        return "Hdd is data not found";
    }

    @Override
    public String getCpu() {
        if(cpu != null)
        return cpu;
        return "CPU data is not found";
    }
}
