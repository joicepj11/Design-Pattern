package behavioral.interpreter;

public class InterpreterTest {

    static Expression buildExpression(){
        Expression expression = new TerminalExpression("136");
        Expression expression1 = new TerminalExpression("631");
        Expression expression2 = new TerminalExpression("136");

        Expression andExpression = new AndExpression(expression,expression1);
        return new AndExpression(andExpression,expression2);
    }

    public static void main(String[] args) {
        String context = "136 631";
        Expression define = buildExpression();
        System.out.println(context +" is " + define.interpert(context));
    }
}
