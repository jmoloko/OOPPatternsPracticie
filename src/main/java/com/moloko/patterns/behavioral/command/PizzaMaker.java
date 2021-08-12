package main.java.com.moloko.patterns.behavioral.command;

import main.java.com.moloko.patterns.behavioral.command.make.Make;

/**
 * @author Jack Milk
 */
public class PizzaMaker {
    private Make makeDough;
    private Make makeFilling;
    private Make makeSauce;

    public PizzaMaker(Make makeDough, Make makeFilling, Make makeSauce) {
        this.makeDough = makeDough;
        this.makeFilling = makeFilling;
        this.makeSauce = makeSauce;
    }

    public void makeDough(){
        makeDough.execute();
    }

    public void makeFilling(){
        makeFilling.execute();
    }

    public void makeSauce() {
        makeSauce.execute();
    }
}
