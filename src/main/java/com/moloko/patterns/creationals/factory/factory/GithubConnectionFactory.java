package main.java.com.moloko.patterns.creationals.factory.factory;

import main.java.com.moloko.patterns.creationals.factory.authorization.Authorization;
import main.java.com.moloko.patterns.creationals.factory.authorization.GitHubAuthorization;

/**
 * @author Jack Milk
 */
public class GithubConnectionFactory implements ConnectionFactory {
    @Override
    public Authorization getAccess() {
        return new GitHubAuthorization();
    }
}
