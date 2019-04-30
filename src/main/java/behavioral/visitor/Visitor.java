package behavioral.visitor;

import java.util.Collection;

public interface Visitor {
    void visitCollection(Collection collection);
    void visitString(String s);
    void visitInteger(Integer integer);
}