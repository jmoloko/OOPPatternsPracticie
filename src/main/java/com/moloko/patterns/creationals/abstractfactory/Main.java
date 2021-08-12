package main.java.com.moloko.patterns.creationals.abstractfactory;

import main.java.com.moloko.patterns.creationals.abstractfactory.factories.CalzonePizzaFactory;
import main.java.com.moloko.patterns.creationals.abstractfactory.factories.PepperoniPizzaFactory;

/**
 * @author Jack Milk
 */
public class Main {
    private static PizzaMaker makePizza(String pizzaName){
        PizzaMaker pizza = null;

        if (pizzaName.equalsIgnoreCase("calzone")){
            pizza = new PizzaMaker(new CalzonePizzaFactory());
        } else if (pizzaName.equalsIgnoreCase("pepperoni")){
            pizza = new PizzaMaker(new PepperoniPizzaFactory());
        } else {
            new RuntimeException(pizzaName + " not hav in menu");
        }
        return pizza;
    }

    public static void main(String[] args) {
        PizzaMaker pizza = makePizza("pepperoni");
        pizza.cookPizza();
    }
}
