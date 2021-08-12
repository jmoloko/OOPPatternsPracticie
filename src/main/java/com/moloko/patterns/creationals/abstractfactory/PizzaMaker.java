package main.java.com.moloko.patterns.creationals.abstractfactory;

import main.java.com.moloko.patterns.creationals.abstractfactory.dough.Dough;
import main.java.com.moloko.patterns.creationals.abstractfactory.factories.PizzaFactory;
import main.java.com.moloko.patterns.creationals.abstractfactory.filling.Filling;
import main.java.com.moloko.patterns.creationals.abstractfactory.sauce.Sauce;

/**
 * @author Jack Milk
 */
public class PizzaMaker {
    private Dough dough;
    private Sauce sauce;
    private Filling filling;

    public PizzaMaker(PizzaFactory factory){
        dough = factory.createDough();
        sauce = factory.createSauce();
        filling = factory.createFilling();
    }

    public void cookPizza(){
        System.out.println("Pizza cooking...");
        dough.makeDough();
        sauce.makeSauce();
        filling.makeFilling();
    }
}
