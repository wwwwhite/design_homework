package Int;

public class Client {
    public static void main(String[] args){
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("john is male?" + isMale.interpret("Robert John"));
        System.out.println("Julie is a married women?" + isMarriedWoman.interpret("married Julie"));
    }

    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("john");
        return new OrExpression(robert, john)
    }
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("julie");
        Expression married = new TerminalExpression("married");
    }
}
