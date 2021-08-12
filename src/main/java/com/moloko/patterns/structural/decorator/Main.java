package main.java.com.moloko.patterns.structural.decorator;

import main.java.com.moloko.patterns.structural.decorator.employee.Chef;
import main.java.com.moloko.patterns.structural.decorator.employee.OrdinaryEmployee;
import main.java.com.moloko.patterns.structural.decorator.employee.Stuff;
import main.java.com.moloko.patterns.structural.decorator.employee.SuChef;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        Stuff stuff = new Chef(new SuChef(new OrdinaryEmployee()));

        System.out.println(stuff.makeJob());
    }
}
