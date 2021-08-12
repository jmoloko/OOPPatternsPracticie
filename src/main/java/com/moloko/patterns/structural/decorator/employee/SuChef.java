package main.java.com.moloko.patterns.structural.decorator.employee;

/**
 * @author Jack Milk
 */
public class SuChef extends StuffDecorator{

    public SuChef(Stuff stuff) {
        super(stuff);
    }

    public String makeDough(){
        return " Makes dough for pizza.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeDough();
    }
}
