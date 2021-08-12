package main.java.com.moloko.patterns.creationals.builder.builders;

import main.java.com.moloko.patterns.creationals.builder.builders.PizzaBuilder;
import main.java.com.moloko.patterns.creationals.builder.component.Pizza;

/**
 * @author Jack Milk
 */
public class Director {
    PizzaBuilder builder;

    public void setBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza buildPizza(){
        builder.createPizza();
        builder.buildName();
        builder.buildDough();
        builder.buildSauce();
        builder.buildSize();
        builder.buildFilling();
        builder.buildPrice();

        Pizza pizza = builder.getPizza();

        return pizza;
    }
}
