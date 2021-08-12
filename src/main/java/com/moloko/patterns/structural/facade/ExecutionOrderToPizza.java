package main.java.com.moloko.patterns.structural.facade;

/**
 * @author Jack Milk
 */
public class ExecutionOrderToPizza {
    private boolean executionOrder;

    public boolean isExecutionOrder() {
        return executionOrder;
    }

    public void startExecutionOrder(){
        System.out.println("Execution order is active");
        executionOrder = true;
    }

    public void finishExecutionOrder(){
        System.out.println("Execution order completed");
        executionOrder = false;
    }
}
