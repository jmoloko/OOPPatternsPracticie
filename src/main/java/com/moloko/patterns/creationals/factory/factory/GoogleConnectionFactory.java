package main.java.com.moloko.patterns.creationals.factory.factory;

import main.java.com.moloko.patterns.creationals.factory.authorization.Authorization;
import main.java.com.moloko.patterns.creationals.factory.authorization.GoogleAuthorization;

/**
 * @author Jack Milk
 */
public class GoogleConnectionFactory implements ConnectionFactory {
    @Override
    public Authorization getAccess() {
        return new GoogleAuthorization();
    }
}
