package main.java.com.moloko.patterns.structural.bridge.pizza;

/**
 * @author Jack Milk
 */
public class Calzone implements Pizza{
    @Override
    public void makeDough() {
        System.out.println("Creates fat dough...");
    }

    @Override
    public void makeSauce() {
        System.out.println("Creates garlic sauce...");
    }

    @Override
    public void makeFilling() {
        System.out.println("Creates meat filling");
    }
}
