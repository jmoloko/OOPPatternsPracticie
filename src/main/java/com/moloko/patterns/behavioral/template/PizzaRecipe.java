package main.java.com.moloko.patterns.behavioral.template;

/**
 * @author Jack Milk
 */
public abstract class PizzaRecipe {
    public void showRecipe(){
        System.out.println("Slim Dough");
        filling();
        System.out.println("Tomato sauce");
    }

    public abstract void filling();
}
