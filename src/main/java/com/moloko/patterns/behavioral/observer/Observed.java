package main.java.com.moloko.patterns.behavioral.observer;

/**
 * @author Jack Milk
 */
public interface Observed {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
