package main.java.com.moloko.patterns.structural.bridge.stuff;

import main.java.com.moloko.patterns.structural.bridge.pizza.Pizza;

/**
 * @author Jack Milk
 */
public class Chef extends Stuff{

    public Chef(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void makePizza() {
        System.out.println("Chef cooking Pizza....");
        pizza.makeDough();
        pizza.makeSauce();
        pizza.makeFilling();
    }

}
