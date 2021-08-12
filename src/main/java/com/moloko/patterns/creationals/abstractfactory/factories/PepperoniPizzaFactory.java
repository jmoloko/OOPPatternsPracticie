package main.java.com.moloko.patterns.creationals.abstractfactory.factories;

import main.java.com.moloko.patterns.creationals.abstractfactory.dough.Dough;
import main.java.com.moloko.patterns.creationals.abstractfactory.dough.SlimDough;
import main.java.com.moloko.patterns.creationals.abstractfactory.filling.Filling;
import main.java.com.moloko.patterns.creationals.abstractfactory.filling.VegetableFilling;
import main.java.com.moloko.patterns.creationals.abstractfactory.sauce.Sauce;
import main.java.com.moloko.patterns.creationals.abstractfactory.sauce.TomatoSauce;

/**
 * @author Jack Milk
 */
public class PepperoniPizzaFactory implements PizzaFactory{
    @Override
    public Dough createDough() {
        return new SlimDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Filling createFilling() {
        return new VegetableFilling();
    }
}
