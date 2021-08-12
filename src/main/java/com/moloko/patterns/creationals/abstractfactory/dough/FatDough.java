package main.java.com.moloko.patterns.creationals.abstractfactory.dough;

/**
 * @author Jack Milk
 */
public class FatDough implements Dough{
    @Override
    public void makeDough() {
        System.out.println("You have created Fat dough.");
    }
}
