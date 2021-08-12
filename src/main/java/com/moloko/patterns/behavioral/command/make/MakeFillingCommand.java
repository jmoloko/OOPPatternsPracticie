package main.java.com.moloko.patterns.behavioral.command.make;

import main.java.com.moloko.patterns.behavioral.command.Pizza;

/**
 * @author Jack Milk
 */
public class MakeFillingCommand implements Make{
    Pizza pizza;

    public MakeFillingCommand(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void execute() {
        pizza.makeFilling();
    }
}
