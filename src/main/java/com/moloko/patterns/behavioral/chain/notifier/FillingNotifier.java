package main.java.com.moloko.patterns.behavioral.chain.notifier;

/**
 * @author Jack Milk
 */
public class FillingNotifier extends Notifier{
    private final int minFilling = 20;
    private int amount;

    public FillingNotifier(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean check() {
        if (amount < minFilling) {
            System.out.println("Slicing Filling!!!");
            return false;
        }
        System.out.println("filling: OK!");
        return checkNext();
    }
}
