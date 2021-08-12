package main.java.com.moloko.patterns.behavioral.command;

/**
 * @author Jack Milk
 */
public class Pizza {
    public void makeDough() {
        System.out.println("Making slim dough");
    }

    public void makeFilling(){
        System.out.println("Slicing vegetable filling");
    }

    public void makeSauce(){
        System.out.println("Making tomato sauce");
    }
}
