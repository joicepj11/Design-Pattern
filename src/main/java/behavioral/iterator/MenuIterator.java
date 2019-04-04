package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MenuIterator implements Iterator<Item> {

   private ArrayList<Item> menuItems;
    private int currentIndex =0;

    public MenuIterator(ArrayList<Item> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems.size() > currentIndex;
    }

    @Override
    public Item next() {
        return menuItems.get(currentIndex++);
    }

    @Override
    public void remove() {
        menuItems.remove(--currentIndex);
    }

    public Item first(){
        return menuItems.get(0);
    }

    public Item current(){
        return menuItems.get(currentIndex);
    }
}
