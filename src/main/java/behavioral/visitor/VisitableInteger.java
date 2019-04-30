package behavioral.visitor;

public class VisitableInteger implements Visitable {

    private Integer integer;

    public VisitableInteger(Integer integer) {
        this.integer = integer;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitInteger(integer);
    }
}