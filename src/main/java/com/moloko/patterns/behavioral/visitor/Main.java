package main.java.com.moloko.patterns.behavioral.visitor;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        PizzaCompos pizza = new Pizza();
        pizza.accept(new PizzaRecipe());

    }
}
