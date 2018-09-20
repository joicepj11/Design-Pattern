package behavioral.interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {
    String str;

    public TerminalExpression(String str) {
        this.str = str;
    }


    @Override
    public boolean interpert(String literal) {
        StringTokenizer stringTokenizer = new StringTokenizer(literal);
        while (stringTokenizer.hasMoreTokens()){
            String text = stringTokenizer.nextToken();
            if(str.equals(text)){
                return true;
            }
        }
        return false;
    }
}
