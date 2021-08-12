package main.java.com.moloko.patterns.creationals.singleton;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(DBConnection.getConnect().toString());
        System.out.println(DBConnection.getConnect().toString());
        System.out.println(DBConnection.getConnect().toString());
        DBConnection.getConnect().showConnectStatus();
    }
}
