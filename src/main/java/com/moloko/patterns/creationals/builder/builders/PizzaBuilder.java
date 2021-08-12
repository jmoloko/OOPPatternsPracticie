package main.java.com.moloko.patterns.creationals.builder.builders;

import main.java.com.moloko.patterns.creationals.builder.component.Pizza;

/**
 * @author Jack Milk
 */
public abstract class PizzaBuilder {
    Pizza pizza;

    public void createPizza() {
        pizza = new Pizza();
    }

    abstract void buildName();
    abstract void buildDough();
    abstract void buildSauce();
    abstract void buildSize();
    abstract void buildFilling();
    abstract void buildPrice();

    public Pizza getPizza() {
        return pizza;
    }
}
