package main.java.com.moloko.patterns.behavioral.strategy;

import main.java.com.moloko.patterns.behavioral.strategy.activity.MakeDough;
import main.java.com.moloko.patterns.behavioral.strategy.activity.MakeFilling;
import main.java.com.moloko.patterns.behavioral.strategy.activity.MakeSauce;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();

        chef.setWork(new MakeDough());
        chef.executeWork();

        chef.setWork(new MakeSauce());
        chef.executeWork();

        chef.setWork(new MakeFilling());
        chef.executeWork();
    }
}
