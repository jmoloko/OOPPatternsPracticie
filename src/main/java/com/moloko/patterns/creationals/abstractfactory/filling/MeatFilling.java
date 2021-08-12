package main.java.com.moloko.patterns.creationals.abstractfactory.filling;

/**
 * @author Jack Milk
 */
public class MeatFilling implements Filling{
    @Override
    public void makeFilling() {
        System.out.println("You have created Meat filling.");
    }
}
