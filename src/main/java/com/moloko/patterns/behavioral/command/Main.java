package main.java.com.moloko.patterns.behavioral.command;

import main.java.com.moloko.patterns.behavioral.command.make.MakeDoughCommand;
import main.java.com.moloko.patterns.behavioral.command.make.MakeFillingCommand;
import main.java.com.moloko.patterns.behavioral.command.make.MakeSauceCommand;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        PizzaMaker maker = new PizzaMaker(new MakeDoughCommand(pizza), new MakeFillingCommand(pizza), new MakeSauceCommand(pizza));
        maker.makeDough();
        maker.makeFilling();
        maker.makeSauce();
    }
}
