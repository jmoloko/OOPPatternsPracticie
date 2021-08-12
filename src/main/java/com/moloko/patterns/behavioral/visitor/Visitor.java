package main.java.com.moloko.patterns.behavioral.visitor;

/**
 * @author Jack Milk
 */
public interface Visitor {
    public void visit(Dough dough);
    public void visit(Sauce sauce);
    public void visit(Filling filling);
    public void visit(Pizza pizza);
}
