package main.java.com.moloko.patterns.structural.bridge.pizza;

/**
 * @author Jack Milk
 */
public class Pepperoni implements Pizza{

    @Override
    public void makeDough() {
        System.out.println("Creates slim dough...");
    }

    @Override
    public void makeSauce() {
        System.out.println("Creates tomato sauce...");
    }

    @Override
    public void makeFilling() {
        System.out.println("Creates vegetable filling...");
    }
}
