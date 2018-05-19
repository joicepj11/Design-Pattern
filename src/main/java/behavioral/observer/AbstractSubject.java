package behavioral.observer;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractSubject {
    List<AbstractObserver> abstractObservers = new LinkedList<>();

    public void register(AbstractObserver abstractObserver){
        abstractObservers.add(abstractObserver);
    }

    public void unregister(AbstractObserver abstractObserver){
        abstractObservers.remove(abstractObserver);
    }

    public void notifyUpdate(){
        for(AbstractObserver abstractObserver:abstractObservers){
            abstractObserver.update();
        }
    }
}
