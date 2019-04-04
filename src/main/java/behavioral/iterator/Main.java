package behavioral.iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Item item =new Item("flute",10);
        Item item1 =new Item("voilin",10);

        Item item2 =new Item("guitar",10);

        Menu menu = new Menu();
        menu.addItems(item);
        menu.addItems(item1);
        menu.addItems(item2);

        Iterator iterator = menu.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Removing the last item");
        iterator.remove();
        System.out.println("After removing item");
        iterator = menu.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
