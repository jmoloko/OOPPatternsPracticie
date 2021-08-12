package main.java.com.moloko.patterns.behavioral.observer;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        PizzaOrders orders = new PizzaOrders();
        orders.addOrder("Calzone");
        orders.addOrder("Pepperoni");

        Observer chef = new KitchenEmployees("Chef");
        Observer suChef = new KitchenEmployees("Su-Chef");

        orders.addObserver(chef);
        orders.addObserver(suChef);

        orders.addOrder("Margarita");

    }
}
