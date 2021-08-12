package main.java.com.moloko.patterns.creationals.prototype;

/**
 * @author Jack Milk
 */
public class BasisPizzaFactory {
    BasisOfPizza pizza;

    public BasisPizzaFactory(BasisOfPizza pizza) {
        this.pizza = pizza;
    }

    public void setPizza(BasisOfPizza pizza) {
        this.pizza = pizza;
    }

    BasisOfPizza clonePizza() {
        return (BasisOfPizza) pizza.copy();
    }
}
