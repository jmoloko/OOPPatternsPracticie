package main.java.com.moloko.patterns.behavioral.visitor;

/**
 * @author Jack Milk
 */
public interface PizzaCompos {
    public void accept(Visitor visitor);
}
