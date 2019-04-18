package behavioral.memento;

public class Originator {

    private String state ;

    public void setState(String state) {
        System.out.println("Setting state to "+state);
        this.state = state;
    }

    public Memento saveMemento(){
        return new Memento(state);
    }

    public void restoreFromMemento(Memento memento){
        state = memento.getSavedState();
        System.out.println("Restoring the memento state" +state);
    }
}