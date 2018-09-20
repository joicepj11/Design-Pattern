package behavioral.interpreter;

public class AndExpression implements Expression {
    private Expression expression;
    private Expression expression1;

    public AndExpression(Expression expression, Expression expression1) {
        this.expression = expression;
        this.expression1 = expression1;
    }

    @Override
    public boolean interpert(String literal) {
        return expression.interpert(literal) && expression1.interpert(literal);
    }
}
