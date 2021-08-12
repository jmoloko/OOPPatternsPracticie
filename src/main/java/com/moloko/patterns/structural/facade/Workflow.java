package main.java.com.moloko.patterns.structural.facade;

/**
 * @author Jack Milk
 */
public class Workflow {
    Stuff stuff = new Stuff();
    Cooking cook = new Cooking();
    ExecutionOrderToPizza order = new ExecutionOrderToPizza();

    public void workInKitchen(){
        cook.runCook();
        order.finishExecutionOrder();
        stuff.stuffJobInRuntime(order);
    }
}
