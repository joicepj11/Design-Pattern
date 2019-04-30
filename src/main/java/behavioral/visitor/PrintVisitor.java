package behavioral.visitor;

import java.util.Collection;
import java.util.Iterator;

public class PrintVisitor implements Visitor {

    @Override
    public void visitCollection(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Visitable) {
                ((Visitable)o).accept(this);
            }
        }
    }

    @Override
    public void visitString(String s) {
        System.out.println("This is a string and its value is "+ s);
    }

    @Override
    public void visitInteger(Integer integer) {
        System.out.println(integer.toString() + " I");
    }
}