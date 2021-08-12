package main.java.com.moloko.patterns.creationals.factory.authorization;

/**
 * @author Jack Milk
 */
public class GoogleAuthorization implements Authorization{

    @Override
    public void getAuthorization() {
        System.out.println("Connect... We got access via google!");
    }
}
