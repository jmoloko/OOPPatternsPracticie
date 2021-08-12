package main.java.com.moloko.patterns.behavioral.memento;

/**
 * @author Jack Milk
 */
public class Memento {

    private String state;

    public String getState() {
        return state;
    }

    public Memento(String state) {
        this.state = state;
    }
}
