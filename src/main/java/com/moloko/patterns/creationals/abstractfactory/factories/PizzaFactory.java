package main.java.com.moloko.patterns.creationals.abstractfactory.factories;

import main.java.com.moloko.patterns.creationals.abstractfactory.dough.Dough;
import main.java.com.moloko.patterns.creationals.abstractfactory.filling.Filling;
import main.java.com.moloko.patterns.creationals.abstractfactory.sauce.Sauce;

/**
 * @author Jack Milk
 */
public interface PizzaFactory {
    Dough createDough();
    Sauce createSauce();
    Filling createFilling();
}
