package main.java.com.moloko.patterns.behavioral.visitor;

/**
 * @author Jack Milk
 */
public class Sauce implements PizzaCompos{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
