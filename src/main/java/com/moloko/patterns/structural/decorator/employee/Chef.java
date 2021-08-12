package main.java.com.moloko.patterns.structural.decorator.employee;

/**
 * @author Jack Milk
 */
public class Chef extends StuffDecorator{

    public Chef(Stuff stuff) {
        super(stuff);
    }

    public String makePizza(){
        return " Cook pizza.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makePizza();
    }
}
