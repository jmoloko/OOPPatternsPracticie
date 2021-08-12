package main.java.com.moloko.patterns.structural.adapter;

/**
 * @author Jack Milk
 */
public class AdapterTacosToPizza extends TacosMaker implements PizzaBasis{
    @Override
    public void makeDough() {
        createDough();
    }

    @Override
    public void makeSauce() {
        createSauce();
    }

    @Override
    public void makeFilling() {
        createFilling();
    }
}
