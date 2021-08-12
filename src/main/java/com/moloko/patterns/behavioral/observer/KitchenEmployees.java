package main.java.com.moloko.patterns.behavioral.observer;

import java.util.List;

/**
 * @author Jack Milk
 */
public class KitchenEmployees implements Observer{
    String name;

    public KitchenEmployees(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> orders) {
        System.out.println("Attention!" + name + " Received a new order for pizza!\n" + orders + "\n");
    }
}
