package main.java.com.moloko.patterns.creationals.prototype;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        BasisOfPizza pizzaMaster = new BasisOfPizza("Slim", "Tomato", "Vegetable");

        System.out.println(pizzaMaster);

        BasisOfPizza pizzaClone = (BasisOfPizza) pizzaMaster.copy();
        System.out.println(pizzaClone);

        BasisPizzaFactory factory = new BasisPizzaFactory(pizzaMaster);
        BasisOfPizza pizzaCopy = factory.clonePizza();
        System.out.println(pizzaCopy);
    }
}
