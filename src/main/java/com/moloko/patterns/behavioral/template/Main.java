package main.java.com.moloko.patterns.behavioral.template;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        PizzaRecipe margarita = new MargaritaPizza();
        PizzaRecipe pepperoni = new PepperoniPizza();

        margarita.showRecipe();
        pepperoni.showRecipe();
    }
}
