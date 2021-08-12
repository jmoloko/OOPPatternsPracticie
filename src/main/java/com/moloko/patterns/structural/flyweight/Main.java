package main.java.com.moloko.patterns.structural.flyweight;

import main.java.com.moloko.patterns.structural.flyweight.factory.PizzaFactory;
import main.java.com.moloko.patterns.structural.flyweight.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        List<Pizza> pizzas = new ArrayList<>();

        pizzas.add(pizzaFactory.getPizzaByName("pepperoni"));
        pizzas.add(pizzaFactory.getPizzaByName("pepperoni"));
        pizzas.add(pizzaFactory.getPizzaByName("pepperoni"));
        pizzas.add(pizzaFactory.getPizzaByName("margarita"));
        pizzas.add(pizzaFactory.getPizzaByName("margarita"));
        pizzas.add(pizzaFactory.getPizzaByName("margarita"));

        for (Pizza pizza: pizzas){
            pizza.makePizza();
        }
    }
}
