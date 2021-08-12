package main.java.com.moloko.patterns.behavioral.state;

/**
 * @author Jack Milk
 */
public class IsReadyState implements State{

    @Override
    public void changeState(Order order) {
        System.out.println("Order is ready!");
        order.setState(this);
    }

    @Override
    public String toString() {
        return "Order ready";
    }
}
