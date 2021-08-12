package main.java.com.moloko.patterns.structural.decorator.employee;

/**
 * @author Jack Milk
 */
public class StuffDecorator implements Stuff{
    Stuff stuff;

    public StuffDecorator(Stuff stuff) {
        this.stuff = stuff;
    }

    @Override
    public String makeJob() {
        return stuff.makeJob();
    }
}
