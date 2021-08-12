package main.java.com.moloko.patterns.behavioral.chain;

import main.java.com.moloko.patterns.behavioral.chain.notifier.DoughNotifier;
import main.java.com.moloko.patterns.behavioral.chain.notifier.FillingNotifier;
import main.java.com.moloko.patterns.behavioral.chain.notifier.Notifier;
import main.java.com.moloko.patterns.behavioral.chain.notifier.SauceNotifier;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        Notifier doughNotifier = new DoughNotifier(25);
        Notifier sauceNotifier = new SauceNotifier(5);
        Notifier fillingNotifier = new FillingNotifier(10);

        Notifier notifier = doughNotifier.linkNext(sauceNotifier).linkNext(fillingNotifier);
        notifier.check();

    }
}
