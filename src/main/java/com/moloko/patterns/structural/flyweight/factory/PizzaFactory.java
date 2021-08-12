package main.java.com.moloko.patterns.structural.flyweight.factory;

import main.java.com.moloko.patterns.structural.flyweight.pizza.MargaritaPizza;
import main.java.com.moloko.patterns.structural.flyweight.pizza.PepperoniPizza;
import main.java.com.moloko.patterns.structural.flyweight.pizza.Pizza;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jack Milk
 */
public class PizzaFactory {
    private static final Map<String, Pizza> pizzas = new HashMap<>();

    public Pizza getPizzaByName(String name) {
        Pizza pizza = pizzas.get(name);

        if (pizza == null){
            switch (name) {
                case "pepperoni":
                    System.out.println("Make slices for pepperoni...");
                    pizza = new PepperoniPizza();
                    break;
                case "margarita":
                    System.out.println("Make slices for margarita...");
                    pizza = new MargaritaPizza();
                    break;
            }
            pizzas.put(name, pizza);
        }
        return pizza;
    }
}
