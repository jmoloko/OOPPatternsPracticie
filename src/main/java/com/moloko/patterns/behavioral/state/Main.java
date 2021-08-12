package main.java.com.moloko.patterns.behavioral.state;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        GetNewState newOrder = new GetNewState();
        newOrder.changeState(order);
        System.out.println(order.getState().toString());

        InProcessState process = new InProcessState();
        process.changeState(order);
        System.out.println(order.getState().toString());

        IsReadyState ready = new IsReadyState();
        ready.changeState(order);
        System.out.println(order.getState().toString());

    }
}
