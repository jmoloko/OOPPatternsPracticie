package main.java.com.moloko.patterns.behavioral.command.make;

import main.java.com.moloko.patterns.behavioral.command.Pizza;

/**
 * @author Jack Milk
 */
public class MakeSauceCommand implements Make{
    Pizza pizza;

    public MakeSauceCommand(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void execute() {
        pizza.makeSauce();
    }
}
