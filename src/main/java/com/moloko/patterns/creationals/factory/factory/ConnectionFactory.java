package main.java.com.moloko.patterns.creationals.factory.factory;

import main.java.com.moloko.patterns.creationals.factory.authorization.Authorization;

/**
 * @author Jack Milk
 */
public interface ConnectionFactory {
    Authorization getAccess();
}
