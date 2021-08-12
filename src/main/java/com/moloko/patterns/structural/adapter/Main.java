package main.java.com.moloko.patterns.structural.adapter;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        PizzaBasis basis = new AdapterTacosToPizza();

        basis.makeDough();
        basis.makeSauce();
        basis.makeFilling();
    }
}
