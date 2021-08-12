package main.java.com.moloko.patterns.behavioral.chain.notifier;

/**
 * @author Jack Milk
 */
public abstract class Notifier {
    private Notifier next;

    public Notifier linkNext(Notifier next){
        this.next = next;
        return next;
    }

    public abstract boolean check();

    protected boolean checkNext(){
        if (next != null) return true;
        return next.check();
    }
}
