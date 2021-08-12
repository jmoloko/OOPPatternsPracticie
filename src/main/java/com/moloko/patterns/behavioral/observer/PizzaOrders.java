package main.java.com.moloko.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack Milk
 */
public class PizzaOrders implements Observed{
    List<String> orders = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addOrder(String pizzaName){
        orders.add(pizzaName);
        notifyObservers();
    }

    public void removeOrder(String pizzaName){
        orders.remove(pizzaName);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: subscribers){
            observer.handleEvent(orders);
        }
    }
}
