package main.java.com.moloko.patterns.creationals.abstractfactory.filling;

/**
 * @author Jack Milk
 */
public class VegetableFilling implements Filling{
    @Override
    public void makeFilling() {
        System.out.println("You have created Vegetable filling.");
    }
}
