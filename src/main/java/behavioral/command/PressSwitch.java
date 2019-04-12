package behavioral.command;

public class PressSwitch {


    public static void main(String[] args) {
        AirConditioner lamp = new AirConditioner();
        Command switchOn = new StartCommand(lamp);
        Command switchOff = new StopCommand(lamp);

        Switch swit = new Switch();
        swit.storeAndExceute(switchOn);
        swit.storeAndExceute(switchOff);
    }
}
