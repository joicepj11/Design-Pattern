package behavioral.visitor;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        PrintVisitor printVisitor = new PrintVisitor();
        VisitableString visitableString = new VisitableString("joice");
        VisitableInteger visitableInteger = new VisitableInteger(12);
        ArrayList visitableStrings = new ArrayList<>();
        visitableStrings.add(visitableString);
        visitableStrings.add(visitableInteger);
        printVisitor.visitCollection(visitableStrings);
    }

}