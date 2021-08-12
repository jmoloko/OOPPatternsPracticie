package main.java.com.moloko.patterns.behavioral.chain.notifier;

/**
 * @author Jack Milk
 */
public class DoughNotifier extends Notifier{
    private final int minDough = 20;
    private int amount;

    public DoughNotifier(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean check() {
        if (amount < minDough) {
            System.out.println("Make Dough!!!");
            return false;
        }
        System.out.println("dough: OK!");
        return checkNext();
    }
}
