package main.java.com.moloko.patterns.structural.proxy;

/**
 * @author Jack Milk
 */
public class MakePizza implements Pizza{
    private String name;

    public MakePizza(String name) {
        this.name = name;
        slice();
    }

    public void slice() {
        System.out.println("Slicing product for " + name + " pizza...");
    }


    @Override
    public void make() {
        System.out.println("Make " + name + " pizza...");
    }
}
