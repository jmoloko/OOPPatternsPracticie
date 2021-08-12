package main.java.com.moloko.patterns.creationals.builder;

import main.java.com.moloko.patterns.creationals.builder.builders.CalzoneBuilder;
import main.java.com.moloko.patterns.creationals.builder.builders.Director;
import main.java.com.moloko.patterns.creationals.builder.builders.PepperoniBuilder;
import main.java.com.moloko.patterns.creationals.builder.component.Pizza;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new CalzoneBuilder());

        Pizza pizza = director.buildPizza();
        System.out.println(pizza);
    }
}
