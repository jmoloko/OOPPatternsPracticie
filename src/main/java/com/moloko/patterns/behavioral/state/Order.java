package main.java.com.moloko.patterns.behavioral.state;

/**
 * @author Jack Milk
 */
public class Order {
    private State state;

    public Order() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
