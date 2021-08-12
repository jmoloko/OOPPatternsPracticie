package main.java.com.moloko.patterns.behavioral.chain.notifier;

/**
 * @author Jack Milk
 */
public class SauceNotifier extends Notifier{
    private final int minSauce = 10;
    private int amount;

    public SauceNotifier(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean check() {
        if (amount < minSauce) {
            System.out.println("Make Sauce!!!");
            return false;
        }
        System.out.println("sauce: OK!");
        return checkNext();
    }
}
