package main.java.com.moloko.patterns.behavioral.command.make;

import main.java.com.moloko.patterns.behavioral.command.Pizza;

/**
 * @author Jack Milk
 */
public class MakeDoughCommand implements Make{
    Pizza pizza;

    public MakeDoughCommand(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void execute() {
        pizza.makeDough();
    }
}
