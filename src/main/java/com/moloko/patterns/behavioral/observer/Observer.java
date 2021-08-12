package main.java.com.moloko.patterns.behavioral.observer;

import java.util.List;

/**
 * @author Jack Milk
 */
public interface Observer {
    public void handleEvent(List<String> orders);
}
