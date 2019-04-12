package behavioral.command;

public class StopCommand implements Command {

    private AirConditioner airConditioner;

    StopCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.stop();
    }
}