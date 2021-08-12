package main.java.com.moloko.patterns.structural.facade;

/**
 * @author Jack Milk
 */
public class Stuff {
    public void stuffJobInRuntime(ExecutionOrderToPizza order){
        if (order.isExecutionOrder()) {
            System.out.println("Chef execute order...");
        } else {
            System.out.println("Chef makes slicing");
        }
    }
}
