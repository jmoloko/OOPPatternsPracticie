package main.java.com.moloko.patterns.structural.proxy;

/**
 * @author Jack Milk
 */
public class ProxyMakePizza implements Pizza{
    private String name;
    private MakePizza makePizza;

    public ProxyMakePizza(String name) {
        this.name = name;
    }

    @Override
    public void make() {
        if (makePizza == null) {
            makePizza = new MakePizza(name);
        }
        makePizza.make();
    }
}
