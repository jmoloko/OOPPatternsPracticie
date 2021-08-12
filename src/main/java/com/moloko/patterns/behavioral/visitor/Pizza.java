package main.java.com.moloko.patterns.behavioral.visitor;

/**
 * @author Jack Milk
 */
public class Pizza implements PizzaCompos{
    private PizzaCompos[] pizzaComposes = new PizzaCompos[] {new Dough(), new Sauce(), new Filling()};

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (PizzaCompos compos: pizzaComposes){
            compos.accept(visitor);
        }
    }
}
