package behavioral.memento;

import com.sun.istack.internal.Nullable;
import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> savedStates = new ArrayList<>();

    public void addMemento(Memento memento) {
        if (memento != null)
            savedStates.add(memento);
    }

    @Nullable
    public Memento getSavedState(int index) {
        if (savedStates.size() >= index)
            return savedStates.get(index);
        return null;
    }
}
