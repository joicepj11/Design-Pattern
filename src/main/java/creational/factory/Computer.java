package creational.factory;

public abstract class Computer {
    public abstract String getRam();
    public abstract String getHdd();
    public abstract String getCpu();

    @Override
    public String toString() {
        return "Ram =" +this.getRam() +" Cpu = "+this.getCpu()+" Hdd="+this.getHdd();
    }
}
