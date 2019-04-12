package behavioral.command;

public class StartCommand implements Command {

    private AirConditioner airConditioner;

    StartCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.start();
    }
}