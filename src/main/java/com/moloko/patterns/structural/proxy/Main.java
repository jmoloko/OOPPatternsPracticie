package main.java.com.moloko.patterns.structural.proxy;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new ProxyMakePizza("Calzone");
        pizza.make();
    }
}
