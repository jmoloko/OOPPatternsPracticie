package main.java.com.moloko.patterns.creationals.abstractfactory.dough;

/**
 * @author Jack Milk
 */
public class SlimDough implements Dough{
    @Override
    public void makeDough() {
        System.out.println("You have created Slim dough.");
    }
}
