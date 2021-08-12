package main.java.com.moloko.patterns.behavioral.state;

/**
 * @author Jack Milk
 */
public class GetNewState implements State{
    @Override
    public void changeState(Order order) {
        System.out.println("Received a new order!");
        order.setState(this);
    }

    @Override
    public String toString() {
        return "New order";
    }
}
