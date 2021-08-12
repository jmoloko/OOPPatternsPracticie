package main.java.com.moloko.patterns.structural.bridge.stuff;

import main.java.com.moloko.patterns.structural.bridge.pizza.Pizza;

/**
 * @author Jack Milk
 */
public class SuChef extends Stuff{

    public SuChef(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void makePizza() {
        System.out.println("Su-Chef cooking pizza...");
        pizza.makeDough();
        pizza.makeSauce();
        pizza.makeFilling();
    }
}
