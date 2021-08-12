package main.java.com.moloko.patterns.creationals.builder.builders;

import main.java.com.moloko.patterns.creationals.builder.component.Dough;
import main.java.com.moloko.patterns.creationals.builder.component.Sauce;
import main.java.com.moloko.patterns.creationals.builder.component.Size;

/**
 * @author Jack Milk
 */
public class CalzoneBuilder extends PizzaBuilder{
    @Override
    void buildName() {
        pizza.setName("Calzone");
    }

    @Override
    void buildDough() {
        pizza.setDough(Dough.FAT);
    }

    @Override
    void buildSauce() {
        pizza.setSauce(Sauce.GARLIC);
    }

    @Override
    void buildSize() {
        pizza.setSize(Size.MEDIUM);
    }

    @Override
    void buildFilling() {
        pizza.setFilling("Meat");
    }

    @Override
    void buildPrice() {
        pizza.setPrice(25);
    }
}
