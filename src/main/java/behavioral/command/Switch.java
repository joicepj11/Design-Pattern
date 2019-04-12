package behavioral.command;

import java.util.ArrayList;
import java.util.List;

// invoker class
public class Switch {

   private List<Command> commandHistory = new ArrayList<>();

    Switch() { }

    void storeAndExceute(Command command){
        commandHistory.add(command);
        command.execute();
    }
}
