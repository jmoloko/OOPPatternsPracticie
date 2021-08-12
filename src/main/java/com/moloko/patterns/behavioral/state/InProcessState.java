package main.java.com.moloko.patterns.behavioral.state;

/**
 * @author Jack Milk
 */
public class InProcessState implements State{
    @Override
    public void changeState(Order order) {
        System.out.println("Order in progress...");
        order.setState(this);
    }

    @Override
    public String toString() {
        return "Progress...";
    }
}
