package main.java.com.moloko.patterns.creationals.builder.builders;

import main.java.com.moloko.patterns.creationals.builder.component.Dough;
import main.java.com.moloko.patterns.creationals.builder.component.Sauce;
import main.java.com.moloko.patterns.creationals.builder.component.Size;

/**
 * @author Jack Milk
 */
public class PepperoniBuilder extends PizzaBuilder{
    @Override
    void buildName() {
        pizza.setName("Pepperoni");
    }

    @Override
    void buildDough() {
        pizza.setDough(Dough.SLIM);
    }

    @Override
    void buildSauce() {
        pizza.setSauce(Sauce.TOMATO);
    }

    @Override
    void buildSize() {
        pizza.setSize(Size.LARGE);
    }

    @Override
    void buildFilling() {
        pizza.setFilling("Vegetable");
    }

    @Override
    void buildPrice() {
        pizza.setPrice(15);
    }
}
