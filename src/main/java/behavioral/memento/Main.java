package behavioral.memento;

public class Main {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        originator.setState("State 1");
        careTaker.addMemento(originator.saveMemento());
        originator.setState("State 2");
        careTaker.addMemento(originator.saveMemento());
        originator.setState("State 3");
        careTaker.addMemento(originator.saveMemento());
        originator.restoreFromMemento(careTaker.getSavedState(0));
    }
}