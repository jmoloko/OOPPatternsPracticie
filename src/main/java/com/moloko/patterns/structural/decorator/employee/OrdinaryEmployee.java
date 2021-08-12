package main.java.com.moloko.patterns.structural.decorator.employee;

/**
 * @author Jack Milk
 */
public class OrdinaryEmployee implements Stuff{

    @Override
    public String makeJob() {
        return "Makes cut for pizza.";
    }
}
