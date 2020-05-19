package lesson10.abstactfirstexample;

public abstract class DbProvider {

    private String dbHost;

  //  public DbProvider(String dbHost) {
    //    this.dbHost = dbHost;
    //}

    abstract void connectToDb();

    abstract void disconnectFromDb();

    void printDbHost() {
        System.out.println("DB host is" + dbHost);
    }
}