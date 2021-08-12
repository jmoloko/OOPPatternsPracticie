package main.java.com.moloko.patterns.behavioral.strategy;

import main.java.com.moloko.patterns.behavioral.strategy.activity.Activity;

/**
 * @author Jack Milk
 */
public class Chef {
    Activity work;

    public void setWork(Activity work) {
        this.work = work;
    }

    public void executeWork(){
        work.doWork();
    }
}
