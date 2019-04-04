package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu {

    ArrayList<Item> menuItems;

    public Menu() {
        menuItems = new ArrayList<>();
    }

    public void addItems(Item item){
        menuItems.add(item);
    }

    public Iterator createIterator(){
        return new MenuIterator(menuItems);
    }
}
