package main.java.com.moloko.patterns.structural.bridge.stuff;

import main.java.com.moloko.patterns.structural.bridge.pizza.Pizza;

/**
 * @author Jack Milk
 */
public abstract class Stuff {
    protected Pizza pizza;

    protected Stuff(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract void makePizza();
}
