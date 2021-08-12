package main.java.com.moloko.patterns.creationals.factory;

import main.java.com.moloko.patterns.creationals.factory.authorization.Authorization;
import main.java.com.moloko.patterns.creationals.factory.factory.ConnectionFactory;
import main.java.com.moloko.patterns.creationals.factory.factory.GithubConnectionFactory;
import main.java.com.moloko.patterns.creationals.factory.factory.GoogleConnectionFactory;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        ConnectionFactory authFactory = getAuthBySpeciality("google");
        Authorization auth = authFactory.getAccess();
        auth.getAuthorization();
    }

    public static ConnectionFactory getAuthBySpeciality(String account) {
        if (account.equalsIgnoreCase("github")){
            return new GithubConnectionFactory();
        } else if (account.equalsIgnoreCase("google")){
            return new GoogleConnectionFactory();
        } else {
            throw new RuntimeException(account + " id unknown account");
        }
    }
}
