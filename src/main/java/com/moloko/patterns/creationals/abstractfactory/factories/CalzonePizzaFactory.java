package main.java.com.moloko.patterns.creationals.abstractfactory.factories;

import main.java.com.moloko.patterns.creationals.abstractfactory.dough.Dough;
import main.java.com.moloko.patterns.creationals.abstractfactory.dough.FatDough;
import main.java.com.moloko.patterns.creationals.abstractfactory.filling.Filling;
import main.java.com.moloko.patterns.creationals.abstractfactory.filling.MeatFilling;
import main.java.com.moloko.patterns.creationals.abstractfactory.sauce.GarlicSauce;
import main.java.com.moloko.patterns.creationals.abstractfactory.sauce.Sauce;

/**
 * @author Jack Milk
 */
public class CalzonePizzaFactory implements PizzaFactory{
    @Override
    public Dough createDough() {
        return new FatDough();
    }

    @Override
    public Sauce createSauce() {
        return new GarlicSauce();
    }

    @Override
    public Filling createFilling() {
        return new MeatFilling();
    }
}
