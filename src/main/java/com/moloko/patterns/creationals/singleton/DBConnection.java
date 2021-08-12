package main.java.com.moloko.patterns.creationals.singleton;

/**
 * @author Jack Milk
 */
public class DBConnection {
    private static DBConnection dbConnection;
    private static boolean connect = false;

    public static synchronized DBConnection getConnect() {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

    private DBConnection() {
        connect = true;
    }

    public void showConnectStatus(){
        if (connect) System.out.println("Database connection");
        else System.out.println("NO database connection");
    }
}
