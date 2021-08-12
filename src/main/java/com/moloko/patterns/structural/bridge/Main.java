package main.java.com.moloko.patterns.structural.bridge;

import main.java.com.moloko.patterns.structural.bridge.pizza.Calzone;
import main.java.com.moloko.patterns.structural.bridge.pizza.Pepperoni;
import main.java.com.moloko.patterns.structural.bridge.stuff.Chef;
import main.java.com.moloko.patterns.structural.bridge.stuff.Stuff;
import main.java.com.moloko.patterns.structural.bridge.stuff.SuChef;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        Stuff chef = new Chef(new Pepperoni());
        chef.makePizza();

        Stuff suchef = new SuChef(new Calzone());
        suchef.makePizza();
    }
}
