package main.java.com.moloko.patterns.structural.flyweight.pizza;

/**
 * @author Jack Milk
 */
public class PepperoniPizza implements Pizza{
    @Override
    public void makePizza() {
        System.out.println("Cooking pepperoni pizza...");
    }
}
